package com.gui;

import java.util.HashSet;

public class Exercicio05 {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        System.out.println("Tamanho após adicionar Ana: " + nomes.size());
        nomes.add("Ana");
        System.out.println("Tamanho após repetir Ana: " + nomes.size());
    }
}
