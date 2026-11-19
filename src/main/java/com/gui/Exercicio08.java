package com.gui;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30);
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
