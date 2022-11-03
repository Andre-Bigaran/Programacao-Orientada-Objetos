package com.mycompany.conta;
public class Pessoa {
    private String titular;
    private int cpf;
    private int idade;

    public Pessoa(String titular, int cpf, int idade) {
        this.titular = titular;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public int getCpf() {

        return cpf;
    }

    public void setCpf(int cpf) {

        this.cpf = cpf;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }
    
    
}
