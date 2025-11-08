package com.example.festivos.service;

import com.example.festivos.domain.Festivo;
import com.example.festivos.repository.FestivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestivoService {

    private final FestivoRepository festivoRepository;

    public FestivoService(FestivoRepository festivoRepository) {
        this.festivoRepository = festivoRepository;
    }

    public List<Festivo> listarTodos() {
        return festivoRepository.findAll();
    }

    public Optional<Festivo> buscarPorId(Long id) {
        return festivoRepository.findById(id);
    }

    public Festivo guardar(Festivo festivo) {
        return festivoRepository.save(festivo);
    }

    public Festivo actualizar(Long id, Festivo festivoActualizado) {
        return festivoRepository.findById(id)
                .map(f -> {
                    f.setNombre(festivoActualizado.getNombre());
                    f.setDia(festivoActualizado.getDia());
                    f.setMes(festivoActualizado.getMes());
                    f.setDiasPascua(festivoActualizado.getDiasPascua());
                    f.setPais(festivoActualizado.getPais());
                    f.setTipo(festivoActualizado.getTipo());
                    return festivoRepository.save(f);
                }).orElseThrow(() -> new RuntimeException("Festivo no encontrado"));
    }

    public void eliminar(Long id) {
        festivoRepository.deleteById(id);
    }

    public List<Festivo> listarPorPais(Long idPais) {
        return festivoRepository.findByPaisId(idPais);
    }

    public boolean esFestivo(Long idPais, int dia, int mes) {
        return festivoRepository.findByPaisIdAndMes(idPais, mes)
                .stream()
                .anyMatch(f -> f.getDia() == dia);
    }
}
