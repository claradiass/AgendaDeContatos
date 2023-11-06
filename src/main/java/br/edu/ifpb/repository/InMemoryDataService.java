package br.edu.ifpb.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifpb.domain.Contato;

public class InMemoryDataService implements DataService {
    protected List<Contato> contatos = new ArrayList<>();

    @Override
    public void add(Contato c){
        contatos.add(c);
    }

    @Override
    public List<Contato> getAll(){
        return contatos;
    }

    @Override
    public void update(Contato c) {
        int index = contatos.indexOf(c);
        contatos.set(index, c);
    }

    @Override
    public List<Contato> search(String termo, int digit) {
        return contatos.stream()
                .filter(p -> (p.getNome() + " " + p.getSobrenome()).toLowerCase().contains(termo.toLowerCase()) && p.getContato() == digit)
                .collect(Collectors.toList());
    }

    @Override
    public boolean exists(Contato c) {
        return contatos.stream().anyMatch(contact -> contact.getContato() == c.getContato());
    }

    @Override
    public void remove(Contato c){
        contatos.remove(c);
    }

    @Override
    public List<Contato> getContatosPorCategoria(String categoria){
        return contatos.stream()
            .filter(contato -> contato.getCategoria().equals(categoria))
            .collect(Collectors.toList());
    }

    @Override
    public List<Contato> getContatosPorChamada(boolean chamadaDeVideo){
        return contatos.stream()
        .filter(contato -> contato.isChamadaVideo() == chamadaDeVideo)
        .collect(Collectors.toList());
    }
}
