package br.com.diegoalves.aquecimento;

import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        StringBuilder vogal = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                if (!vogal.toString().contains(String.valueOf(letra))) {
                    vogal.append(letra);
                    if (i + 1 == palavra.length()) {
                        vogal.append(".");
                    } else {
                        vogal.append(", ");
                    }
                }
            }
        }
        System.out.println("As vogais dessa palavra são: " + vogal);
    }
}
