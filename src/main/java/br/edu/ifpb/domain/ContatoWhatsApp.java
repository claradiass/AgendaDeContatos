package main.java.br.edu.ifpb.domain;

public class ContatoWhatsApp extends Contato{

    //construtor
    public ContatoWhatsApp(String nome, String sobrenome, int contato, String categoria) {
        super(nome, sobrenome, contato, true, categoria);
    }

    @Override
    public String toString() {
        return "\nContatos WhatsApp\nNome: " + getNome() + ", Telefone: " + getContato();
    }



}

