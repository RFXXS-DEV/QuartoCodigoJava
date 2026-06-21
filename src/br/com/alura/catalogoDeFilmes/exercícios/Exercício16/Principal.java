package br.com.alura.catalogoDeFilmes.exercícios.Exercício16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        /*
         * DESAFIO 16:
         *
         * Crie um programa que solicite ao usuário dois números inteiros.
         *
         * Em seguida, realize a divisão do primeiro número pelo segundo
         * e exiba o resultado na tela.
         *
         * Utilize um bloco try/catch para tratar o caso em que o usuário
         * informar 0 como divisor, evitando que o programa seja encerrado
         * por erro e exibindo uma mensagem amigável ao usuário.
         *
         * Exemplo:
         *
         * Entrada:
         * Número 1: 10
         * Número 2: 2
         *
         * Saída:
         * Resultado: 5
         *
         * Entrada:
         * Número 1: 10
         * Número 2: 0
         *
         * Saída:
         * Erro: não é possível dividir por zero.
         */
        Scanner leitura = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            int numero1 = leitura.nextInt();
            System.out.println("Digite o segundo número: ");
            int numero2 = leitura.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro no número digitado, digite um número válido!");
        } finally {
            System.out.println("Programa finalizado! ");
        }

    }
}
