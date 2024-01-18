package org.example.backend.model.dto;

import java.util.Date;

public class Bolsista {

    private String nome;

    private String tipoIdentificador;

    private String numIdentificador;

    private Date dataCadastro;

    public Bolsista(String nome, String tipoId, String numId ){
        setDataCadastro();
        this.setNome(nome);
        this.setTipoIdentificador(tipoId);
        this.setNumIdentificador(numId);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }

    public String getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(String numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    private void setDataCadastro() {
        this.dataCadastro = new Date();
    }

}
