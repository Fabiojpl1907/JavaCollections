package fj.conjuntoSet;

import java.util.*;

public class Conjunto {

    public static void main(String[] args) {

        System.out.println("Criar conjunto e adicionar notas");
        // cria um Set notas tipo double
        // implementa tipo HashSet
        // coloca argumentos no cosntrutor do tipo Arrays.asList
        // passar todas as notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0,8.5,9.3,5d, 7d,0.0,3.6));

        // apresentar
        // HashSet nao mantem a ordem de inserção
        // não permite elementos repetidos
        // não permite pesuisa pela posição ( não tem index )
        // ou seja qualquer metodo que dependa de indice não é implantado
        System.out.println(notas);

        System.out.println("\n_________________________________");
        System.out.println("Nota 5.0 esta no conjunto ? -> " + notas.contains(5.0));

        System.out.println("\n_________________________________");
        // no caso da menor nota usamos o Collections, sendo que Set vem de collections
        System.out.println("Exibir a menor nota -> " + Collections.min(notas));

        System.out.println("\n_________________________________");
        // no caso da menor nota usamos o Collections, sendo que Set vem de collections
        System.out.println("Exibir a maior nota -> " + Collections.max(notas));

        System.out.println("\n_________________________________");
        // sera utilizado o iterator para apresnetar a soma de notas
        // lembrar que no set nao é dulicado elementos
        // o 7 que foi inserido inicialmnete 2x , so sera somado 1x
        Iterator<Double> iterar = notas.iterator();
        Double soma = 0.0;
        while( iterar.hasNext() ){
            Double next = iterar.next();
            soma += next;
        }
        // usar printf e formatacao para apresenta 2 casas decimais
        System.out.printf("Exibir a soma  das notas -> %.2f" , soma );


        System.out.println("\n_________________________________");
        // para média precisamos do tamaho do conjunto
        // usar o metodo size().
        System.out.println("Exibir a tamanho do conjunto -> " + notas.size()  );
        // usar printf e formatacao para apresenta 2 casas decimais
        System.out.printf("Exibir a média das notas -> %.2f" , ( soma / notas.size())  );

        System.out.println("\n_________________________________");
        System.out.println(notas);
        System.out.println("Remover nota 0.0 " );
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("\n_________________________________");
        System.out.println("Remover notas menores que 7 e exibir notas" );
        Iterator<Double> retirar = notas.iterator();
        while( retirar.hasNext() ){
            double next = retirar.next(); ;
            if(next < 7) retirar.remove();
        }
        System.out.println(notas);


        System.out.println("\n_________________________________");
        System.out.println("Exibir  notas na sequencia de inserção" );
        // Hashset não permite isto
        // para presenvar a sequencia de inserção é necessario
        // instanciar o conjunto com LikedHasHSet
        // lenrando que set não duplica elemento
        Set<Double> notas2 = new LinkedHashSet<>();
        // para mudar , anos usar o método add()
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);


        System.out.println("\n_________________________________");
        System.out.println("Exibir  notas na ordem crescente" );
        // aqui necessitamos da implementação TreeSet
        // que organiza na ordem natural dos elementos ( menor -> Maior r , alfabetico )
        // ai inves de popularmos a nova lista
        // vamos usar como parametos uma alista anteriormente criada . Notas2
        // assim podemos dar visões diferentes a uma mesma lista sem ter que reinserir os dados
        // possa fazer isto pois treeset impleenta o comparable.
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\n_________________________________");
        System.out.println("Apague todo o conjunto" );
        notas.clear();

        System.out.println("\n_________________________________");
        System.out.println("Conjunto esta vazio ? -> " + notas.isEmpty() );
        System.out.println("Conjunto esta vazio ? -> " + notas2.isEmpty() );




// fim classe conjunto
    }
}
