package com.treinamento.prandii.mesa.validator;

import com.treinamento.prandii.mesa.model.input.AbrirMesaInput;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MesaValidator {

    @Resource
    private MesaValidations validations;

    public void validateAbrirMesa(AbrirMesaInput input) {
        validations.validaSeNaoEstaAberta(input.getIdentificacao());
    }

}
