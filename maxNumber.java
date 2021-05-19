package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maxNumber {


    public static void main(String[] args) {
        int[] arr = new int[] {
                3,30,34,5,9
        };
        System.out.println("Задача про максимальное число:\n"+"Max num = " + maxNum(arr));
        // write your code here
    }

    public static String maxNum(int[] nums) {
        String str = "";
        List<Integer> list = new ArrayList<>(nums.length);
        for (int x : nums) {
            list.add(x);
        }
        list.sort((a, b) -> measure(b) - measure(a));
        for (int x : list) {
            str += x;
        }
        return str;
    }

    public static int measure(int n) {
        if (n < 10) { return 100*n + 10*n + n; }
        else if (n < 100) { return 10*n + n%10; }
        else if (n < 1000) { return n; }
        else { return -1; }
    }
}
