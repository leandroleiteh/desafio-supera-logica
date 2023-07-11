package supera_2;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double value = sc.nextDouble();

        System.out.println("NOTAS: ");

        double result = Math.floor(value / 100);
        System.out.printf("%.0f " + "nota(s) de R$ 100.00 %n", result);
        value = value % 100;

        result = Math.floor(value / 50);
        System.out.printf("%.0f" + " nota(s) de R$ 50.00 %n", result);
        value = value % 50;

        result = Math.floor(value / 20);
        System.out.printf("%.0f" + " nota(s) de R$ 20.00 %n", result);
        value = value % 20;

        result = Math.floor(value / 10);
        System.out.printf("%.0f" + " nota(s) de R$ 10.00 %n", result);
        value = value % 10;

        result = Math.floor(value / 5);
        System.out.printf("%.0f" + " nota(s) de R$ 5.00 %n", result);
        value = value % 5;

        result = Math.floor(value / 2);
        System.out.printf("%.0f" + " nota(s) de R$ 2.00 %n", result);
        value = value % 2;

        System.out.println("MOEDAS");

        result = Math.floor(value / 1);
        System.out.printf("%.0f" + " moeda(s) de R$ 1.00 %n", result);
        value = value % 1;

        result = Math.floor(value / 0.50);
        System.out.printf("%.0f" + " moeda(s) de R$ 0.50 %n", result);
        value = value % 0.50;

        result = Math.floor(value / 0.25);
        System.out.printf("%.0f" + " moeda(s) de R$ 0.25 %n", result);
        value = value % 0.25;

        result = Math.floor(value / 0.10);
        System.out.printf("%.0f" + " moeda(s) de R$ 0.10 %n", result);
        value = value % 0.10;

        result = Math.floor(value / 0.05);
        System.out.printf("%.0f" + " moeda(s) de R$ 0.05 %n", result);
        value = value % 0.05;

        result = Math.floor(value / 0.01);
        System.out.printf("%.0f" + " moeda(s) de R$ 0.01 %n", result);
        value = value % 0.01;

        sc.close();

    }
}
