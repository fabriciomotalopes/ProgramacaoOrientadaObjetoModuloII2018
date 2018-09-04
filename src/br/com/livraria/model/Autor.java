package br.com.livraria.model;

public class Autor {

    public String nome;
    public String cpf;
    public String email;

    public void mostrarDetalhes() {
        System.out.println("Mostrando dados do AUTOR");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + cpf);
        System.out.println("Nome: " + email);
    }

}
