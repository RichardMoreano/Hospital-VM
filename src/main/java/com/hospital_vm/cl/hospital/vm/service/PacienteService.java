package com.hospital_vm.cl.hospital.vm.service;

import com.hospital_vm.cl.hospital.vm.model.Paciente;
import com.hospital_vm.cl.hospital.vm.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente findById(long id){
        return pacienteRepository.findById(id).get();
    }

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public void delete(long id){
        pacienteRepository.deleteById(id);
    }
}
