package br.com.alura.catalogoDeFilmes.exercícios.Exercício13;

public class ProdutoPerecivel extends Produto {

    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto : " + getNome() + " | Valor: " + getPreco() + " | Quantidade: " + getQuantidade() + " | Data de validade: " + getDataValidade();
    }
}
