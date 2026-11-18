package com.seduc2.gta.entitys;

import jakarta.persistence.*;

@Entity
public class Carros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomeveiculo;
    private String marca;
    private String categoria;
    private String urldaimagem;
    private String descricao;

    public Carros() {
    }

    public Carros(int id, String nomeveiculo, String marca,
                  String categoria, String urldaimagem, String descricao) {
        this.id = id;
        this.nomeveiculo = nomeveiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.urldaimagem = urldaimagem;
        this.descricao = descricao;
    }

    public Carros(String nomeveiculo, String marca, String categoria,
                  String urldaimagem, String descricao) {
        this.nomeveiculo = nomeveiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.urldaimagem = urldaimagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeveiculo() {
        return nomeveiculo;
    }

    public void setNomeveiculo(String nomeveiculo) {
        this.nomeveiculo = nomeveiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrldaimagem() {
        return urldaimagem;
    }

    public void setUrldaimagem(String urldaimagem) {
        this.urldaimagem = urldaimagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

