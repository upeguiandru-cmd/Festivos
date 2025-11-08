package com.example.festivos.repository;

import com.example.festivos.domain.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FestivoRepository extends JpaRepository<Festivo, Long> {

    List<Festivo> findByPaisId(Long idPais);

    List<Festivo> findByPaisIdAndMes(Long idPais, int mes);
}
