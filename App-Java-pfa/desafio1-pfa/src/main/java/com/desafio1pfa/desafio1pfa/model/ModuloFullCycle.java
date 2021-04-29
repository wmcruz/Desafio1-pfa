package com.desafio1pfa.desafio1pfa.model;

import javax.persistence.*;

@Entity
@Table(name = "modulos_full_cycle")
public class ModuloFullCycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}