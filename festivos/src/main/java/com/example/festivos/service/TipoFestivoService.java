package com.example.festivos.service;

import com.example.festivos.domain.TipoFestivo;
import com.example.festivos.repository.TipoFestivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoFestivoService {

    private final TipoFestivoRepository tipoFestivoRepository;

    public TipoFestivoService(TipoFestivoRepository tipoFestivoRepository) {
        this.tipoFestivoRepository = tipoFestivoRepository;
    }

    public List<TipoFestivo> listarTodos() {
        return tipoFestivoRepository.findAll();
    }

    public Optional<TipoFestivo> buscarPorId(Long id) {
        return tipoFestivoRepository.findById(id);
    }

    public TipoFestivo guardar(TipoFestivo tipoFestivo) {
        return tipoFestivoRepository.save(tipoFestivo);
    }

    public TipoFestivo actualizar(Long id, TipoFestivo tipoFestivoActualizado) {
        return tipoFestivoRepository.findById(id)
                .map(tipo -> {
                    tipo.setTipo(tipoFestivoActualizado.getTipo());
                    return tipoFestivoRepository.save(tipo);
                })
                .orElseThrow(() -> new RuntimeException("Tipo de festivo no encontrado con ID: " + id));
    }

    public void eliminar(Long id) {
        tipoFestivoRepository.deleteById(id);
    }
}
