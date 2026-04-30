package br.com.fiap.jogo.model;

import br.com.fiap.jogo.model.Dado;

public class Jogo
{
    // Atributos
    private Jogador j1 = null;
    private Jogador j2 = null;
    private Jogador j3 = null;
    private Jogador j4 = null;

    private Dado dado;

    private boolean running;

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

    // Métodos Workers
    public void jogar()
    {
        while(running)
        {
            for(int i = 0; i < 4; i += 1)
            {

            }

            running = false;
        }
    }
}
