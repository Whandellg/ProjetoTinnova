package br.com.questoes;

public class Fatorial {

    public int fatorial(int num){
        int fatorial = 1;
        int cont = 1;

        do{
            for(int i = 1;i <= num; i++){
                fatorial = fatorial * i;
            }
           System.out.println("O fatorial de: \n" + "!" + num + " = " + fatorial);
            cont++;

        }
        while(cont < 2);

        return cont;
    }


}
