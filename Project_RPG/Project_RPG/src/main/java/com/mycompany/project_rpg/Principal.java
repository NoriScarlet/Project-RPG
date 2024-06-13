/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_rpg;



/**
 *
 * 
 */
import java.util.List;
import java.util.Scanner;

public class Principal {
    private PersonagemManager personagemManager = new PersonagemManager();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.executar();
    }

    // Método para executar o menu principal
    public void executar() {
        // Menu de opções do sistema
        while (true) {
            personagemManager.exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    personagemManager.cadastrarGuerreiro(scanner);
                    break;
                case 2:
                    personagemManager.cadastrarMago(scanner);
                    break;
                case 3:
                    personagemManager.listarPersonagens();
                    break;
                case 4:
                    System.out.print("Nome do personagem a remover: ");
                    String nomeRemover = scanner.nextLine();
                    personagemManager.removerPersonagem(nomeRemover, scanner);
                    break;
                case 5:
                    System.out.print("Nome do personagem a modificar: ");
                    String nomeModificar = scanner.nextLine();
                    personagemManager.modificarPersonagem(nomeModificar, scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


