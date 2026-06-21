package br.com.alura.catalogoDeFilmes.ProjetosFinais.ProjetoFinalCursoConsumidoAPI_3;


import br.com.alura.catalogoDeFilmes.excecao.ErroNumeroCaracteres;

public class Titulo {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String estado;

    public Titulo(TituloViaCep meuTituloViaCep) {

        this.cep = meuTituloViaCep.cep();
        this.logradouro = meuTituloViaCep.logradouro();
        this.bairro = meuTituloViaCep.bairro();
        this.localidade = meuTituloViaCep.localidade();
        this.estado = meuTituloViaCep.estado();
    }


    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return  "CEP: " + cep +
                "\nEstado: " + estado +
                "\nCidade: " + localidade +
                "\nBairro: " + bairro +
                "\nRua:  " + logradouro;
    }
}
