package br.com.alura.catalogoDeFilmes.exercícios.Exercício12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Alice", 31);
        Pessoa pessoa2 = new Pessoa("Julia", 23);
        Pessoa pessoa3 = new Pessoa("Erica", 19);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println(listaPessoas);

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }

    }
}
