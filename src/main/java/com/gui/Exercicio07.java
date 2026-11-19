package com.gui;

import java.util.ArrayDeque;
import java.util.Queue;

public class Exercicio07 {
    public static void main(String[] args) {
        Queue<String> chamados = new ArrayDeque<>();
        chamados.add("Chamado 1");
        chamados.add("Chamado 2");
        chamados.add("Chamado 3");
        System.out.println("Removido: " + chamados.poll());
        System.out.println("Fila: " + chamados);
    }
}
