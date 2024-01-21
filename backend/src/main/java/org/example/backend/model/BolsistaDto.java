package org.example.backend.model;

import java.util.Date;

public class BolsistaDto {

    private String nome;

    private String tipoIdentificador;

    private String numIdentificador;

    private Date dataCadastro;

    private String codigoBanco;

    private String numeroAgencia;

    private String numeroConta;

    public BolsistaDto(String nome, String tipoId, String numId, String codBanco, String numAgencia, String numConta  ){
        setDataCadastro();
        this.setNome(nome);
        this.setTipoIdentificador(tipoId);
        this.setNumIdentificador(numId);
        this.setCodigoBanco(codBanco);
        this.setNumeroAgencia(numAgencia);
        this.setNumeroConta(numConta);
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

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
