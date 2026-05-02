package br.com.diegoalves.aquecimento;

public class SegundoMaiorArray {
    public static void main(String[] args) {
        int[] numeros = {
                482, 15, 927, 304, 118, 76, 650, 231, 999, 12,
                543, 87, 321, 765, 432, 210, 654, 98, 111, 876,
                345, 222, 678, 901, 56, 789, 333, 444, 555, 666,
                777, 888, 999, 100, 200, 300, 400, 500, 600, 700,
                800, 900, 135, 246, 357, 468, 579, 680, 791, 802,
                913, 124, 235, 346, 457, 568, 679, 780, 891, 902,
                213, 324, 435, 546, 657, 768, 879, 980, 101, 202,
                303, 404, 505, 606, 707, 808, 909, 112, 223, 334,
                445, 556, 667, 778, 889, 990, 121, 232, 343, 454,
                565, 676, 787, 898, 909, 321, 654, 987, 147, 258
        };
        int maior = numeros[0];
        int segundoMaior = numeros[0] - 1; // AHAHAHAHAHAHAHA
        for (int numero : numeros) {
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior && numero < maior) {
                segundoMaior = numero;
            }
        }
        System.out.println("O maior é " + maior);
        System.out.println("O segundo maior é " + segundoMaior);
    }
}
