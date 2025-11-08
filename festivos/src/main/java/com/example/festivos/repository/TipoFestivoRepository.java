package com.example.festivos.repository;

import com.example.festivos.domain.TipoFestivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoFestivoRepository extends JpaRepository<TipoFestivo, Long> {
}
