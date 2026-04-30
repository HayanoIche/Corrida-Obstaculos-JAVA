package br.com.fiap.jogo.app;

import br.com.fiap.jogo.model.Dado;
import br.com.fiap.jogo.model.Jogador;

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

        // Cadastrar Jogadores
        Jogador[] jogadores = new Jogador[4];

        int menor = -1;
        int menor_idade = 1000;

        for(int i = 0; i < quantidade; i += 1)
        {
            System.out.print("Digite o nome do " + (i + 1) + "º jogador: ");
            String nome = scanner.next() + scanner.nextLine();

            System.out.print("Digite a idade do " + (i + 1) + "º jogador: ");
            int idade = scanner.nextInt();

            if (idade < menor_idade)
            {
                menor_idade = idade;
                menor = i;
            }

            jogadores[i] = new Jogador(nome, idade);
        }

        System.out.println("o " + (menor+1) +"º jogador é o mais novo, ele começa");

        int[] ordem = new int[4];

        for(int i = 0; i < quantidade; i += 1)
        {
            if (i == 0)
            {
                ordem[i] = menor;
                continue;
            }


            
        }

        // Instanciando o dado
        Dado dado = new Dado();

        // Programa principal
        boolean running = true;
        while(running)
        {

        }
    }
}