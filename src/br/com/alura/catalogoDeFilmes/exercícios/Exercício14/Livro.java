package br.com.alura.catalogoDeFilmes.exercícios.Exercício14;

public class Livro {

    //Desenvolva um sistema simples de biblioteca em Java. Crie uma classe chamada Livro
    // contendo os atributos título, autor e número de páginas. Implemente um construtor
    // para inicializar todos os atributos e crie os métodos getters para permitir o acesso
    // aos dados. Na classe principal, crie um ArrayList capaz de armazenar objetos da classe
    // Livro e cadastre pelo menos cinco livros diferentes. Utilize um loop foreach para percorrer
    // a lista e exibir todas as informações de cada livro cadastrado. Ao final da execução, exiba
    // a quantidade total de livros armazenados na biblioteca.

    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
