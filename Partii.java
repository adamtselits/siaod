package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Partii {


    public static void main(String[] args) {
        System.out.println("Задача про партии и голосование:\n"+"Введите количество законопроектов, затем сами проекты\n");
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();

        Stack<String> zak = new Stack<>();
        for (int i = 0; i < k; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equals("Add")) {
                zak.push(parts[1]);
            } else if (parts[0].equals("Vote")) {
                if (zak.isEmpty()) {
                    System.out.println("No");
                    return;
                } else {
                    String last = zak.pop();
                    if (!last.equals(parts[1])) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }

        if (!zak.isEmpty()) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
