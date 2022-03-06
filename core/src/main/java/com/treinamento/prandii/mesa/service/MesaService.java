package com.treinamento.prandii.mesa.service;

import com.treinamento.prandii.mesa.domain.Mesa;
import com.treinamento.prandii.mesa.model.input.AbrirMesaInput;
import com.treinamento.prandii.mesa.repository.MesaRepository;
import com.treinamento.prandii.mesa.validator.MesaValidator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.Valid;

@Service
public class MesaService {

    @Resource
    private MesaRepository repository;

    @Resource
    private MesaValidator validator;

    @Transactional
    public void abrirMesa(@Valid AbrirMesaInput input) {
        validator.validateAbrirMesa(input);

        Mesa mesa = new Mesa(input.getIdentificacao());


        repository.save(mesa);
    }

}
