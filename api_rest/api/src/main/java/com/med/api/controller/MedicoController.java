package com.med.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.med.api.medico.DadosCadastroMedico;
import com.med.api.medico.Medico;
import com.med.api.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})


public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;
    
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        medicoRepository.save(new Medico(dados));

    }
}
