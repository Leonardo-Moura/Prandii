package com.treinamento.prandii.item.domain;

import com.treinamento.prandii.mesa.domain.Mesa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_ITEM", sequenceName = "SEQ_ITEM", allocationSize = 1)
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ITEM")
    @Column(name = "COD_ITEM")
    private Long id;

    @Column
    private Long idProduto;

    @Column
    private Long quantidade;

    @Column
    private Boolean cancelado = false;

    @ManyToOne
    private Mesa mesa;

}
