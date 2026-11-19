package com.gui;

import java.util.ArrayList;

public class Exercicio03 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        System.out.println("Tamanho: " + nomes.size());
        System.out.println("Índice 1: " + nomes.get(1));
    }
}
