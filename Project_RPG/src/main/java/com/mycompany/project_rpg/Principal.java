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
    private static PersonagemManager personagemManager = new PersonagemManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //menu de opções do sistema
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarPersonagem();
                    break;
                case 2:
                    listarPersonagens();
                    break;
                case 3:
                    System.out.println("Saindo do sistema.");
                    return;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
//metodo pra informar o usuario
    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Personagem");
        System.out.println("2. Listar Personagens");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }
//metodo de cadastro de personagem
    private static void cadastrarPersonagem() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Classe: ");
        String classe = scanner.nextLine();
        System.out.print("Ouro: ");
        double ouro = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("vida: ");
        double vida = scanner.nextDouble();

        Personagem personagem = new Personagem(nome, idade, classe, ouro, vida);
        personagemManager.cadastrarPersonagem(personagem);
        System.out.println("personagem cadastrado com sucesso!");
    }
//metodo para listagem tabular de personagens
    private static void listarPersonagens() {
        List<Personagem> personagens = personagemManager.listarPersonagens();
        System.out.printf("%-20s %-10s %-20s%n", "Nome", "Idade", "Classe");
        for (Personagem f : personagens) {
            System.out.printf("%-20s %-10d %-20s%n", f.getNome(), f.getIdade(), f.getClasse());
        }
    }


}


