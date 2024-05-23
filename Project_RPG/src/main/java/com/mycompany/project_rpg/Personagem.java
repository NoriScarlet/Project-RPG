/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_rpg;

/**
 *
 * @author Pichau
 */
public class Personagem {
    private String nome;
    private int idade;
    private String classe;
    private double ouro;
    private double vida;

    public Personagem(String nome, int idade, String classe, double ouro, double vida) {
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;
        this.ouro = ouro;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getClasse() {
        return classe;
    }

    public double getOuro() {
        return ouro;
    }

    public double getVida() {
        return vida;
    }
   
}


