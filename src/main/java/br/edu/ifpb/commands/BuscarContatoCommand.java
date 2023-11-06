package br.edu.ifpb.commands;

import java.util.List;

import br.edu.ifpb.repository.ContatoRepository;
import br.edu.ifpb.service.ContatoService;
import br.edu.ifpb.commands.Command;

public class BuscarContatoCommand implements Command{
    @Override
    public void execute(){
        ContatoService contatoService = new ContatoService(ContatoRepository.getInstance());

        System.out.println("\n--------------------------------------");
        System.out.println("Buscar contatos\n");

        System.out.print("Digite parte do nome para buscar: ");
        ValidationContext<String> strValidationContext = new ValidationContext<>(new NonEmptyValidator());
        String nome = strValidationContext.getValidValue(
            "Nome não pode ser vazio. Digite parte do nome para buscar: ",
            "Termo de busca não pode ser vazio",
            String.class
        );

        // Validação para o número (int)
        // System.out.print("Digite o número para buscar: ");
        // ValidationContext<Integer> intValidationContext = new ValidationContext<>(new IntegerValidator()); // Crie um validador para números inteiros
        // int numero = intValidationContext.getValidValue(
        //     "Número inválido. Digite um número para buscar: ",
        //     "Número não pode ser vazio ou não é um número válido",
        //     Integer.class
        // );

        List<Contato> resultado = contatoService.buscar(nome);

        System.out.println("\nResultado:\n");
        for (Contato c: resultado) {
            System.out.println(c);
        }
    }
}
