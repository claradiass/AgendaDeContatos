package br.edu.ifpb.commands;

import java.util.Scanner;

import br.edu.ifpb.domain.ContatoEmail;
import br.edu.ifpb.domain.ContatoTelefone;
import br.edu.ifpb.domain.ContatoWhatsApp;
import br.edu.ifpb.repository.ContatoRepository;
import br.edu.ifpb.service.ContatoService;

public class CriarContatoCommand implements Command {

  @Override
  public void execute() {
    ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());

    System.out.println("\n=============================\n Criar Contato\n=============================");

  }
  
}
