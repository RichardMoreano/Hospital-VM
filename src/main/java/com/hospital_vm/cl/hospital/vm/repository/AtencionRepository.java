package com.hospital_vm.cl.hospital.vm.repository;

import com.hospital_vm.cl.hospital.vm.model.Atencion;
import com.hospital_vm.cl.hospital.vm.model.Medico;
import com.hospital_vm.cl.hospital.vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AtencionRepository extends JpaRepository<Atencion, Long> {
    List<Atencion> findByPaciente(Paciente paciente);
    List<Atencion> findByMedico(Medico medico);
    List<Atencion> findByFechaAtencion(Date fechaAtencion);
}
