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

public class PersonagemManager {
    private List<Personagem> Personagens;

    public PersonagemManager() {
        this.Personagens = new ArrayList<>();
        cadastrarPersonagensAutomaticamente();
    }

    private void cadastrarPersonagensAutomaticamente() {
        Personagens.add(new Personagem("Alice", 30, "Guerreiro", 7000, 120));
        Personagens.add(new Personagem("Bob", 45, "Mago", 12000, 70));
        Personagens.add(new Personagem("Carol", 28, "Paladino", 5000, 100));
        Personagens.add(new Personagem("David", 35, "Guerreiro", 6500, 120));
        Personagens.add(new Personagem("Eve", 40, "Mago", 8500, 70));
        Personagens.add(new Personagem("Frank", 50, "Mago", 15000, 70));
        Personagens.add(new Personagem("Grace", 32, "Paladino", 9000, 100));
    }

    public void cadastrarPersonagem(Personagem personagem) {
        Personagens.add(personagem);
    }

    public List<Personagem> listarPersonagens() {
        return Personagens;
    }


}

