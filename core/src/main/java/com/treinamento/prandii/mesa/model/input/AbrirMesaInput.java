package com.treinamento.prandii.mesa.model.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AbrirMesaInput {

    @NotBlank(message = "{com.treinamento.prandii.identificacao.mesa.NotBlank}")
    private String identificacao;


}
