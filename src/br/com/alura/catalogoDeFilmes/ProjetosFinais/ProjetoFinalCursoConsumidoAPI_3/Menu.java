package br.com.alura.catalogoDeFilmes.ProjetosFinais.ProjetoFinalCursoConsumidoAPI_3;

import br.com.alura.catalogoDeFilmes.excecao.ErroNumeroCaracteres;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*

         * PROJETO FINAL - CONSULTA DE CEP COM VIA CEP
         *
         * Desenvolva uma aplicação Java que permita ao usuário consultar
         * informações de um endereço a partir de um CEP utilizando a API ViaCEP.
         *
         * Requisitos do projeto:
         *
         * 1. Exibir um menu para que o usuário informe um CEP.
         *
         * 2. Realizar uma requisição à API ViaCEP utilizando o CEP informado.
         *
         * 3. Receber e processar a resposta da API em formato JSON.
         *
         * 4. Exibir na tela as principais informações do endereço encontrado,
         * como logradouro, bairro, cidade e estado.
         *
         * 5. Tratar possíveis erros, como CEP inválido ou não encontrado.
         *
         * 6. Gerar um arquivo .json contendo os dados retornados pela consulta.
         *
         * Objetivo:
         * Praticar o consumo de APIs, manipulação de JSON, tratamento de
         * exceções, utilização de Records e gravação de arquivos em Java.
         */

        Scanner leitura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {


            System.out.println("Digite o Cep: ");
            String cep = leitura.nextLine().replace(" ", "");

            if (cep.length() != 8) {
                throw new ErroNumeroCaracteres(
                        "Por favor, insira um CEP com 8 dígitos."
                );
            }

            String enderecoSite = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(enderecoSite))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            if (json.contains("\"erro\": true")) {
                throw new ErroNumeroCaracteres("CEP não encontrado.");
            }
            System.out.println(json);

            TituloViaCep meuTituloViaCep = gson.fromJson(json, TituloViaCep.class);
            System.out.println(meuTituloViaCep);

            Titulo meuTitulo = new Titulo(meuTituloViaCep);
            System.out.println("Titulo Convertido");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("cep.json");
            escrita.write(gson.toJson(meuTitulo));
            escrita.close();

            System.out.println("Arquivo JS  ON gerado com sucesso!");

        } catch (ErroNumeroCaracteres e){
            System.out.println(e.getMessage());
        }
    }
}
