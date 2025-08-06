package com.startdental.gestioncitas.service;

import com.startdental.gestioncitas.model.Paciente;
import com.startdental.gestioncitas.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Paciente guardar(Paciente paciente) {
        return repository.save(paciente);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
