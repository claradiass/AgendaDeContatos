package agendadecontatos;

import java.util.*;

import main.java.br.edu.ifpb.commands.AdicionarContatoCommand;
import main.java.br.edu.ifpb.commands.BuscarContatoCommand;
import main.java.br.edu.ifpb.commands.CommandExecutor;


import br.edu.ifpb.commands.*;
import main.java.br.edu.ifpb.repository.ContatoRepository;
import main.java.br.edu.ifpb.repository.FileDataService;

public class AgendaDeContatosConsoleApplication {

        public static void main(String[] args) {
        ContatoRepository dataService = ContatoRepository.getInstance();
        dataService.setRepository(new FileDataService());
        CommandExecutor executor = new CommandExecutor();

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 7) {
            System.out.println("\n=================================");
            System.out.println("MENU");
            System.out.println("[1] - Adicionar contatos");
            System.out.println("[4] - Buscar contatos");
            System.out.println("[6] - Sair");

            System.out.print("Digite a opção -> ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> executor.executeCommand(new AdicionarContatoCommand());
                case 4 -> executor.executeCommand(new BuscarContatoCommand());
                case 6 -> System.out.println("Tchau!");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
