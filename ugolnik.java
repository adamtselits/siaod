package com.company;

import java.util.Scanner;

public class ugolnik {


    static long nodGe3(long n) {
        for (long i = 3; i <= n; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Задача про правильный подмногоугольник:\n"+"Введите количество вершин\n");
        Scanner sc = new Scanner(System.in);
        long c = sc.nextLong();
        System.out.println(nodGe3(c));
    }
}
