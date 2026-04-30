package br.com.fiap.jogo.app;

import br.com.fiap.jogo.model.Dado;
import br.com.fiap.jogo.model.Jogador;
import br.com.fiap.jogo.model.Jogo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("   CORRIDA DE OBSTÁCULOS   ");
        System.out.println("---------------------------");

        System.out.println("\nCADASTRO DOS JOGADORES\n");

        // Pegando a quantidade de jogadores
        int quantidade = 0;

        while (quantidade < 2 || quantidade > 4)
        {
            System.out.print("Digite a quantidade de jogadores (2-4): ");
            quantidade = scanner.nextInt();

            if (quantidade < 2 || quantidade > 4)
            {
                System.out.println("ERRO! Número de jogadores inválido!");
                System.out.println("(Digite algo entre 2 e 4)");
            }
        }

        // Loop principal do jogo
        Jogo app;

        String nome;
        int idade;

        System.out.print("Digite o nome do 1º jogador: ");
        nome = scanner.next() + scanner.nextLine();
        System.out.print("Digite a idade do 1º jogador: ");
        idade = scanner.nextInt();

        Jogador j1 = new Jogador(nome, idade);

        System.out.print("Digite o nome do 2º jogador: ");
        nome = scanner.next() + scanner.nextLine();
        System.out.print("Digite a idade do 2º jogador: ");
        idade = scanner.nextInt();

        Jogador j2 = new Jogador(nome, idade);

        if (quantidade == 3)
        {
            System.out.print("Digite o nome do 3º jogador: ");
            nome = scanner.next() + scanner.nextLine();
            System.out.print("Digite a idade do 3º jogador: ");
            idade = scanner.nextInt();

            Jogador j3 = new Jogador(nome, idade);

            app = new Jogo(j1, j2, j3);
        }
        else if (quantidade == 4)
        {
            System.out.print("Digite o nome do 3º jogador: ");
            nome = scanner.next() + scanner.nextLine();
            System.out.print("Digite a idade do 3º jogador: ");
            idade = scanner.nextInt();

            Jogador j3 = new Jogador(nome, idade);

            System.out.print("Digite o nome do 3º jogador: ");
            nome = scanner.next() + scanner.nextLine();
            System.out.print("Digite a idade do 3º jogador: ");
            idade = scanner.nextInt();

            Jogador j4 = new Jogador(nome, idade);

            app = new Jogo(j1, j2, j3, j4);
        }
        else
        {
            app = new Jogo(j1, j2);
        }

        app.jogar();
    }
}