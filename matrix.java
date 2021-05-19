package com.company;

import java.util.ArrayList;
import java.util.Random;

public class matrix {



    static void sortMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int dI = 0; dI < m + n - 1; ++dI) {
            int startX = dI < n ? 0 : dI - n;
            int startY = dI < n ? n - dI - 1 : 0;
            ArrayList<Integer> list = new ArrayList();

            int offset;
            int x;
            int y;
            for(offset = 0; offset >= 0; ++offset) {
                x = startX + offset;
                y = startY + offset;
                if (x >= m || y >= n) {
                    break;
                }

                list.add(mat[x][y]);
            }

            list.sort((a, b) -> {
                return a.compareTo(b);
            });

            for(offset = 0; offset >= 0; ++offset) {
                x = startX + offset;
                y = startY + offset;
                if (x >= m || y >= n) {
                    break;
                }

                mat[x][y] = (Integer)list.remove(0);
            }
        }

    }

    static void printMatrix(int[][] mat) {
        int[][] var1 = mat;
        int var2 = mat.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int[] line = var1[var3];
            int[] var5 = line;
            int var6 = line.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                int x = var5[var7];
                System.out.print(x + " ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int[][] mat = new int[n][m];
        Random rng = new Random();

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                mat[j][i] = rng.nextInt(90) + 10;
            }
        }

        System.out.println("Задача про сортировку диагоналей в матрице:\n"+"Исходная матрица");
        printMatrix(mat);
        sortMatrix(mat);
        System.out.println("Отсортированная матрица");
        printMatrix(mat);
    }
}
