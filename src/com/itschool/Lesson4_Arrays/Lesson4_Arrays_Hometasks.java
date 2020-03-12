package com.itschool.Lesson4_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Lesson4_Arrays_Hometasks
{
	public static void main(String[] args)
	{
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

	private static void task1()
	{
		int[] a = new int[35];
		int sum = 0;
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(50) * 110;
			sum += a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Общее число книг  " + sum + ((sum > 99999 && sum < 1000000) ? " " : "  НЕ") + " является 6-значным числом");
		System.out.println();
	}

	private static void task2()
	{
		final int PASS_VALUE = 200;
		int[] a = new int[10];
		int sum = 0;
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(44);
			sum += a[i];
		}
		System.out.println("Всего очков набрано: " + sum);
		System.out.println("Спортсмен " + (sum < PASS_VALUE ? "не " : "") + "вышел в следующий этап");
		System.out.println();
	}

	private static void task3()
	{
		int[] a = new int[18];
		int obz = 0, kor = 0, pro = 0;
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(50);
		}

		for (int j = 0; j < a.length; j++) {
			if (j < 7) { obz += a[j]; }
			else if (j > 6 && j < 13) { kor += a[j]; }
			else if (j > 12) { pro += a[j]; }
		}

		System.out.println("Обязательная " + obz);
		System.out.println("Короткая программа " + kor);
		System.out.println("Произвольная " + pro);
		if (obz > kor && obz > pro) { System.out.println("Лучше выступил в обязательной программе"); }
		else if (kor > obz && kor > pro) { System.out.println("Лучше выступил в короткой программе"); }
		else if (pro > obz && pro > kor) { System.out.println("Лучше выступил в произвольной программе"); }
		else {
			System.out.println("По 2 и более программам набрано одинаковое кол-во баллов");
		}
	}

	private static void task4()
	{
		Random random = new Random();
		int[] a = new int[50];
		int cur = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = -50 + random.nextInt(101);
			if (a[i] > 0) { cur++; }
			else {
				if (cur > max) { max = cur; }
				cur = 0;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("\nМаксимальная последовательность положительных чисел состоит из: " + max);
		System.out.println();
	}

	private static void task5()
	{
		int[] a = new int[50];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(200);
			for (int j = 2; j < Math.sqrt(a[i]); j++) {
				if (a[i] % j == 0) {
					//System.out.println(a[i] +" "+ j);
					a[i] = 0;
					break;
				}
			}
			if (a[i] != 0) { System.out.println(i); }
		}
		System.out.println();
	}

	private static void task6()
	{
		int[] a = new int[50];
		int max = 0, min = 0;
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(45);
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] > a[max]) {
				max = j;
			}
			if (a[j] < a[min]) {
				min = j;
			}
		}
		System.out.println(Arrays.toString(a));
		a[max] = 0;
		a[min] = 0;
		System.out.println(Arrays.toString(a));
		System.out.println();
	}

	private static void task7()
	{
		int[] a = new int[20];
		int b = 0;
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(10);
		}

		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			b = a[i];
			if (b != 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (b == a[j]) { a[j] = 0; }
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
	}

	private static void task8()
	{
		Random random = new Random();
		int[] a = new int[50];
		int b = 30, c = 10, d = 20;
		for (int i = 0; i < a.length; i++) {
			a[i] = -50 + random.nextInt(100);
		}
		int n1 = 10, n2 = 20;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) { a[i] = 0; }
			if (a[i] > b) { a[i] = 0; }
			if (n1 <= n2 && n1 >= 0 && n2 < a.length && i >= n1 && i <= n2) { a[i] = 0; }
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
	}

	private static void task9()
	{
		Random random = new Random();
		int[] array = new int[20];
		int b = 30, c = 10, d = 20;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		boolean isExists;
		int comparer = Integer.MAX_VALUE;
		do {
			isExists = false;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == comparer) {
					isExists = true;
					comparer--;
					break;
				}
			}
		} while (isExists);

		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && i % 2 != 0) { array[i] = comparer; }
			if (array[i] % 3 == 0 || array[i] % 5 == 0) { array[i] = comparer; }
		}
		//System.out.println(Arrays.toString(array));
		int cntDel = 0;
		for (int i = 0; i < array.length - cntDel; i++) {
			if (array[i] == comparer) {
				cntDel++;
				for (int j = i; j < array.length - cntDel; ) {
					array[j] = array[j + 1];
					j++;
				}
				i--;
			}
		}
		System.out.println(cntDel);
		array = Arrays.copyOf(array, array.length - cntDel);
		System.out.println(Arrays.toString(array));
	}
}
