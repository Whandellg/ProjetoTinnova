package br.com.principal;

import br.com.questoes.Fatorial;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner w = new Scanner(System.in);
		System.out.println("Insira um numero");
		int num = w.nextInt();

		Fatorial f = new Fatorial();
		f.fatorial(num);
    }
}
