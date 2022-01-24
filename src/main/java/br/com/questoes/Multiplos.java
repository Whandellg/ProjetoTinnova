package br.com.questoes;

public class Multiplos {

    private int x;

    public int getX() {
        return x;
    }

    public int setX(int x) {
        return this.x = x;
    }

    public int getZ() {
        return z;
    }

    public int setZ(int z) {
        return this.z = z;
    }

    private int z;

    public int multiplos(int x, int z){

        int somax = 0;
        int somaz = 0;
        int res;

        for(int i = 1; i < 100; i++) {
            if(i % x == 0) {
                somax += i;

            }
        }
        for(int i = 1; i < 100; i++) {
            if(i % z == 0) {
                somaz  += i;
            }
        }
        return res = somax + somaz;

    }




}
