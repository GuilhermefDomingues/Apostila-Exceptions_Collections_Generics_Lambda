package com.gui;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        validarIdade(idade);
        System.out.println("Idade válida.");
    }

    static void validarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
    }
}
