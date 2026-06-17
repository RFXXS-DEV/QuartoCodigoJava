package br.com.alura.catalogoDeFilmes.exercícios.Exercício13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Arroz", 3.90, 21);
        Produto produto2 = new Produto("Feijão", 4.90, 15);
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Morango", 9.90, 10, 200626);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto da posição 0: " + listaProdutos.get(0).getNome());

        System.out.println("Lista de produtos: ");

        for (Produto produto : listaProdutos){
            System.out.println(produto);
        }







    }
}
