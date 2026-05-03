package br.com.fiap.jogo.model;

import br.com.fiap.jogo.model.Dado;

import java.util.Scanner;

public class Jogo
{
    // Atributos
    private Jogador j1 = null;
    private Jogador j2 = null;
    private Jogador j3 = null;
    private Jogador j4 = null;

    private Dado dado = new Dado();

    private boolean running = true;

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
    public void jogar(Scanner scan)
    {
        while(running)
        {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("        TURNO        ");
            System.out.println("---------------------");
            System.out.println();

            for(int i = 0; i < 4; i += 1)
            {
                Jogador j = null;

                if (i == 0)
                {
                    if (j1 == null) { continue; }
                    j = j1;
                }
                else if (i == 1)
                {
                    if (j2 == null) { continue; }
                    j = j2;
                }
                else if (i == 2)
                {
                    if (j3 == null) { continue; }
                    j = j3;
                }
                else if (i == 3)
                {
                    if (j4 == null) { continue; }
                    j = j4;
                }

                System.out.println("Jogador " + j.getNome());

                System.out.println("É sua vez!");
                System.out.println("Aperte [enter] pra jogar o dado...");

                scan.nextLine();

                int valor_dado = dado.lancar();

                System.out.println("Você tirou " + valor_dado);

                j.setCasaAtual(j.getCasaAtual() + valor_dado);
            }

            running = false;
        }
    }
}
