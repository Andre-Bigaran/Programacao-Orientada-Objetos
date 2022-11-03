package com.mycompany.conta;

public class Conta extends Pessoa {
    public Conta(String titular, int cpf, int idade, int numeroConta, double saldo){

        super(titular, cpf, idade);
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }
private int numeroConta;
private double saldo;

    public Conta() {

    }


    public void saque (double valor, Conta banco){
        if (valor > 0) {
            if (banco.saldo < valor) {
                System.out.println("\n" +
                        "Não é possível sacar esse valor");
                
            } else {
                banco.saldo = banco.saldo - valor;
                System.out.println("\n" +
                        "Retirada realizada com sucesso!");
               
            }
        } else {
            System.out.println(" Não é possível sacar esse valor");
        }
    }
    
    public void deposito(double valor, Conta banco){
        
            banco.saldo = banco.saldo + valor;
            System.out.println("\n" +
                    "Depósito feito com sucesso!");
        
        
    }
    
    public void trasnferencia(Conta destinatario, double valor) {
        if(valor > 0  && valor <= this.saldo) {
            destinatario.saldo += valor;
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("\n" +
                    "Não é possível transferir valores negativos ou iguais a 0.");
        }
    }

    public int getDestinatario(){
        return this.numeroConta;
    }

    public void setDestinatario(int numeroConta){

        this.numeroConta = numeroConta;
    }
    public double getSaldo(){

        return this.saldo;
    }

    public double setSaldo(double saldo){
        this.saldo = saldo;
        return saldo;
    }
 
}
