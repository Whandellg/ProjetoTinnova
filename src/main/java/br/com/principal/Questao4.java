package br.com.principal;

import br.com.questoes.Multiplos;

public class Questao4 {
    public static void main(String[] args) {

        int x = 3;
        int z = 5;


        Multiplos multiplos = new Multiplos();
        int m1 = multiplos.multiplos(multiplos.setX(x), multiplos.setZ(z));


        System.out.println("A soma dos multiplos de X e Z abaixo de 10, é: " + m1);

    }
}
