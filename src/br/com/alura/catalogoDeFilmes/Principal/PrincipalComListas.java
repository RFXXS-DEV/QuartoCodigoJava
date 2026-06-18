package br.com.alura.catalogoDeFilmes.Principal;

import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Filmes;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Series;
import br.com.alura.catalogoDeFilmes.modelos.Conteudo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filmes favorito = new Filmes("The Matrix", 1999);
        favorito.avalia(9);
        Filmes outroFilme = new Filmes("Avatar", 2020);
        outroFilme.avalia(7);
        var filmeDoPaulo = new Filmes("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Series lost = new Series("Lost", 2000);


        ArrayList<Titulo> listaAssistidos = new ArrayList<>();

        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(favorito);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(lost);

        Filmes f1 = filmeDoPaulo;

        for (Titulo item: listaAssistidos){
            System.out.println("Filme: " + item);

            if (item instanceof Filmes filmes && filmes.getClassificacao() > 2){
                System.out.println("Classificacao: " + filmes.getClassificacao());
            }

        }


        ArrayList<String> buscarPorArtista = new ArrayList<>();

        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");

        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscarPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);





    }
}
