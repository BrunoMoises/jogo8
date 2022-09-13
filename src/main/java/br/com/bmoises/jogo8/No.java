package br.com.bmoises.jogo8;

import java.util.ArrayList;

public class No {

    int[][] estado;
    ArrayList<No> filho = new ArrayList();
    No pai;

    public No(int[][] estado) {
        this.estado = estado;
        filho = null;
        pai = null;
    }

    public int[][] getEstado() {
        return estado;
    }

    public void setEstado(int[][] estado) {
        this.estado = estado;
    }

    public ArrayList<No> getFilho() {
        return filho;
    }

    public void setFilho(ArrayList<No> filho) {
        this.filho = filho;
        if(filho != null) {
            for(No f:filho) {
                f.pai = this;
            }
        }
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

}
