package fj.listas;

import java.util.ArrayList;
import java.util.Collections;
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



    } // fim PSVM
} // fim classe Ordenacao
