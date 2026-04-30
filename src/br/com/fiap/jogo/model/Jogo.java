package br.com.fiap.jogo.model;

import br.com.jockey.model.Dado;

public class Jogo
{
    // Atributos
    private Jogador j1;
    private Jogador j2;
    private Jogador j3;
    private Jogador j4;

    private Dado dado;

    // Construtores
    public Jogo(Jogador j1, Jogador j2)
    {
        this.j1 = j1;
        this.j2 = j2;
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3, Jogador j4)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
    }
}
