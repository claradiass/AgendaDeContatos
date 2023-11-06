package br.edu.ifpb.service;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

import br.edu.ifpb.domain.Contato;
import br.edu.ifpb.domain.RedeSocial;
import br.edu.ifpb.repository.ContatoRepository;

public class ContatoService {
    private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    public void criar(String nome, String sobrenome, boolean ligacao, boolean chamadaVideo, String categoria,
            String tipoDeEntrada, String valorDaEntrada, RedeSocial redeSocial) {
        repository.add(new Contato(nome, sobrenome, ligacao, chamadaVideo, categoria, tipoDeEntrada, valorDaEntrada, redeSocial));
    }

    public Contato get(int index) {
        return repository.getAll().get(index);
    }

    public List<Contato> buscar(String termo) {
        return repository.search(termo);
    }

    public List<Contato> getContatos() {
        return repository.getAll();
    }

    public boolean existe(Contato contato) {
        return repository.exists(contato);
    }

    public void remover(Contato c) {
        repository.remove(c);
    }

    public void editar(String nome, String sobrenome, boolean ligacao, boolean chamadaVideo, String categoria,
            String tipoDeEntrada, String valorDaEntrada, RedeSocial redeSocial) {
        repository.update(new Contato(nome, sobrenome, ligacao, chamadaVideo, categoria, tipoDeEntrada, valorDaEntrada, redeSocial));
    }
}
