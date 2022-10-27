package com.mycompany.trabalho1;
public class Executor {
    
    public static void main(String[] args) {
        Vet vet = new Vet(7);

        vet.insertion(1);
        vet.insertion(2);
        vet.insertion(3);
        vet.insertion(4);
        vet.insertion(5);
        vet.insertion(6);
        vet.insertion(7);
        vet.insertion(8);
        vet.showVet();

        vet.remove(0);
        vet.showVet();

        vet.remove(1);
        vet.showVet();

        vet.remove(3);
        vet.showVet();

        vet.insertion(9);
        vet.showVet();

        vet.search(1);
        vet.search(3);
        
    }
}
