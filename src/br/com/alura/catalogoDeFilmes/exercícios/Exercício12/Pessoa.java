package br.com.alura.catalogoDeFilmes.exercícios.Exercício12;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " ( Idade: " + this.idade + " )";
    }

}
