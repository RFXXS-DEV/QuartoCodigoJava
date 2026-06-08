package br.com.alura.catalogoDeFilmes.modelos.Exercício6;

public class Produto {

    // Desenvolva uma classe Produto com os atributos privados nome e preco.
    // Utilize métodos getters e setters para acessar e modificar esses atributos.
    // Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz
    // o preço do produto.

    private String nomeProduto;
    private double valorProduto;

    public Produto(String nomeProduto, double valorProduto){

        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void aplicarDesconto(double percentualDeDesconto){
        double desconto = valorProduto * (percentualDeDesconto / 100);
        valorProduto -= desconto;

    }
}



