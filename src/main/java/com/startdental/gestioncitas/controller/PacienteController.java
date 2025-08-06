package com.startdental.gestioncitas.controller;

import com.startdental.gestioncitas.model.Paciente;
import com.startdental.gestioncitas.service.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Paciente> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Paciente guardar(@RequestBody Paciente paciente) {
        return service.guardar(paciente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
