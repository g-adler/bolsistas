package org.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bolsistas")
public class BolsistaEntity  {


    @Id
    @Column(name = "numeroId")
    private String numeroIdentificador;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tipoId")
    private String tipoIdentificador;

    @Column(name = "dataCadastro")
    private Date dataCadastro;

    @Column(name = "codBanco")
    private String codigoBanco;

    @Column(name = "numAgencia")
    private String numeroAgencia;

    @Column(name = "numConta")
    private String numeroConta;

    public BolsistaEntity(String nome, String tipoId, String numId, String codBanco, String numAgencia, String numConta  ){
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
        return numeroIdentificador;
    }

    public void setNumIdentificador(String numIdentificador) {
        this.numeroIdentificador = numIdentificador;
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
