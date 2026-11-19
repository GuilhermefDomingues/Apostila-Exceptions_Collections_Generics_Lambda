package com.gui;

import java.util.HashMap;

public class Exercicio06 {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Caderno", 10);
        estoque.put("Caneta", 20);
        estoque.put("Borracha", 5);
        System.out.println("Canetas no estoque: " + estoque.get("Caneta"));
    }
}
