package br.com.alura.catalogoDeFilmes.modelos.Exercício6;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Celular", 10000);

        System.out.println("Nome do Produto: " + produto1.getNomeProduto());
        System.out.println("Valor do Produto: " + produto1.getValorProduto());

        produto1.aplicarDesconto(20);

        System.out.println("Valor com o desconto: " + produto1.getValorProduto());


    }

}
