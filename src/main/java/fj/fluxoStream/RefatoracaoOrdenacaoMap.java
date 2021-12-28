package fj.fluxoStream;

import java.util.*;
import java.util.function.Function;

// tem como base o exercicio proposto 3

public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("\n------------------------");
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n------------------------");
        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n------------------------");
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

// Refatorar --------------------------------------------------------------------------------------------------
        // refatorar para usar classe anonima
        // a classe nomeada ComparatorOrdemNumerica
        // que era chamada uma unica vez
        // vira uma classe anonima
        System.out.println("\n------------------------");
        System.out.println("--\tOrdem número telefone\t--");

        // opcao I
        // passar para treeset Comparator Map.entry
        // a proppia IDE ja apresenta esta opcao
/*        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                // compare pertence a Integer . é um dos seus métodos
                return Integer.compare( cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });*/

        // opcao II
        // metodo static comparing
        // Compataor tem o método comparing
        // que recebe uma interface funcional Function<>
        // sera utilizado o conceito de classe anonima
/*        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                // estude Interface funcional para detalhar o abaixo
                // Object é o retorno da função
                // para comparar por numero de telefone , temos o Integer
                // e implentar o metodo apply
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        // comparar pelo numero de telefone
                        // retorno sera numero de telefone
                        return cont.getValue().getNumero();
                    }
                }));*/

        // Opção III  Lambda
        // Lambda -> lado esquerdo pede argumento
        //        -> lado direito pede o código
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                    // do lado direito vou colocar a lógica
                    // para comparação  ser usada pelo Comparing
                     cont -> cont.getValue().getNumero()));

        // corpo fixo da paresentação - idependente da opção I / II / III
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }


// Fim Refatorar --------------------------------------------------------------------------------------------------


        System.out.println("\n------------------------");
        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        //imprimindo usando forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }



} // fim da classe

/*
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}
*/

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}