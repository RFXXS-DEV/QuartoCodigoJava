package br.com.alura.catalogoDeFilmes.exercícios.Exercício14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Desenvolva um sistema simples de biblioteca em Java. Crie uma classe chamada Livro
        // contendo os atributos título, autor e número de páginas. Implemente um construtor
        // para inicializar todos os atributos e crie os métodos getters para permitir o acesso
        // aos dados. Na classe principal, crie um ArrayList capaz de armazenar objetos da classe
        // Livro e cadastre pelo menos cinco livros diferentes. Utilize um loop foreach para percorrer
        // a lista e exibir todas as informações de cada livro cadastrado. Ao final da execução, exiba
        // a quantidade total de livros armazenados na biblioteca.


        ArrayList<Livro> listaLivros = new ArrayList<>();

        Livro livro1 = new Livro("Livro 1", "Autor do livro 1", 332);
        Livro livro2 = new Livro("Livro 2", "Autor do Livro 2", 454);
        Livro livro3 = new Livro("Livro 3", "Autor do livro 3", 272);
        Livro livro4 = new Livro("Livro 4", "Autor do Livro 4", 296);
        Livro livro5 = new Livro("Livro 5", "Autor do livro 5", 328);

        listaLivros.add(livro1);
        listaLivros.add(livro2);
        listaLivros.add(livro3);
        listaLivros.add(livro4);
        listaLivros.add(livro5);

        for (Livro item: listaLivros){
            System.out.println("Livro: " + item.getTitulo() + "| Autor: " + item.getAutor() + "| Número de Páginas: " + item.getNumeroDePaginas());
        }

        System.out.println("Na lista tem " + listaLivros.size() + " Livros");
    }
}
