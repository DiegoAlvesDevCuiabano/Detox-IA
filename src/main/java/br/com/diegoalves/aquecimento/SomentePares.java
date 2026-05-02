package br.com.diegoalves.aquecimento;

import java.util.ArrayList;
import java.util.List;

public class SomentePares {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(482, 15, 927, 304, 118, 76, 650, 231, 999, 12,
                543, 87, 321, 765, 432, 210, 654, 98, 111, 876,
                345, 222, 678, 901, 56, 789, 333, 444, 555, 666,
                777, 888, 999, 100, 200, 300, 400, 500, 600, 700,
                800, 900, 135, 246, 357, 468, 579, 680, 791, 802,
                913, 124, 235, 346, 457, 568, 679, 780, 891, 902,
                213, 324, 435, 546, 657, 768, 879, 980, 101, 202,
                303, 404, 505, 606, 707, 808, 909, 112, 223, 334,
                445, 556, 667, 778, 889, 990, 121, 232, 343, 454,
                565, 676, 787, 898, 909, 321, 654, 987, 147, 258));

        System.out.print("Segue somente os números pares: ");
        boolean isPrimeiro = true;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                if (isPrimeiro) {
                    System.out.print(numero);
                    isPrimeiro = false;
                } else {
                    System.out.print(", " + numero);
                }
            }
        }
        System.out.print(".");
    }
}
