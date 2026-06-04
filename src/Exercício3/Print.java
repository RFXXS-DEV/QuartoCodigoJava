package Exercício3;

public class Print {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Alguma Música";
        musica.artista = "Alguem";
        musica.anoLancamento = 2026;

        musica.mostrarFicha();

        musica.calcularMedia(4.2);
        musica.calcularMedia(3.9);
        musica.calcularMedia(4.8);

        System.out.println("O total de avaliações foi de: " + musica.numAvaliacoes);
        System.out.println("Nota: " + musica.mediaAvaliacao());



    }
}
