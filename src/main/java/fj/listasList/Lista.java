package fj.listasList;

import java.util.*;

public class Lista {

    public static void main(String[] args) {

        System.out.println("Crie uma Lista e adicione 7 notas ");

        // criar lista usando generics ( há outras formas , ver material . esta é a mais indicada )
        // Interface List
        // implemnetação Arraylist
        List<Double> notas = new ArrayList<>();

        // adicionar elementos
        // posso passar -> a posição e o elemento -> só o elemento -> todos elementos
        // para double 7D ou 7.0
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // apresentar na tela
        // chamando a variavel
        System.out.println(notas);
        // chamando toString
        System.out.println(notas.toString());

        System.out.println("\n--------------------------------");
        System.out.println("Exiba a posição da nota 5 : " + notas.indexOf(5.0));

        System.out.println("\n--------------------------------");
        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        // add nao pode ser utilizacao na concatenação
        System.out.println(notas);
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("\n--------------------------------");
        System.out.println("Substitua a nota 5 pela nota 6 ");
        // iremos
        // identificar o indice do elemento atual
        // a justamos o valor do elemento pelo novo elemento
        System.out.println(notas);
        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas);

        System.out.println("\n--------------------------------");
        System.out.println("A lista contem a nota 5 ? -> " + notas.contains(5.0));

        System.out.println("\n--------------------------------");
        // A interface list sempre mostra os elementos na ordem de inserçao
        System.out.println("Exibir toda a lista na ordem que foram informadas\n");
        for(Double nota: notas) System.out.println( "-> " +  nota);

        System.out.println("\n--------------------------------");
        // obter um elemnto get();
        System.out.println("Exiba a terceira nota adicionada -> " + notas.get(2));

        System.out.println("\n--------------------------------");
        // List não tem um metodo nativo
        // mas Collection tem , e como a List é uma collectio
        // vamos usar Collection e usar o metodo min().
        // em nossa list notas
        System.out.println("Exiba a menor nota -> " + Collections.min(notas));

        System.out.println("\n--------------------------------");
        System.out.println("Exiba a maior nota -> " + Collections.max(notas));

        System.out.println("\n--------------------------------");
        // não há um metodo sum
        // sera utilzado o metodo Iterator
        // usar  cmd+alt+v e é  criada a variavel tipo iterator e double

        Iterator<Double> iterator  = notas.iterator();
        Double soma = 0d;
        // tem um elemento  a seguir ?
        // inicia olahndo "de fora da nossa lista
        // se a lista estiver vazia nao vera nada
        // caso contrario ira enxergar o primeiro elemento da lista

        while( iterator.hasNext()){
            // colocar o promixo elemento em uma variavel
            Double next = iterator.next();

            soma += next;

        }
        System.out.println("Exiba a soma das  notas -> " + soma );


        System.out.println("\n--------------------------------");
        // utiilizar o size() que retorna um int que é o tamnaho da lista
        System.out.println("Exiba a media das  notas -> " +  ( soma /notas.size()) );

        System.out.println("\n--------------------------------");
        // para remover pode ser passado
        // tanto o elemento quanto o indice
        // lembrar que o valor é double
        // se coloca soment  "0" , que é int , ira remover o elemento da posição 0
        System.out.println("Remover a nota 0.0  -> " +  notas.remove(0.0) );
        System.out.println(notas);

        System.out.println("\n--------------------------------");
        System.out.println(notas);
        System.out.println("Remover a nota da posição 0 -> " +  notas.remove(0) );
        System.out.println(notas);

        System.out.println("\n--------------------------------");
        System.out.println("Remova as notas menores que 7 e exiba a lista -> ");
        System.out.println("Antes  -> "+ notas);

        Iterator<Double> iterator1  = notas.iterator();

        while( iterator1.hasNext()){
            // colocar o promixo elemento em uma variavel
            Double next = iterator1.next();
            if( next < 7 ) iterator1.remove();
        }
        System.out.println("Depois -> "+ notas);

        System.out.println("\n--------------------------------");
        System.out.println("Apague toda a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n--------------------------------");
        System.out.println("A lista esta vazia ? -> " + notas.isEmpty());


 // fim da classe
    }
}
