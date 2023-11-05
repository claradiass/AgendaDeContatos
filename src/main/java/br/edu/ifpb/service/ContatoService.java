package main.java.br.edu.ifpb.service;

import java.lang.reflect.Constructor;
import java.util.Map;

import main.java.br.edu.ifpb.domain.Contato;
import main.java.br.edu.ifpb.domain.ContatoEmail;
import main.java.br.edu.ifpb.domain.ContatoTelefone;
import main.java.br.edu.ifpb.domain.ContatoWhatsApp;
import main.java.br.edu.ifpb.repository.ContatoRepository;

public class ContatoService {
    private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    public Contato criarContato(String nome, String sobrenome, int contato, String categoria, String detalhe) {
    if (categoria.equalsIgnoreCase("1")) {
        return new ContatoTelefone(nome, sobrenome, contato, categoria, detalhe);

    } else if (categoria.equalsIgnoreCase("2")) {
        return new ContatoEmail(nome, sobrenome, contato, categoria, detalhe);

    } else if (categoria.equalsIgnoreCase("3")) {
        return new ContatoWhatsApp(nome, sobrenome, contato, categoria);
        
    } else {
        throw new IllegalArgumentException("Categoria de contato desconhecida: " + categoria);
    }
}

    
}
