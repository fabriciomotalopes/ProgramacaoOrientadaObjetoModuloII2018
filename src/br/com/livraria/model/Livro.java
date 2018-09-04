package br.com.livraria.model;

public class Livro {

    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;

    public void mostrarDestalhes() {

        System.out.println("Mostrando dados do LIVRO");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + descricao);
        System.out.println("Nome: " + valor);
        System.out.println("Nome: " + isbn);

        autor.mostrarDetalhes();

        System.out.println("--------------");
    }
}
