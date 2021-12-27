package fj.conjuntoSet;

import java.util.*;

public class Ordenar {

    public static void main(String[] args) {


        System.out.println("------------------------");
        // para ordem aleatoria usar hashset
        System.out.println("--\tOrdem aleatória\t--");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());

        System.out.println("------------------------");
        // para ordem de inserção usar LinkedHaset
        System.out.println("--\tOrdem de Inserção\t--");

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());


        System.out.println("------------------------");
        // para ordem natural usar TreeSet
        // é necessa'rio ter comparable
        System.out.println("--\tOrdem Natural (tempo de episodio)\t--");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());

        System.out.println("------------------------");
        System.out.println("--\tOrdem Nome/Genero/Tempo\t--");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNGT());
        // adicionar conteudo
        // e adição sera dara por nome/genero e tempo
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());





    }// fim main

    private static class ComparatoNGT implements Comparator<Serie>{

        @Override
        public int compare(Serie s1, Serie s2) {
            // verifica se nome é diferente
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;
            // se nome for igual
            // compara genero
            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            // se nome e genero for igual
            // compara por tempo
            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        }
    }
} // fim classe
