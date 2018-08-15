package br.com.livraria.teste;

import br.com.livraria.model.Livro;


public class CadastroDeLivros {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.nome = "Java 8 na Prática.";
        livro.descricao = "Novos recursos da linguagem.";
        livro.valor = 59.90;
        livro.isbn = "000-00-00000-00-0";
        
        System.out.println("Nome: " + livro.nome);
        System.out.println("Descrição: " + livro.descricao);
        System.out.println("Valor: " + livro.valor);
        System.out.println("ISBN: " + livro.isbn);
        
    }
    
}
