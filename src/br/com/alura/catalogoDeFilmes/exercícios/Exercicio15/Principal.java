package br.com.alura.catalogoDeFilmes.exercícios.Exercicio15;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {

        /*
         * DESAFIO: Sistema de pedidos com Gson
         *
         * Crie um sistema que representa um Pedido de uma loja online.
         *
         * O sistema deve conter:
         *
         * - Um Record Produto com:
         *   - nome (String)
         *   - preco (double)
         *
         * - Um Record Pedido com:
         *   - cliente (String)
         *   - produto (Produto)
         *   - quantidade (int)
         *
         * O programa deve:
         *
         * 1. Receber um JSON representando um pedido.
         * 2. Converter esse JSON em um objeto Pedido usando Gson.
         * 3. Imprimir:
         *    - Nome do cliente
         *    - Nome do produto
         *    - Preço do produto
         *    - Quantidade
         *
         * O JSON será aninhado (Produto dentro de Pedido).
         *
         * O JSON também pode conter campos extras (como "desconto"),
         * que devem ser ignorados pelo Gson.
         */

        String json = """
{
  "cliente": "Gustavo",
  "produto": {
    "nome": "Teclado Mecânico",
    "preco": 250.0
  },
  "quantidade": 2,
  "desconto": 10
}
""";

        Gson gson = new Gson();

        Pedido pedido = gson.fromJson(json, Pedido.class);

        System.out.println("Cliente: " + pedido.cliente());
        System.out.println("Produto: " + pedido.produto().nome());
        System.out.println("Preço: " + pedido.produto().preco());
        System.out.println("Quantidade: " + pedido.quantidade());

    }
}
