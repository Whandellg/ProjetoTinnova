package br.com.questoes;

public class Votos {

    private double percentValidos;
    private double percentBrancos;
    private double percentNulos;

    public double getPercentValidos() {
        return percentValidos;
    }

    public double setPercentValidos(double percentValidos) {
       return this.percentValidos = percentValidos;
    }

    public double getPercentBrancos() {
        return percentBrancos;
    }

    public double setPercentBrancos(double percentBrancos) {
        return this.percentBrancos = percentBrancos;
    }

    public double getPercentNulos() {
        return percentNulos;
    }

    public double setPercentNulos(double percentNulos) {
       return this.percentNulos = percentNulos;
    }

    public double percentValidos(double validos, double totalEleitores){
        double validosV = (validos/totalEleitores) * 100;
        this.percentValidos= validosV;
        System.out.println(this.percentValidos);
        return this.percentValidos;
    }

    public double percentBrancos(double brancos, double totalEleitores){
        this.percentBrancos = brancos/totalEleitores;
        return this.percentBrancos * 100;
    }

    public double percentNulos(double nulos, double totalEleitores){
        this.percentNulos = nulos/totalEleitores;
        return this.percentNulos * 100;
    }





}
