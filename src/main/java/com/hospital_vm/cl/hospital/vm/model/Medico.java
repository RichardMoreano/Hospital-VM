package com.hospital_vm.cl.hospital.vm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "medico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 13, nullable = false)
    private String run;

    @Column(nullable = false)
    private String nombre_completo;

    @Column(nullable = false)
    private String especialidad;

    @Column(nullable = false)
    private String jefe_turno;
}
