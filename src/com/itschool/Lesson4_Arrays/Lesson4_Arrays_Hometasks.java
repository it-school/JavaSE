package com.itschool.Lesson4_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Lesson4_Arrays_Hometasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        int[] a = new int[35];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50) * 100;
            sum += a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Общее число книг " + sum);
        System.out.println("Общее число книг есть 6 значное число = " + ((sum > 99999 && sum < 1000000) ? "Правда" : "Ложь"));
        System.out.println();
    }

    private static void task2() {
        int[] a = new int[10];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(45);
            sum += a[i];
        }
        System.out.println(sum + ((sum > 200) ? " Спортсмен вышел в этап" : " Спортсмен не вышел в этап"));
        System.out.println();
    }

    private static void task3() {
        int[] a = new int[18];
        int obz = 0, kor = 0, pro = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        for (int j = 0; j < a.length; j++) {
            if (j >= 0 && j < 7) obz += a[j];
            if (j > 6 && j < 13) kor += a[j];
            if (j > 12 && j < a.length) pro += a[j];
        }
        System.out.println("Обязательная " + obz);
        System.out.println("Короткая программа " + kor);
        System.out.println("Произвольная " + pro);
        if (obz > kor && obz > pro) System.out.println("Лучше выступил в обязательной программе");
        if (kor > obz && kor > pro) System.out.println("Лучше выступил в короткой программе");
        if (pro > obz && pro > kor) System.out.println("Лучше выступил в произвольной программе");
        System.out.println();
    }

    private static void task4() {
        Random random = new Random();
        int[] a = new int[50];
        int cur = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = -50 + random.nextInt(100);
            if (a[i] > 0) cur++;
            else {
                if (cur > max) max = cur;
                cur = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("\nМаксимальная последовательность положительных чисел состоит из: " + max);
        System.out.println();
    }

    private static void task5() {
        int[] a = new int[50];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(200);
            for (int j = 3; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    //System.out.println(a[i] +" "+ j);
                    a[i] = 0;
                    break;
                }
            }
            if (a[i] != 0) System.out.println(i);
        }
        System.out.println();
    }

    private static void task6() {
        int[] a = new int[50];
        int b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(45);
        }
        int x = a[1], y = a[1];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > x) {
                x = a[j];
                b = j;
            }
            if (a[j] < y) {
                y = a[j];
                c = j;
            }
        }
        System.out.println(Arrays.toString(a));
        a[b] = 0;
        a[c] = 0;
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    private static void task7() {
        int[] a = new int[50];
        int b = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            b = a[i];
            if (b != 0) {
                for (int j = 0; j < a.length; j++) {
                    if (b == a[j]) a[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    private static void task8() {
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++) {
            a[i] = -50 + random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) a[i] = 0;
            if (a[i] > b) a[i] = 0;
            if (a[i] > c && a[i] < d) a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    private static void task9() {
        Random random = new Random();
        int[] a = new int[50];
        int b = 30, c = 10, d = 20;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && i % 2 != 0) a[i] = 0;
            if (a[i] % 3 == 0 || a[i] % 5 == 0) a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
