package com.startdental.gestioncitas.repository;

import com.startdental.gestioncitas.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
