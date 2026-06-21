package br.com.alura.catalogoDeFilmes.exercícios.Exercicio15;

import br.com.alura.catalogoDeFilmes.exercícios.Exercicio15.Produto;

public record Pedido(

        String cliente,
        Produto produto,
        int quantidade

) {}
