package fj.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaOrdenacao {

    public static void main(String[] args) {

    // criar uma classe gato e depois uma lista de gatos

        List<Gato> gatos = new ArrayList<>() { {
            add( new Gato("John", 18, "preto"));
            add( new Gato("Simba", 6, "tigrado"));
            add( new Gato("John", 12, "amarelo"));

        }};

        System.out.println("\n--------------------------------");
        // \t - tabulação
        System.out.println("\tLista na ordem de inserção\t");
        System.out.println(gatos);

        System.out.println("\n--------------------------------");
        System.out.println("\tLista em  ordem aleatoria\t");
        // usar metodo shuffle de Collectiosn
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("\n--------------------------------");
        System.out.println("\tOrdem Natuarl (nome)\t");
        // precisa implementar o Comparable na classe gato
        Collections.sort(gatos);
        System.out.println(gatos);

        // ordenar usando a interface comparator
        // para nao precisar altear o comparable a toda hora
        System.out.println("\n--------------------------------");
        System.out.println("\tOrdem idade\t");
        // pode utilizar qualquer um dos metodos abaixo
        // Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("\n--------------------------------");
        System.out.println("\tOrdem cor\t");
        // pode utilizar qualquer um dos metodos abaixo
        // Collections.sort(gatos, new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("\n--------------------------------");
        System.out.println("\tOrdenar por Nome->Cor->Idade\t");
        // pode utilizar qualquer um dos metodos abaixo
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        // gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

    } // fim PSVM

    private static class ComparatorIdade implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare( g1.getIdade(), g2.getIdade());
        }
    }


    private static class ComparatorCor implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            // como cor é String
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }


    private static class ComparatorNomeCorIdade implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            // comparar nome
            // 0 é igual , 1 é maior , -1 é menor
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

            // se nome diferente. ordenar por nome
            if(nome != 0 ) return nome;

            // comparar cor
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            // se nome diferente. ordenar por nome
            if(cor != 0 ) return cor;

            // se nome e cor forem iguais
            // ordenar por idade
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }


} // fim classe Ordenacao
