package br.com.diegoalves.aquecimento;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        // exe: arara
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = palavra.length() -1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }

        if (palavraInvertida.toString().equals(palavra)) {
            System.out.println(palavra + " é um palindromo");
        } else {
            System.out.println(palavra + " não é um palindromo");
        }
    }
}
