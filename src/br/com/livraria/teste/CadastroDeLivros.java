package br.com.livraria.teste;

import br.com.livraria.model.Autor;
import br.com.livraria.model.Livro;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();

        autor.nome = "Fabricio Lopes";
        autor.cpf = "000.000.000-00";
        autor.email = "fabricio@fabricio.com.br";

        Livro livro = new Livro();

        livro.nome = "Java 8 na Prática.";
        livro.descricao = "Novos recursos da linguagem.";
        livro.valor = 59.90;
        livro.isbn = "000-00-00000-00-0";
        livro.autor = autor;
        livro.aplicaDescontoDe(0.2);

        livro.mostrarDestalhes();

        Autor outroAutor = new Autor();

        outroAutor.nome = "Fernando Mota";
        outroAutor.cpf = "111.111.111-00";
        outroAutor.email = "fernando@fernando.com.br";

        Livro outroLivro = new Livro();

        outroLivro.nome = "Lógica de Programação.";
        outroLivro.descricao = "Criando seus primeiros programas.";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "111-11-11111-11-1";

        outroLivro.autor = outroAutor;

        outroLivro.mostrarDestalhes();

    }

}
