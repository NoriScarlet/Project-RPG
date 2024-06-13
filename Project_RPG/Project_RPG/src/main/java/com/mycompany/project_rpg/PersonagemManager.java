/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_rpg;

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class PersonagemManager {
    private List<Personagem> personagens;

    public PersonagemManager() {
        this.personagens = new ArrayList<>();
        cadastrarPersonagensAutomaticamente();
    }

    // Método para cadastrar personagens automaticamente
    private void cadastrarPersonagensAutomaticamente() {
        personagens.add(new Guerreiro("Alice", 30, "Guerreiro", 7000, 120, 70, 65));
        personagens.add(new Mago("Bob", 45, "Mago", 12000, 70, 90, 75));
        personagens.add(new Mago("Carol", 28, "Mago", 5000, 100, 65, 70));
        personagens.add(new Guerreiro("David", 35, "Guerreiro", 6500, 120, 45, 80));
        personagens.add(new Guerreiro("Eve", 40, "Guerreiro", 8500, 70, 90, 85));
        personagens.add(new Mago("Frank", 50, "Mago", 15000, 70, 95, 50));
        personagens.add(new Guerreiro("Grace", 32, "Guerreiro", 9000, 100, 60, 20));
    }

    // Método para cadastrar um novo personagem
    public void cadastrarGuerreiro(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        
        String classe = "Guerreiro";
        System.out.print("Ouro: ");
        double ouro = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Vida: ");
        double vida = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Forca: ");
        int forca = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Destreza: ");
        int destreza = scanner.nextInt();

        Guerreiro guerreiro = new Guerreiro(nome, idade, classe, ouro, vida, forca, destreza);
        personagens.add(guerreiro);
        System.out.println("Guerreiro cadastrado com sucesso!");
    }
    
    public void cadastrarMago(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        
        String classe = "Mago";
        System.out.print("Ouro: ");
        double ouro = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Vida: ");
        double vida = scanner.nextDouble();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("intelecto: ");
        int intelecto = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha
        System.out.print("mana: ");
        int mana = scanner.nextInt();

        Mago mago = new Mago(nome, idade, classe, ouro, vida, intelecto, mana);
        personagens.add(mago);
        System.out.println("Guerreiro cadastrado com sucesso!");
    }

    // Método para listar todos os personagens
    public void listarPersonagens() {
        System.out.printf("%-20s %-10s %-20s %-10s %-20s %-15s %-20s%n", "Nome", "Idade", "Classe", "Forca", "Destreza", "Intelecto", "mana");
        for (Personagem p : personagens) {
            if (p instanceof Guerreiro) {
                Guerreiro h = (Guerreiro) p;
                System.out.printf("%-20s %-10d %-20s %-10d %-20s %-15s %-20s%n", h.getNome(), h.getIdade(), h.getClasse(), h.getForca(), h.getDestreza(), "", "");
            } else if (p instanceof Mago) {
                Mago v = (Mago) p;
                System.out.printf("%-20s %-10d %-20s %-10s %-20s %-15d %-20s%n", v.getNome(), v.getIdade(), v.getClasse(), "", "", v.getIntelecto(), v.getMana());
            } else {
                System.out.printf("%-20s %-10d %-20s%n", p.getNome(), p.getIdade(), p.getClasse());
            }
        }
    }
    
    
    // Método para remover um personagem
    public void removerPersonagem(String nome, Scanner scanner) {
        Personagem personagem = buscarPersonagem(nome);
        if (personagem != null) {
            System.out.print("Tem certeza que deseja remover o personagem " + nome + "? (s/n): ");
            String confirmacao = scanner.nextLine();
            if (confirmacao.equalsIgnoreCase("s")) {
                personagens.remove(personagem);
                System.out.println("Personagem removido com sucesso!");
            } else {
                System.out.println("Remoção cancelada.");
            }
        } else {
            System.out.println("Personagem não encontrado.");
        }
    }
    
    // Método para modificar um personagem
    public void modificarPersonagem(String nome, Scanner scanner) {
        Personagem personagem = buscarPersonagem(nome);
        if (personagem != null) {
            System.out.print("Novo nome (deixe em branco para não modificar): ");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                personagem.setNome(novoNome);
            }
            System.out.print("Nova idade (deixe em branco para não modificar): ");
            String novaIdade = scanner.nextLine();
            if (!novaIdade.isEmpty()) {
                personagem.setIdade(Integer.parseInt(novaIdade));
            }
            System.out.print("Nova classe (deixe em branco para não modificar): ");
            String novaClasse = scanner.nextLine();
            if (!novaClasse.isEmpty()) {
                personagem.setClasse(novaClasse);
            }
            System.out.print("Novo ouro (deixe em branco para não modificar): ");
            String novoOuro = scanner.nextLine();
            if (!novoOuro.isEmpty()) {
                personagem.setOuro(Double.parseDouble(novoOuro));
            }
            System.out.print("Nova vida (deixe em branco para não modificar): ");
            String novaVida = scanner.nextLine();
            if (!novaVida.isEmpty()) {
                personagem.setVida(Double.parseDouble(novaVida));
            }

            if (personagem instanceof Guerreiro) {
                Guerreiro guerreiro = (Guerreiro) personagem;
                System.out.print("Nova Forca (deixe em branco para não modificar): ");
                String novoForca = scanner.nextLine();
                if (!novoForca.isEmpty()) {
                    guerreiro.setForca(Integer.parseInt(novoForca));
                }
                System.out.print("Nova Destreza (deixe em branco para não modificar): ");
                String novaDestreza = scanner.nextLine();
                if (!novaDestreza.isEmpty()) {
                    guerreiro.setForca(Integer.parseInt(novoForca));
                }
            } else if (personagem instanceof Mago) {
                Mago mago = (Mago) personagem;
                System.out.print("Novo Intelecto (deixe em branco para não modificar): ");
                String novoIntelecto = scanner.nextLine();
                if (!novoIntelecto.isEmpty()) {
                    mago.setIntelecto(Integer.parseInt(novoIntelecto));
                }
                System.out.print("Nova Mana (deixe em branco para não modificar): ");
                String novaMana = scanner.nextLine();
                if (!novaMana.isEmpty()) {
                    mago.setMana(Integer.parseInt(novaMana));
                }
            }

            System.out.println("Personagem modificado com sucesso!");
        } else {
            System.out.println("Personagem não encontrado.");
        }
    }
    
    // Método auxiliar para buscar um personagem pelo nome
    private Personagem buscarPersonagem(String nome) {
        for (Personagem p : personagens) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // Método para exibir o menu de opções ao usuário
    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Cadastrar Guerreiro");
        System.out.println("2. Cadastrar Mago");
        System.out.println("3. Listar Personagens");
        System.out.println("4. Remover Personagem");
        System.out.println("5. Modificar Personagem");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }
}

