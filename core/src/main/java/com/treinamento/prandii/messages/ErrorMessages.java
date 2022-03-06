package com.treinamento.prandii.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessages implements Messages {

    MESA_ABERTA("A mesa com identificação %s já está aberta");

    private final String message;
}
