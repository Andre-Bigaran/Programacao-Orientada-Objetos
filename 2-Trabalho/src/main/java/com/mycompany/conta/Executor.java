package com.mycompany.conta;

import static java.lang.System.out;

public class Executor {

    public static void main(String[] args) {
        Conta account = new Conta();

        Conta contaPrimaria = new Conta("André",499293382, 23, 53992, 111323.0);
        out.println(contaPrimaria.getTitular());
        out.println("CPF: " + contaPrimaria.getCpf());
        out.println("Idade: " + contaPrimaria.getIdade());
        out.println("Numero da conta: " + contaPrimaria.getDestinatario());
        out.println("Saldo: " + contaPrimaria.getSaldo());

        out.println();

        Conta contaSecundaria = new Conta("Vergilio", 433142993, 52, 3042, 100.000);
        out.println("Nome do titular: " + contaSecundaria.getTitular());
        out.println("CPF: " + contaSecundaria.getCpf());
        out.println("Idade: " + contaSecundaria.getIdade());
        out.println("Numero da conta: " + contaSecundaria.getDestinatario());
        out.println("Saldo: " + contaSecundaria.getSaldo());
        
        out.println();
        

        account.saque(121, contaPrimaria);
        account.deposito(354, contaSecundaria);
        contaSecundaria.trasnferencia(contaPrimaria, 200);
        
        out.println();
        out.println("\n" +
                "Contas após os procedimentos realizados");

        out.println(contaPrimaria.getTitular() );
        out.println("CPF: " + contaPrimaria.getCpf());
        out.println("Age: " + contaPrimaria.getIdade());
        out.println("Account Number: " + contaPrimaria.getDestinatario());
        out.println("Balance: " + contaPrimaria.getSaldo());
        out.println();
        out.println("Nome do titular: " + contaSecundaria.getTitular());
        out.println("CPF: " + contaSecundaria.getCpf());
        out.println("Idade: " + contaSecundaria.getIdade());
        out.println("Numero da conta: " + contaSecundaria.getDestinatario());
        out.println("Saldo: " + contaSecundaria.getSaldo());

out.println();
        out.println("Processo realizado com sucesso! Deseja iniciar novo processo? ");
        out.println("1-Sim \n 2-Não");

    }
}
