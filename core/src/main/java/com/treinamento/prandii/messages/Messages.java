package com.treinamento.prandii.messages;

public interface Messages {

    String getMessage();

    default String format(Object ...args) {
        return String.format(this.getMessage(), args);
    }

}
