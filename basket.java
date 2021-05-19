package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class basket {

    public static void main(String[] args) {
        System.out.println("Задача про баскетбол:\n"+"Введите параметры игроков\n");
        int[] pmin = new int[]{190, 200, 10, 2, 3};// изначальные данные
        int[] pmiddle = new int[]{210, 225, 15, 4, 5};
        int[] pmax = new int[]{220, 250, 20, 6, 7};

        Scanner sc = new Scanner(System.in);

        int gamers_amount = sc.nextInt();
        sc.nextLine();

        ArrayList<int[]> characteristics = new ArrayList<>();
        for (int i = 0; i < gamers_amount; i++) {
            characteristics.add(new int[5]);
            for (int j = 0; j < 5; j++) {
                characteristics.get(i)[j] = sc.nextInt();
                sc.nextLine();
            }
        }


        for(int i = 0; i < gamers_amount; i++) {
            int score_great = 0;
            int score_good = 0;
            int score_okay = 0;
            for(int j = 0; j < 5; j++) {
                if(characteristics.get(i)[j] > pmax[j]) {
                    score_great += 1;
                }
                if(pmax[j] >= characteristics.get(i)[j] && characteristics.get(i)[j] >= pmiddle[j]) {
                    score_good += 1;
                }
                if(pmiddle[j] > characteristics.get(i)[j] && characteristics.get(i)[j] > pmin[j]) {
                    score_okay += 1;
                }
            }
            if(score_great >= 3 && (characteristics.get(i)[0] > pmax[0] || characteristics.get(i)[1] > pmax[1])) {
                System.out.println(0);
            }
            else if(score_great >=2 && score_good >= 1 || score_okay == 5 && score_good >= 3){
                System.out.println(1);
            }
            else if(score_great >=1 && score_good >=1 || score_good >=3){
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }

    }
}
