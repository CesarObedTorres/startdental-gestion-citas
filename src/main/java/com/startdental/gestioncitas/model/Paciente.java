package com.startdental.gestioncitas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String telefono;
    private String alergias;
    private String historialDental;
}
