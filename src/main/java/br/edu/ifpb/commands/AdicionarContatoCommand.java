package br.edu.ifpb.commands;

import br.edu.ifpb.repository.ContatoRepository;
import br.edu.ifpb.service.ContatoService;
import br.edu.ifpb.validators.TypeChoiceValidator;

import java.util.Scanner;

import br.edu.ifpb.commands.Command;
import br.edu.ifpb.validators.ContatoValidator;
import br.edu.ifpb.validators.DateValidator;
import br.edu.ifpb.validators.NonEmptyValidator;
import br.edu.ifpb.validators.ValidationContext;

public class AdicionarContatoCommand implements Command{
    @Override
    public void execute() {

        ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());

        System.out.println("\n--------------------------------------");
        System.out.println("Adicionar um novo contato");
        System.out.println("\n--------------------------------------");

        ValidationContext<String> nomeValidationContext = new ValidationContext<>(new NonEmptyValidator());
        String nome = nomeValidationContext.getValidValue("Nome: ", "Nome não pode ser vazio", String.class);
        
        ValidationContext<String> sobrenomeValidationContext = new ValidationContext<>(new NonEmptyValidator());
        String sobrenome = sobrenomeValidationContext.getValidValue("Nome: ", "Nome não pode ser vazio", String.class);
        
        System.out.println("");
        
        
        contatoService.criar(nome, sobrenome);

        
        System.out.println("\nPaciente cadastrado");
    }
}
