package fj.listas;

public class Gato implements Comparable<Gato>{

    private  String nome;
    private  Integer idade;
    private  String cor;

    // construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }


    public String getCor() {
        return cor;
    }

    // to string


    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        // metodo de comparação de Strings
        return this.getNome().compareToIgnoreCase( gato.getNome() );
        // returna um int
        // se 0 -> nomes iguais
        // -1 nome é menor
        // 1 nome é maior
    }


}// fim classe gato
