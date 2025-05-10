package com.hospital_vm.cl.hospital.vm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "atencion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date fechaAtencion;

    @Column(nullable = false)
    private String HoraAtencion;

    @Column(nullable = false)
    private Double costo;

    @ManyToOne
    @JoinColumn(name = "id_paciente_fk", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico_fk", nullable = false)
    private Medico medico;

    @Column(nullable = false)
    private String comentario;

}
