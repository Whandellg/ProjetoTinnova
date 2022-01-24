package br.com.questoes;

public class BubbleSort {

    int aux = 0;
    int num = 0;

    public int bubbleSort(int[] vetorDesordenado){
        System.out.println("(O vetor Desordenado é:");
    	for(num = 0; num<8; num++){
        System.out.println(" "+vetorDesordenado[num]);
    }

	for(num = 0; num<8; num++){
        for(int i = 0; i<7; i++){
            if(vetorDesordenado[i] > vetorDesordenado[i + 1]){
                aux = vetorDesordenado[i];
                vetorDesordenado[i] = vetorDesordenado[i+1];
                vetorDesordenado[i+1] = aux;
            }
        }
    }

	System.out.println("O vetor Ordenado é :");
	for(num = 0; num<8; num++){
        System.out.println(" "+vetorDesordenado[num]);
    }
        return 0;
    }
}