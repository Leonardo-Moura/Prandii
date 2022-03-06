package com.treinamento.prandii.mesa.validator;

import com.treinamento.prandii.mesa.model.input.AbrirMesaInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MesaValidatorTest {

    @InjectMocks
    private MesaValidator validator;

    @Mock
    private MesaValidations validations;

    @Test
    void validateAbrirMesa() {
        String identificacao = "NOVA MESA";

        validator.validateAbrirMesa(new AbrirMesaInput(identificacao));

        verify(validations).validaSeNaoEstaAberta(identificacao);
    }

}