package br.com.alura.catalogoDeFilmes.modelos.Exercício5;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Julia");
        pessoa1.setIdade(21);

        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa2.setNome("Alice");
        pessoa2.setIdade(6);


        System.out.println(pessoa1.getNome() + " você tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " você tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }

}
