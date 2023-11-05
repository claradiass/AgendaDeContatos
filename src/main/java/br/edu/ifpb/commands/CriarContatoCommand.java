package br.edu.ifpb.commands;

import br.edu.ifpb.repository.ContatoRepository;
import br.edu.ifpb.service.ContatoService;

public class CriarContatoCommand implements Command {

  @Override
  public void execute() {
    ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());
  }
  
}
