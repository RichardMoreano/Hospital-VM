package com.hospital_vm.cl.hospital.vm.model;

import com.hospital_vm.cl.hospital.vm.service.PacienteService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "ficha_paciente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ficha_paciente {

    @ManyToOne
    @JoinColumn(name = "id_paciente_fk", nullable = false)
    private Paciente paciente;

    @Column(length = 100, nullable = false)
    private String datos_personales;

    @Column(length = 100, nullable = false)
    private String datos_personales2;

    @Column(length = 100, nullable = false)
    private String datos_personales3;

    @Column(length = 100, nullable = false)
    private String datos_personales4;

    @Column(length = 100, nullable = false)
    private String datos_personales5;


}
