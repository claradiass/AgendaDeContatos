package main.java.br.edu.ifpb.domain;

import java.util.Scanner;

public class ContatoTelefone extends Contato{
    private String aniversario;
    Scanner leitor = new Scanner(System.in);

    public ContatoTelefone(String nome, String sobrenome, int contato, String categoria, String aniversario) {
        super(nome, sobrenome, contato, false, categoria);
        
        if (isValidDataDeAniversario(aniversario)) {
            this.aniversario = aniversario;
        } else {
            throw new IllegalArgumentException("Data de aniversário inválida. Use o formato 'dd/mm/yyyy'.");
        }

    }

    @Override
    public String toString() {
        return "\nContatos Telefone\nNome: " + getNome() + ", Telefone: " + getContato();
    }

    // Validação da data de aniversário no formato 'dd/mm/yyyy'
    private boolean isValidDataDeAniversario(String data) {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        return data.matches(regex);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }


}
