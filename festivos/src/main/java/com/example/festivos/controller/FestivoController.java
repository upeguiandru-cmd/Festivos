package com.example.festivos.controller;

import com.example.festivos.domain.Festivo;
import com.example.festivos.service.FestivoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festivos")
public class FestivoController {

    private final FestivoService festivoService;

    public FestivoController(FestivoService festivoService) {
        this.festivoService = festivoService;
    }

    // ✅ Listar todos los festivos
    @GetMapping
    public List<Festivo> listarTodos() {
        return festivoService.listarTodos();
    }

    // ✅ Buscar festivo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Festivo> buscarPorId(@PathVariable Long id) {
        return festivoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ✅ Crear nuevo festivo
    @PostMapping
    public Festivo crear(@RequestBody Festivo festivo) {
        return festivoService.guardar(festivo);
    }

    // ✅ Actualizar festivo
    @PutMapping("/{id}")
    public ResponseEntity<Festivo> actualizar(@PathVariable Long id, @RequestBody Festivo festivo) {
        try {
            return ResponseEntity.ok(festivoService.actualizar(id, festivo));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // ✅ Eliminar festivo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        festivoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    // ✅ Listar todos los festivos de un país
    @GetMapping("/pais/{idPais}")
    public List<Festivo> listarPorPais(@PathVariable Long idPais) {
        return festivoService.listarPorPais(idPais);
    }

    // ✅ Verificar si una fecha es festiva (día y mes)
    @GetMapping("/verificar")
    public ResponseEntity<String> esFestivo(
            @RequestParam Long idPais,
            @RequestParam int dia,
            @RequestParam int mes) {

        boolean esFestivo = festivoService.esFestivo(idPais, dia, mes);

        if (esFestivo) {
            return ResponseEntity.ok("🎉 La fecha " + dia + "/" + mes + " es festiva en ese país.");
        } else {
            return ResponseEntity.ok("❌ La fecha " + dia + "/" + mes + " NO es festiva en ese país.");
        }
    }
}
