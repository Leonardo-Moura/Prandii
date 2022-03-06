package com.treinamento.prandii.mesa.validator;

import com.treinamento.prandii.mesa.repository.MesaRepository;
import com.treinamento.prandii.messages.ErrorMessages;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MesaValidationsTest {

    @InjectMocks
    private MesaValidations validations;

    @Mock
    private MesaRepository repository;

    @Test
    void validaSeNaoEstaAbertoQuandoIdentificacaoNaoEstaAberta() {
        when(repository.estaAberta("NOVA MESA")).thenReturn(false);

        assertThatCode(() -> validations.validaSeNaoEstaAberta("NOVA MESA"))
                .doesNotThrowAnyException();
    }

    @Test
    void validaSeNaoEstaAbertoQuandoIdentificacaoJaEstaAberta() {
        String identificacao = "NOVA MESA";

        when(repository.estaAberta(identificacao)).thenReturn(true);

        assertThatCode(() -> validations.validaSeNaoEstaAberta(identificacao))
                .hasMessage(ErrorMessages.MESA_ABERTA.format(identificacao));
    }

}