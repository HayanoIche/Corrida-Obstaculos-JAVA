package br.com.fiap.jogo.model;

import java.util.Random;

public class Dado
{
    public int lancar()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
