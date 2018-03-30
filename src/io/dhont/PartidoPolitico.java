package io.dhont;

public class PartidoPolitico implements Comparable<PartidoPolitico> {
    private String nombre;
    private int cantidadDeVotos;
    private int escaniosObtenidos;

    public PartidoPolitico(String nombre, int cantidadDeVotos) {
        this.nombre = nombre;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public int getEscaniosObtenidos() {
        return escaniosObtenidos;
    }

    public void setEscaniosObtenidos() {
        this.escaniosObtenidos ++;
    }
    @Override
    public int compareTo(PartidoPolitico o) {
        Integer a=new Integer(this.cantidadDeVotos);
        Integer b=new Integer(o.cantidadDeVotos);
        return a.compareTo(b);
    }
    @Override
    public String toString() {
        return "Partido Politico{" +
                "nombre='" + nombre + '\'' +
                ", cantidad DeVotos=" + cantidadDeVotos +
                ", ESCANIOS OBTENIDOS [" + escaniosObtenidos +"]"+
                '}';
    }
}
