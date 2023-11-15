package br.edu.ifpb;

import java.util.Scanner;

import br.edu.ifpb.commands.CommandExecutor;

public class AgendaDeContatosConsoleApplication {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();

        
        System.out.println("oi");
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
            //     case 1 -> executor.executeCommand(new AdicionarContatoCommand());
            //     case 4 -> executor.executeCommand(new BuscarContatoCommand());
                case 6 -> System.out.println("Tchau!");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
