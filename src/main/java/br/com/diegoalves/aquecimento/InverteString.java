package br.com.diegoalves.aquecimento;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============InverteString============");
        System.out.print("Por favor, informe uma palavra: ");
        String palavra = sc.nextLine();
        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = palavra.length(); i > 0; i--) {
            palavraInvertida.append(palavra.charAt(i - 1));
        }
        System.out.println(palavraInvertida);

    }
}
