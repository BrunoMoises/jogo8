package br.com.bmoises.jogo8;

public class No {

    int[][] estado;

    public No() {
        this.estado = new int[3][3];
    }

    public int[][] getEstado() {
        return estado;
    }

    public void setEstado(int[][] estado) {
        this.estado = estado;
    }

}
