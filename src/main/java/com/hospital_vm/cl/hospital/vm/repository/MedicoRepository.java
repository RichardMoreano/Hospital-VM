package com.hospital_vm.cl.hospital.vm.repository;

import com.hospital_vm.cl.hospital.vm.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findAll();
}
