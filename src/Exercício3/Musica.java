package Exercício3;

public class Musica {

    //Crie uma classe Musica com atributos
    //titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
    // para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void mostrarFicha (){

        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano da música: " + anoLancamento);

    }

    void calcularMedia (double nota){
        avaliacao += nota;
        numAvaliacoes++;

    }

    double mediaAvaliacao (){ return avaliacao / numAvaliacoes;}

}
