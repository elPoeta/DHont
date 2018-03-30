package io.dhont;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<PartidoPolitico> partidos = Arrays.asList(new PartidoPolitico("Partido UNO", 416225),
                new PartidoPolitico("Partido DOS",111160),
                new PartidoPolitico("Partido TRES", 974886),
                new PartidoPolitico("Partido CUATRO", 93438),
                new PartidoPolitico("Partido CINCO",236008),
                new PartidoPolitico("Partido SEIS",85511));

        Dhont dhont = new Dhont(partidos,13);
        dhont.calcularEscanios();

        partidos.stream().forEach(System.out::println);

    }
}
