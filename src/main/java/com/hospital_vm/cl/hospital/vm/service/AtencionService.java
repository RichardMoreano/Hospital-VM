package com.hospital_vm.cl.hospital.vm.service;

import com.hospital_vm.cl.hospital.vm.model.Atencion;
import com.hospital_vm.cl.hospital.vm.model.Medico;
import com.hospital_vm.cl.hospital.vm.model.Paciente;
import com.hospital_vm.cl.hospital.vm.repository.AtencionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class AtencionService {

    private AtencionRepository atencionRepository;

    public List<Atencion> getAtencionesPorPaciente(Paciente paciente) {
        return atencionRepository.findByPaciente(paciente);
    }
    public List<Atencion> getAtencionesPorMedico(Medico medico) {
        return atencionRepository.findByMedico(medico);
    }
    public List<Atencion> getAtencionesPorFecha(Date fecha) {
        return atencionRepository.findByFechaAtencion(fecha);
    }
}
