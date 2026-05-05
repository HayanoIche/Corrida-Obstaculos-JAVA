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

    private String estadoFimDeJogo = "";
    private Jogador vencedor = null;

    int numeroDesqualificados;
    int quantidadeJogadores;

    private boolean running = true;

    // Construtores
    public Jogo(Jogador j1, Jogador j2)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.quantidadeJogadores = 2;
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.quantidadeJogadores = 3;
    }

    public Jogo(Jogador j1, Jogador j2, Jogador j3, Jogador j4)
    {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
        this.quantidadeJogadores = 4;
    }

    // Métodos Workers
    public String verificaJogada(Jogador j, int numeroDado)
    {
        String info = "";

        if (j != null)
        {
            if (j.getCasaAtual() == 0)
            {
                info = "Saiu do jogo";
            }
            else if (j.getCasaAtual() == 18)
            {
                info = "Casa com Desenho!\nO cavalo desviou do obstáculo. Volte para o nº 12!\n";
                j.setCasaAtual(12);
            }
            else if (j.getCasaAtual() == 31)
            {
                info = "Casa com Desenho!\nO cavalo derrubou o cavaleiro. Recomece a corrida! Volte para o nº 1!\n";
                j.setCasaAtual(1);
            }
            else if (j.getCasaAtual() == 44)
            {
                info = "Casa com Desenho!\nSeu cavalo galopa bem e está perto da chegada. Avance mais uma vez com o número que você tirou no dado\n";
                j.setCasaAtual(j.getCasaAtual() + numeroDado);
            }
            else if (j.getCasaAtual() == 53)
            {
                info = "Casa com Desenho!\nO cavaleiro perdeu o equilibrio. Perca duas rodadas\n";
                j.perderDuasRodadas();
            }
            else if (j.getCasaAtual() == 62)
            {
                info = "Casa com Desenho!\nO cavalo caiu no fosso. O jogador sai do jogo\n";
                j.setCasaAtual(0);
            }
            else if (j.getCasaAtual() >
                    = 72)
            {
                info = "Chegada!\nO cavalo venceu a corrida!\n";
                estadoFimDeJogo = "Ganharam";
                vencedor = j;
                running = false;
            }
        }

        return info;
    }

    public void jogar(Scanner scan)
    {
        while(running)
        {
            System.out.println();
            System.out.println("---------------------");
            System.out.println("        TURNO        ");
            System.out.println("---------------------");
            System.out.println();

            numeroDesqualificados = 0;

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

                if (j.podeJogar())
                {
                    if (j.getCasaAtual() != 0) {
                        System.out.println("É sua vez!");
                        System.out.println("Aperte [enter] pra jogar o dado...");

                        scan.nextLine();

                        int valor_dado = dado.lancar();

                        System.out.println("Você tirou " + valor_dado);
                        j.setCasaAtual(j.getCasaAtual() + valor_dado);

                        System.out.println(j.getNome() + " agora está na casa " + j.getCasaAtual());

                        String info = verificaJogada(j, valor_dado);

                        if (running == false)
                        {
                            break;
                        }

                        System.out.println(info);
                    }
                    else {
                        System.out.println("Não está mais jogando.");
                        numeroDesqualificados += 1;
                    }
                }
                else
                {
                    System.out.println("Você perdeu essa partida...");
                    scan.nextLine();
                }

                if (numeroDesqualificados == quantidadeJogadores)
                {
                    running = false;
                }
            }
        }

        if (estadoFimDeJogo == "Ganharam")
        {
            System.out.println("PARABÉNS " + vencedor.getNome());
            System.out.println("Você venceu o jogo dos obstaculos!!!");
            System.out.println("Que incrível!");
        }
        else
        {
            System.out.println("Infelizmente todos os cavalos cairam no bueiro!");
            System.out.println("Ninguém venceu...");
            System.out.println("Aff");
        }
    }
}
