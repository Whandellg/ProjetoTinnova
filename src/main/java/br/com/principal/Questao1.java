package br.com.principal;

import br.com.questoes.Votos;

public class Questao1 {

    public static void main(String[] args) {

        double totalEleitores = 1000;
        double validos = 800;
        double brancos = 150;
        double nulos = 50;

        Votos votos = new Votos();
        double v = votos.percentValidos(votos.setPercentValidos(validos), totalEleitores);
        double b = votos.percentBrancos(votos.setPercentBrancos(brancos), totalEleitores);
        double n = votos.percentNulos(votos.setPercentNulos(nulos), totalEleitores);

        System.out.println(" O percentual dos votos validos são: \n"  + v);
        System.out.println(" O percentual dos votos em branco são: \n" + b);
        System.out.println(" O percentual dos votos nulos são: \n" + n);


    }
}
