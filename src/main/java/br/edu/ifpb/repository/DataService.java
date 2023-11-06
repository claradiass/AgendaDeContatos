package br.edu.ifpb.repository;

import java.util.List;
import br.edu.ifpb.domain.Contato;

public interface DataService {

    void add(Contato c);

    List<Contato> getAll();

    void update(Contato c);

    List<Contato> search(String termo, int digit);

    boolean exists(Contato c);

    void remove(Contato c);

    List<Contato> getContatosPorCategoria(String categoria);

    List<Contato> getContatosPorChamada(boolean chamadaDeVideo);
}
