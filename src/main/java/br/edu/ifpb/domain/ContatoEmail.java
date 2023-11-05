package main.java.br.edu.ifpb.domain;

import java.util.Scanner;


public class ContatoEmail extends Contato{
    private String email;
    Scanner leitor = new Scanner(System.in);

    public ContatoEmail(String nome, String sobrenome, int contato,boolean chamadaVideo, String categoria, String email) {
        super(nome, sobrenome, contato, false, categoria);
        this.email = email;
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("O email não está em um formato válido.");
        }
    }

    @Override
    public String toString() {
        return "\nContatos Email\nNome: " + getNome() + ", Email: " + email +", Telefone: " + getContato();
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Padrão de email simples
        return email.matches(regex);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
