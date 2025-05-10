package com.hospital_vm.cl.hospital.vm.service;

import com.hospital_vm.cl.hospital.vm.model.Medico;
import com.hospital_vm.cl.hospital.vm.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private MedicoRepository medicoRepository;
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }
}
