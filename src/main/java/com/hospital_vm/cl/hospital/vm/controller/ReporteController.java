package com.hospital_vm.cl.hospital.vm.controller;

import com.hospital_vm.cl.hospital.vm.model.Atencion;
import com.hospital_vm.cl.hospital.vm.model.Medico;
import com.hospital_vm.cl.hospital.vm.model.Paciente;
import com.hospital_vm.cl.hospital.vm.service.AtencionService;
import com.hospital_vm.cl.hospital.vm.service.MedicoService;
import com.hospital_vm.cl.hospital.vm.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reporte")
public class ReporteController {

    private AtencionService atencionService;
    private PacienteService pacienteService;
    private MedicoService medicoService;

    @GetMapping("/atenciones/paciente/{id}")
    public ResponseEntity<List<Atencion>> getAtencionesPorPaciente(@PathVariable Long id) {
        Paciente paciente = pacienteService.findAll().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
        return ResponseEntity.ok(atencionService.getAtencionesPorPaciente(paciente));
    }
    @GetMapping("/atenciones/medico/{id}")
    public ResponseEntity<List<Atencion>> getAtencionesPorMedico(@PathVariable Long id) {
        Medico medico = medicoService.getAllMedicos().stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
        return ResponseEntity.ok(atencionService.getAtencionesPorMedico(medico));
    }
    @GetMapping("/atenciones/fecha")
    public ResponseEntity<List<Atencion>> getAtencionesPorFecha(@RequestParam Date fecha) {
        return ResponseEntity.ok(atencionService.getAtencionesPorFecha(fecha));
    }
}
