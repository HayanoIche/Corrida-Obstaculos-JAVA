package br.com.fiap.jogo.model;

import java.util.Scanner;

public class Jogador
{
    // Atributos
    private String nome;
    private int idade;
    private int casaAtual = 0;

    // Construtor Vazio
    public Jogador() {}

    public Jogador(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters & Setters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getCasaAtual() { return casaAtual; }

    public void setNome(String nome) { this.nome = nome; }

    public void setIdade(int idade) { this.idade = idade; }
    public void setCasaAtual(int casaAtual) { this.casaAtual = casaAtual; }

}
