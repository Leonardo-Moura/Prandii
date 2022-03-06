package com.treinamento.prandii.mesa.repository;

import com.treinamento.prandii.mesa.domain.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

    @Query ("SELECT CASE WHEN COUNT(id) > 0 THEN true ELSE false END FROM Mesa m WHERE upper(m.identificacao) = upper(:identificacao) AND m.aberto = true")
    boolean estaAberta(String identificacao);
}
