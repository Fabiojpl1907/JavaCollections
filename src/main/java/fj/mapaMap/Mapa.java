package fj.mapaMap;

import java.util.*;

public class Mapa {

    public static void main(String[] args) {

    // carros e consumo e combustivel

        System.out.println("\n________________________________");
        System.out.println("Relacione Carros e seus Consumos [km/l]");
        // criar mapa
        // falar o tipo da chave e o tipo do valor
        // nao tem metodo add() , tem o put()
        // has nao mantem ordem de inserção e nao tem index
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Kwid", 15.6);
            put("HB20", 13.2);
        }};
        System.out.println( carros );

        System.out.println("\n________________________________");
        System.out.println("Substitua consumo de do Gol");
        // como nao pode ter valores duplicados
        // uso o put, colocando novo consumo
        carros.put("Gol", 16.1 );
        System.out.println( carros );

        System.out.println("\n________________________________");
        System.out.println("Confira se o Tucson esta no dicionário");
        // usar contaisKey
        System.out.println( "Tuckson existe ? -> " + carros.containsKey("Tukson") );

        System.out.println("\n________________________________");
        System.out.println("Exiba consumo Uno");
        // usar get()
        System.out.println( "Consumo Uno -> " + carros.get("Uno") );

        System.out.println("\n________________________________");
        System.out.println("Exiba os modelos ");
        // usar keySet , que retorna um Set
        // necessita importar Collection -> java.util
        Set<String> modelos = carros.keySet();
        System.out.println( "Modelos -> " + modelos );

        System.out.println("\n________________________________");
        System.out.println("Exiba consumo ");
        Collection<Double> consumo = carros.values();
        System.out.println("Consumo ->" + consumo );

        System.out.println("\n________________________________");
        System.out.println("Exibir o mais economico");
        // usar colection max , com um metodo que retorna collections -> values()
        Double consumoeficiente = Collections.max( carros.values());
        // de qaul carro é esta consumo
         // usar o metodo entry set , que retorna elementos entry
        Set<Map.Entry<String, Double>> entradas = carros.entrySet();
        String modeloeficiente = "";

        System.out.println("Consumo ->" + consumo );
        // cada elemento dentro de entry sera do tipo : Map.Entry<String, Double>
        // que retorna o set entradas
        for(Map.Entry<String, Double>  entry: entradas){
            if( entry.getValue().equals( consumoeficiente )) {
                modeloeficiente = entry.getKey();
                // caso tenha carros com eficiencia igal
                // sera impresso cada carro
                System.out.println("Model mais eficiente < " + modeloeficiente + " >  Consumo : " + consumoeficiente);
            }
        }


        System.out.println("\n________________________________");
        System.out.println("Exibir o menos economico");
       // precisa trabalhar com a chave e o valor separadamente
        // values retorna uma collections de valores
        // keyset retorna um Set com modelos

        // qual pior consumo
        Double consumoMenosEficiente = Collections.min(carros.values());
        // usar metodo entryset , no qual posso manipular chaves e valores separadamente
        // usando for each
        String modeloMenosEficiente = "";

        for( Map.Entry<String, Double> entry : carros.entrySet()){
            // procuarando qual carro tem valor de consumo igual
            // ao valor obtido pelo metodo Collections.min
            if(  entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Model menos eficiente < " + modeloMenosEficiente +
                        " >  Consumo : " + consumoMenosEficiente);
            }
        }


        System.out.println("\n________________________________");
        System.out.println("Exibir soma dos consumos");
        // utilizar iterator com o Set de valores
        // como retorno de values é collectios , temos iterator
        Iterator<Double> iterator = carros.values().iterator();
        // variavel acumuladora
        Double soma = 0.0;
        // vamos iterar
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos -> " + soma);


        System.out.println("\n________________________________");
        System.out.println("Exibir média dos  consumos");
        // utilizar no map carros o metodo size()
        // printf -> formatdor %s string , %.3f 3 casas decimais
        System.out.printf("%s%.3f%s","Média dos  consumos -> ",(soma / carros.size()) , " Km/l" );

        System.out.println("\n________________________________");
        System.out.println("Remover modelos com consumo igual a 15.6");
        System.out.println("Map Original -> " + carros);
        Iterator<Double> iterator1 = carros.values().iterator();
        // vamos iterar
        while(iterator1.hasNext()){
           if(iterator1.next().equals(15.6) ) iterator1.remove();
        }
        System.out.println("Novo map -> " + carros);

        System.out.println("\n________________________________");
        System.out.println("Exibir carros na ordem de inserção");
        // para isto usar a implentação LinkedHashMap
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Kwid", 15.6);
            put("HB20", 13.2);
        }};
        System.out.println(carros2);

        System.out.println("\n________________________________");
        System.out.println("Exibir o dicionário ordenado pelo modelo");
        // para isto usar a implentação TreeMap que ordena a chave
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

        System.out.println("\n________________________________");
        System.out.println("Apagar  o dicionário de carros");
        carros.clear();

        System.out.println("\n________________________________");
        System.out.println("Conferir se o dicionário esta vazio");
        System.out.println("Dicionário vazio ? -> " + carros.isEmpty());


    } // fim main

} // fim classe
