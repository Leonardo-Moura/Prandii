package com.treinamento.prandii.mesa.validator;

import com.treinamento.prandii.exception.ValidationException;
import com.treinamento.prandii.mesa.repository.MesaRepository;
import com.treinamento.prandii.messages.ErrorMessages;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MesaValidations {

    @Resource
    private MesaRepository repository;

    public void validaSeNaoEstaAberta(String identificacao) {
        if (repository.estaAberta(identificacao)) {
            throw new ValidationException(ErrorMessages.MESA_ABERTA.format(identificacao));
        }
    }

}
