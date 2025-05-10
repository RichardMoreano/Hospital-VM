package com.hospital_vm.cl.hospital.vm.controller;

import com.hospital_vm.cl.hospital.vm.model.Paciente;
import com.hospital_vm.cl.hospital.vm.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> listar(){
        List<Paciente> pacientes = pacienteService.findAll();
        if(pacientes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pacientes);
    }

    @PostMapping
    public ResponseEntity<Paciente> guardar(@RequestBody Paciente paciente){
        Paciente prductoNuevo = pacienteService.save(paciente);
        return ResponseEntity.status(HttpStatus.OK).body(prductoNuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscar(@PathVariable Integer id){
        try {
            Paciente paciente = pacienteService.findById(id);
            return ResponseEntity.ok(paciente);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> actualizar(@PathVariable Long id, @RequestBody Paciente paciente){
        try {
            Paciente pac = pacienteService.findById(id);
            pac.setId(id);
            pac.setNombre(paciente.getNombre());
            pac.setApellido(paciente.getApellido());
            pac.setFecha_nacimiento(paciente.getFecha_nacimiento());
            pac.setCorreo(paciente.getCorreo());

            pacienteService.save(pac);
            return ResponseEntity.ok(paciente);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        try {
            pacienteService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
