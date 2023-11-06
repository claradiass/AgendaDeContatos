package br.edu.ifpb.commands;

import br.edu.ifpb.domain.ContatoEmail;
import br.edu.ifpb.domain.ContatoTelefone;
import br.edu.ifpb.domain.ContatoWhatsApp;
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
        Scanner sc = new Scanner(System.in);

        ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());

        System.out.println("\n--------------------------------------");
        System.out.println("Adicionar um novo contato");
        System.out.println("\n--------------------------------------");

        NonEmptyValidator<String> nomeValidationContext = new NonEmptyValidator<>();

        String nome = nomeValidationContext.getValidValue("Nome: ", "Nome não pode ser vazio", String.class);

        ValidationContext<String> sobrenomeValidationContext = new ValidationContext<>(new NonEmptyValidator());
        String sobrenome = sobrenomeValidationContext.getValidValue("Nome: ", "Nome não pode ser vazio", String.class);

        int contato = sc.nextInt();

        System.out.println("\n--------------------------------------");
        System.out.println("Escolha qual vai ser o tipo do contato");
        System.out.println("[1] - Telefone \n [2] - Email \n [3] - WhatsApp");
        System.out.println("\n--------------------------------------");

        ValidationContext<Integer> tipoContatoValidationContext = new ValidationContext<>(new TypeChoiceValidator());
        int tipoContato = -1; // Inicialize com um valor inválido

        while (tipoContato < 1 || tipoContato > 3) {
            System.out.println("Escolha qual será o tipo do contato");
            System.out.println("[1] - Telefone\n[2] - Email\n[3] - WhatsApp");
            System.out.print("Escolha uma opção (1/2/3): ");
            tipoContato = tipoContatoValidationContext.getValidValue("Opção inválida. Escolha uma opção válida (1/2/3): ", "Opção inválida", Integer.class);
        }

        switch (tipoContato) {
                case 1:
                    strValidationContext.setValidator(new DateValidator());
                    String aniversario = strValidationContext.getValidValue("Aniversário: ", "Formato de data incorreto, use o formato 'dd/MM/yyyy'", String.class);
                    agenda.adicionarContato(new ContatoTelefone(nome, sobrenome, contato, false, "1", aniversario));
                    break;
                case 2:
                    System.out.print("Email: ");
                    String email = leitor.next();
                    agenda.adicionarContato(new ContatoEmail(nome, sobrenome, contato, false,"2" , email));
                    break;
                case 3:
                    agenda.adicionarContato(new ContatoWhatsApp(nome, sobrenome, contato, true, "3"));
                    break;
            }


        
        System.out.println("\nPaciente cadastrado");
    }
}
