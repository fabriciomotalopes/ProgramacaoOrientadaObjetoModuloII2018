package br.com.livraria.model;

public class Livro {
    
    public Livro(){
        System.out.println("Criando um Livro");
    }
    
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;

    public void aplicaDescontoDe(double porcentagem) {
        valor -= valor * porcentagem;
    }

    public boolean temAutor() {
        return this.autor != null;
    }

    public void mostrarDestalhes() {

        System.out.println("Mostrando dados do LIVRO");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + descricao);
        System.out.println("Nome: " + valor);
        System.out.println("Nome: " + isbn);
        
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("--------------");
    }
}
