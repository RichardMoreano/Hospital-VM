package com.hospital_vm.cl.hospital.vm.repository;

import com.hospital_vm.cl.hospital.vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findAll();
}
