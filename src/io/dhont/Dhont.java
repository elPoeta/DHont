package io.dhont;

import java.util.Collections;
import java.util.List;

public class Dhont {
    private double [][] matrizVotos;
    private int bancasEnJuego;
    private List<PartidoPolitico> votosRecibidos;

    public Dhont(List<PartidoPolitico> votosRecibidos, int bancasEnJuego) {
        this.votosRecibidos = votosRecibidos;
        this.bancasEnJuego = bancasEnJuego;
        this.matrizVotos = new double [this.bancasEnJuego][this.votosRecibidos.size()];
        Collections.sort(votosRecibidos,Collections.reverseOrder());
        this.llenarMatrizDeVotos();
    }

    private void llenarMatrizDeVotos() {
        for(int i=0; i<matrizVotos.length; i++ ) {
            for(int j=0; j<matrizVotos[0].length; j++) {
                this.matrizVotos[i][j]= this.votosRecibidos.get(j).getCantidadDeVotos() / (double) (i+1);
            }
        }
    }



    public void calcularEscanios() {

        for(int i=0; i<this.bancasEnJuego; i++ ) {
            this.votosRecibidos.get(maximos()).setEscaniosObtenidos();
        }
    }


    private int maximos() {
        int pos = 0;
        int fila=0;
        int col=0;
        double mayor = this.matrizVotos[0][0];

        for(int i=0; i<this.matrizVotos.length; i++ ) {
            for(int j=0; j<matrizVotos[0].length; j++) {
                if(this.matrizVotos[i][j]>mayor) {
                    mayor=this.matrizVotos[i][j];
                    pos = j;
                    fila=i;
                    col=j;
                }
            }
        }
        this.matrizVotos[fila][col]=0.0;
        return pos;
    }
}
