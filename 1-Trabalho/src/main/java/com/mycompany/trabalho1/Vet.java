package com.mycompany.trabalho1;

public class Vet <T> {
    int size;
    int [] vet;

    public Vet(int size) {
        this.size = size;
        vet = new int [this.size];
    }

    public void insertion(int value){
        int i = 0;
        int k = 1;
        while(i < vet.length && k != i){
            if (vet[i] == 0) {
                vet[i] = value;
                k--;
            } else {
                i++;
                k++;
            }
        }

        if (i >= vet.length) {
            System.out.println("Não tem espaço para o valor " + value + " no vetor!");
        }

    }

 
   public void showVet(){
       for (int j : this.vet) {
           System.out.println(j);
       }
   }
   

   
   public void search (int search){
       for (int i = 0; i < this.size; i++) {
           if (i == search) {
               System.out.println("O valor na posição " + search + " é igual a:" + vet[i]);
           }
       }
   }

    public void remove (int position){

        for (int k = position; k < this.size; k++) {
            if (k < (this.size-1)) {
                vet[k] = vet[k+1];

            }else{
                vet[k] = 0;
            }
        }
    }
   
}
