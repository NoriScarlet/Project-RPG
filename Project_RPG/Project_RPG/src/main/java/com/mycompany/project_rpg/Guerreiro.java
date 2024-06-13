/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_rpg;

/**
 *
 * @author Pichau
 */
public class Guerreiro extends Personagem {
    private int forca;
    private int destreza;

    public Guerreiro(String nome, int idade, String classe, double ouro, double vida, int forca, int destreza) {
        super(nome, idade, classe, ouro, vida);
        this.forca = forca;
        this.destreza = destreza;
    }

    // Métodos getters e setters
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}

