package supera_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();

        System.out.println("Digite o valor alvo: ");
        int k = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Digite os " + n + " valores do array de sua escolha.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int saber;
        for (int i = 0; i < n; i++) {
            for (int j = 1 + 1; j < n; j++) {
                if (arr[i] - arr[j] == k) {
                    saber = arr[i] - arr[j];
                    System.out.println(saber);
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();

    }
}
