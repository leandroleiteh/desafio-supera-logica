package supera_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> listMess = new ArrayList<>();

        System.out.println("Digite a quantidade de frases que deseja corrigir: ");
        int n = sc.nextInt();

        System.out.println("Digite as frases: ");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String prharse = sc.nextLine();
            listMess.add(prharse);
        }

        for (String list : listMess) {
            StringBuilder part1 = new StringBuilder(list.substring(0, list.length() / 2));
            StringBuilder part2 = new StringBuilder(list.substring(list.length() / 2, list.length()));
            part1.reverse();
            part2.reverse();
            System.out.println(part1.toString() + part2.toString());
        }

    }
}
