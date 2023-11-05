package main.java.br.edu.ifpb.service;

import java.lang.reflect.Constructor;
import java.util.List;
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

    public void criar(Contato contato) {
        repository.add(contato);
        // if (categoria.equalsIgnoreCase("1")) {
        //     repository.add(new ContatoTelefone(nome, sobrenome, contato, categoria, aniversario));

        // } else if (categoria.equalsIgnoreCase("2")) {
        //     repository.add(new ContatoEmail(nome, sobrenome, contato, categoria, email));

        // } else if (categoria.equalsIgnoreCase("3")) {
        //     repository.add(new ContatoWhatsApp(nome, sobrenome, contato, categoria));

        // } else {
        //     throw new IllegalArgumentException("Tipo de contato desconhecida: ");
        // }
    }

    public Contato get(int index) {
        return repository.getAll().get(index);
    }

    public List<Contato> buscar(String termo, int digit) {
        return repository.search(termo, digit);
    }

    public List<Contato> getContatos() {
        return repository.getAll();
    }

    public boolean existe(String contato) {
        return repository.exists(contato);
    }

    public void remover(Contato c) {
        repository.remove(c);
    }

    public void editar(Contato contato) {
        if (categoria.equalsIgnoreCase("1")) {
            repository.update(new ContatoTelefone(nome, sobrenome, contato, categoria, aniversario));

        } else if (categoria.equalsIgnoreCase("2")) {
            repository.update(new ContatoEmail(nome, sobrenome, contato, categoria, email));

        } else if (categoria.equalsIgnoreCase("3")) {
            repository.update(new ContatoWhatsApp(nome, sobrenome, contato, categoria));

        } else {
            throw new IllegalArgumentException("Tipo de contato desconhecida: ");
        }
    }
}
