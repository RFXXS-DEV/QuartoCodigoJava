package br.com.alura.catalogoDeFilmes.modelos.Exercício5;

public class IdadePessoa {

// Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.

    private String nome;
    private int idade;

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Você é adulto(a).");
        }else {
            System.out.println("Você é menor de idade.");
        }


    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
