package com.treinamento.prandii.mesa.service;

import com.treinamento.prandii.mesa.model.input.AbrirMesaInput;
import com.treinamento.prandii.mesa.repository.MesaRepository;
import com.treinamento.prandii.mesa.validator.MesaValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MesaServiceTest {

    @InjectMocks
    private MesaService service;

    @Mock
    private MesaRepository repository;

    @Mock
    private MesaValidator validator;

    @Test
    void abrirMesa() {
        AbrirMesaInput input = new AbrirMesaInput("NOVA MESA");

        service.abrirMesa(input);

        verify(validator).validateAbrirMesa(input);
        verify(repository).save(any());
    }

}