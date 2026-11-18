
package com.seduc2.gta.entitys;

import jakarta.persistence.*;

@Entity
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomemissao;
    private String local;
    private String dificuldade;
    private String urldaimagem;
    private String descricaoobjetivo;

    public Missoes() {
    }

    public Missoes(int id, String nomemissao, String local,
                   String dificuldade, String urldaimagem,
                   String descricaoobjetivo) {
        this.id = id;
        this.nomemissao = nomemissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.urldaimagem = urldaimagem;
        this.descricaoobjetivo = descricaoobjetivo;
    }

    public Missoes(String nomemissao, String local,
                   String dificuldade, String urldaimagem,
                   String descricaoobjetivo) {
        this.nomemissao = nomemissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.urldaimagem = urldaimagem;
        this.descricaoobjetivo = descricaoobjetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomemissao() {
        return nomemissao;
    }

    public void setNomemissao(String nomemissao) {
        this.nomemissao = nomemissao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getUrldaimagem() {
        return urldaimagem;
    }

    public void setUrldaimagem(String urldaimagem) {
        this.urldaimagem = urldaimagem;
    }

    public String getDescricaoobjetivo() {
        return descricaoobjetivo;
    }

    public void setDescricaoobjetivo(String descricaoobjetivo) {
        this.descricaoobjetivo = descricaoobjetivo;
    }
}

