package supera_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os valores: ");
        int N = sc.nextInt();
        List<Integer> orderToList = new ArrayList<>();

        int count = 0;
        while (true) {

            int addValue = sc.nextInt();
            orderToList.add(addValue);
            count++;

            if (count == N) break;
        }

        orderToList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        orderToList.stream()
                .filter(e -> e % 2 != 0)
                .sorted()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        sc.close();
    }
}
