package com.treinamento.prandii.mesa.domain;

import com.treinamento.prandii.item.domain.Item;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Entity
@SequenceGenerator(name = "SEQ_MESA", sequenceName = "SEQ_MESA", allocationSize = 1)
@Getter
@Setter
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MESA")
    @Column(name = "COD_MESA")
    private Long id;

    @Column
    private String identificacao;

    @Column
    private Boolean aberto = true;

    @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL, orphanRemoval = true)
    @Setter(AccessLevel.PRIVATE)
    private List<Item> itens;

}
