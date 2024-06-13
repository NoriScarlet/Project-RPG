/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_rpg;

/**
 *
 * @author Pichau
 */
public class Mago extends Personagem {
    private int mana;
    private int intelecto;

    public Mago(String nome, int idade, String classe, double ouro, double vida, int intelecto, int mana) {
        super(nome, idade, classe, ouro, vida);
        this.intelecto = intelecto;
        this.mana = mana;
    }

    // Métodos getters e setters
    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
