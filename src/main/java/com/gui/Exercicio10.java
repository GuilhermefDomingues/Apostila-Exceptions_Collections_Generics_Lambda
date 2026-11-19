package com.gui;

public class Exercicio10 {
    public static void main(String[] args) {
        Saudacao saudacao = nome -> System.out.println("Oi, " + nome + "!");
        saudacao.saudar("Ana");
    }

    @FunctionalInterface
    interface Saudacao {
        void saudar(String nome);
    }
}
