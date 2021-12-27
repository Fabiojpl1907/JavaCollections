package fj.conjuntoSet;

import java.util.Objects;

public class Serie implements Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    // Construtor
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }


    //ToString
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }


    // Equals & hashcode
    // importante sobeescrever se na implentacao temos
    // a palavra hash
    // equals verifica se o objeto tem im hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }


    @Override
    // ajustar o compareto para o tempoEpisodio
    // Set nao recebe objetos duplicados
    // se tiver 2 objetos com o parametros iguais
    // é necessa'rio colocar regra de desempate
    public int compareTo(Serie serie) {
        int tempo =  Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        // se tempo de episodios forem diferentes ( 0 )
        if( tempo != 0 ) return tempo;
        return this.getGenero().compareTo(serie.getGenero());
    }


}