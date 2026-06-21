package br.com.alura.catalogoDeFilmes.excecao;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

public class ErroNumeroCaracteres extends RuntimeException {

    private String mensagem;

    public ErroNumeroCaracteres(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
