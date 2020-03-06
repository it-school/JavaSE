package com.itschool.Lesson4_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson4_Arrays
{
	private static Scanner scanner = new Scanner(System.in);
	private static Random r = new Random();

	public static void main(String[] args)
	{
		ArraysExample_1();
		ArraysExample_2();
		ArraysExample_3();
		ArraysExample_4();
		ArraysExample_5();
		ArraysExample_6();
		ArraysExample_7();

		RandomArray();

		int[] arr = new int[9];
		FillArray(arr);

		MaxElementInArray();
		MinElementInArray();
		Average();

		BubbleSortForMaxToMin();
		BubbleSortForMinToMax();
		QuickSort();

		ArraysCompareBikeMethod();
		ArraysCompareNormalMethod();

		ArrayClone();
		ArrayToString();
		ArrayReverse();

		ForToForeach();
		SaveOurRAM();


		// Задания для работы в аудитории

		LessonTask3(arr);
		LessonTask4(arr);
		LessonTask5();
		LessonTask6();
		LessonTask7();


		// Домашние задания
		Homework_Example_1();
		Homework_Example_2();
	}

	private static void LessonTask3(int[] arr)
	{
		int sum = 0;
		for (int item : arr) { if (item % 2 == 0) { sum += item; } }
		System.out.println("Сумма чётных элементов массива: " + sum);
	}

	private static void LessonTask4(int[] arr)
	{
		int mult = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 9 == 0) {
				mult *= arr[i];
			}
		}
		System.out.println(mult);
	}

	private static void LessonTask5()
	{
		boolean[] month = new boolean[30];
		int a = 100;
		for (int i = 0; i < month.length; i++) { month[i] = r.nextBoolean(); }

		System.out.println(Arrays.toString(month));

		for (int i = 0; i < month.length; i++) {
			a += (month[i] == true ? 2 : -1);
			if (a > 500) { a = 500; }
			else if (a < 0) { a = 0; }
		}

		System.out.println("Улитка на высоте " + a + " см");
	}

	private static void LessonTask6()
	{
		final int DAYS = 30;
		double[] P = new double[DAYS];
		double[] R = new double[DAYS];
		double[] Z = new double[DAYS];
		double sum = 0;
		for (int i = 0; i < DAYS; i++) {
			P[i] = (int) (Math.random() * 1000);
			R[i] = (int) (Math.random() * 1000);
			sum += (Z[i] = P[i] - R[i]);
		}

		System.out.println(Arrays.toString(P));
		System.out.println(Arrays.toString(R));
		System.out.println(Arrays.toString(Z));
		System.out.println(sum);
		System.out.println(sum / DAYS);
	}

	private static void LessonTask7()
	{
		final int N = 10;
		float[] H = new float[N], D = new float[N];

		for (int i = 0; i < N; i++) {
			H[i] = (float) (r.nextInt(100) / 10.0);
			D[i] = (float) (r.nextInt(100) / 10.0);
		}

		System.out.println(Arrays.toString(H));
		System.out.println(Arrays.toString(D));

		SubTask7(H, "H");
		SubTask7(D, "D");
	}

	private static void SubTask7(float[] arr, String arrayName)
	{
		float[] copyH = arr.clone();

		Arrays.sort(copyH);

		System.out.println("\n" + arrayName + " worst 3: ");
		for (int i = 0; i < 3; i++) { System.out.print(copyH[i] + "\t"); }

		System.out.println("\n" + arrayName + " best 3: ");
		for (int i = copyH.length - 1; i > copyH.length - 4; i--) { System.out.print(copyH[i] + "\t"); }
	}

	private static void FillArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

	// Одномерные массивы. Пример 1

	private static void ArraysExample_1()
	{
		// Счёт элементов массива всегда начинается с 0

		System.out.println("\nОдномерные массивы. Пример 1");

		int[] array = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		System.out.print("Массив array : ");
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
	}
	// Одномерные массивы. Пример 2

	private static void ArraysExample_2()
	{
		System.out.println("\nОдномерные массивы. Пример 2");

		int[] array = new int[5];

		Random rnd = new Random();
		// Заполнение массива.
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt() % 50;
		}

		System.out.print("Массив array : ");

		// Вывод на экран значений элементов массива.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

		System.out.println();
		System.out.println(Arrays.toString(array));
	}
	// Одномерные массивы. Пример 3

	private static void ArraysExample_3()
	{
		System.out.println("\nОдномерные массивы. Пример 3");

		int[] array = new int[]{1, 2, 3, 4, 5};

		System.out.print("Массив array : ");

		// Вывод на экран значений элементов массива.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
	// Одномерные массивы. Пример 4

	private static void ArraysExample_4()
	{
		System.out.println("\nОдномерные массивы. Пример 4");

		int[] array = {1, 2, 3, 4, 5};

		System.out.print("Массив array : ");

		// Вывод на экран значений элементов массива.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
	// Одномерные массивы. Пример 5

	private static void ArraysExample_5()
	{
		System.out.println("\nОдномерные массивы. Пример 5");

		int[] array = new int[5];

		System.out.print("Массив array : ");

		// Вывод на экран значений элементов массива.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
	// Одномерные массивы. Пример 6

	private static void ArraysExample_6()
	{
		System.out.println("\nОдномерные массивы. Пример 6");

		int[] vector = new int[1];
		vector[0] = 100;

		System.out.println("Массив vector : " + vector[0]);
	}
	// Заполнение массива случайными значениями

	private static void RandomArray()
	{
		System.out.println("\nЗаполнение массива случайными значениями");

		Random random = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) { array[i] = random.nextInt(100); }

		System.out.print("\nМассив со случайными элементами : ");

		for (int a : array) {
			System.out.print(a + " ");
		}
	}
	// Максимальный элемент в массиве

	private static void MaxElementInArray()
	{
		System.out.println("\nНахождение максимального элемента в массиве");

		int[] array = {21, 243, 415, 54, -2, 31, 98, 10};

		// Обязательно присваивать максимальному элементу нулевой элемент массива
		int max_element = array[0];

		System.out.print("Исходный массив : ");

		for (int a : array) {
			// Выводим элементы массива на экран
			System.out.print(a + "  ");
			// Сравниваем текущий максимальный элемент с i-ым элементом массива
			if (max_element < a) { max_element = a; }
		}
		System.out.println("\nМаксимальный элемент " + max_element);
	}
	// Минимальный элемент в массиве

	private static void MinElementInArray()
	{
		System.out.println("\nНахождение минимального элемента в массиве");

		int[] array = {21, 243, 415, 54, -2, 31, 98, 10};

		// Обязательно присваивать минимальному элементу нулевой элемент массива
		int min_element = array[0];

		System.out.print("Исходный массив : ");

		for (int a : array) {
			// Выводим элементы массива на экран
			System.out.print(a + "  ");
			// Сравниваем текущий миниманльный элемент с i-ым элементом массива
			if (min_element > a) { min_element = a; }
		}

		System.out.println("\nМинимальный элемент " + min_element);
	}
	// Среднее арифметическое в массиве

	private static void Average()
	{
		System.out.println("\nСреднее арифметическое в массиве");

		int[] nums = {4, 8, 10, 12, 16};
		double sum = 0;

		System.out.print("Массив nums : ");

		for (int a : nums) {
			System.out.print(a + "  ");
		}

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		sum = sum / nums.length; // общий результат делим на число элементов в массиве
		System.out.println("Среднее арифметическое: " + String.format("%5.2f", sum));
	}
	// Сортировка пузырьком - от большего к меньшему

	private static void BubbleSortForMaxToMin()
	{
		System.out.println("\n\nBubbleSort - от большего к меньшему");
		int[] num = {203, 134, 123, -2, 124, 0, 14};
		int j = 0;
		boolean flag = true;
		int temp;

		System.out.print("До сортировки : ");

		for (int a : num) { System.out.print(a + " "); }

		while (flag) {
			flag = false;
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true;
				}
			}
		}

		System.out.print("\nПосле сортировки : ");
		for (int a : num) { System.out.print(a + " "); }
	}
	// Сортировка пузырьком - от меньшего к большему

	private static void BubbleSortForMinToMax()
	{
		System.out.println("\n\nBubbleSort - от меньшего к большему");
		int[] num = {203, 134, 123, -2, 124, 0, 14};
		int j = 0;
		boolean flag = true;
		int temp;

		System.out.print("До сортировки : ");

		for (int a : num) { System.out.print(a + " "); }

		while (flag) {
			flag = false;
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true;
				}
			}
		}

		System.out.print("\nПосле сортировки : ");
		for (int a : num) { System.out.print(a + " "); }
	}
	// Сортировка QuickSort

	private static void QuickSort()
	{
		System.out.println("\n\nСортировка методом QuickSort");
		int[] num = {203, 134, 123, -2, 124, 0, 14};

		System.out.print("Массив до сортировки : ");
		for (int a : num) {
			System.out.print(a + " ");
		}

		// Сортируем массив метод QuickSort
		Arrays.sort(num);

		System.out.print("\nМассив после сортировки : ");
		for (int a : num) {
			System.out.print(a + " ");
		}
	}
	// Сравнение элементов массивов с помощью велосипеда

	private static void ArraysCompareBikeMethod()
	{
		System.out.println("\nСравнение элементов массивов с помощью велосипеда");

		int[] a = {10, 20, 30};
		int[] b = {10, 20, 30};
		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}

		if (flag) { System.out.println("Элементы массивов a и b - равны"); }
		else { System.out.println("Элементы массивов a и b - не равны"); }
	}
	// Нормальное сравнение элементов массивов

	private static void ArraysCompareNormalMethod()
	{
		System.out.println("\nСравнение элементов массивов с помощью Arrays.equals");
		int[] a = {10, 20, 30};
		int[] b = {10, 20, 30};

		if (Arrays.equals(a, b)) { System.out.println("Элементы массивов a и b - равны"); }
		else { System.out.println("Элементы массивов a и b - не равны"); }
	}
	// Клонирование массива

	private static void ArrayClone()
	{
		System.out.println("\nКлонирование массива\n");

		int[] a = {10, 20, 30};
		System.out.println("Клонируем массив а в массив b");
		int[] b = a.clone();
		System.out.println("Элементы массивов a и b равны - " +
				Arrays.equals(a, b));
		System.out.println("Ссылка а и b указывают на один массив - " +
				(a.hashCode() == b.hashCode()));

		System.out.println("Присваиваем массиву b ссылку массива a");
		b = a;
		System.out.println("Элементы массивов a и b равны - " +
				Arrays.equals(a, b));
		System.out.println("Ссылка а и b указывают на один массив - " +
				(a.hashCode() == b.hashCode()));
	}
	// Преобразование элементов массива в строку

	private static void ArrayToString()
	{

		System.out.println("\nПреобразование элементов массива в строку");

		int[] intArray = {1, 2, 3, 4, 5};

		// Создаем строку и инициализируем её строковым представлением
		// элементов массива
		String intArrayString = Arrays.toString(intArray);

		System.out.print("Массив преобразованный в строку : ");

		// Выводим строку intArrayString на экран
		System.out.println(intArrayString); // [1, 2, 3, 4, 5]
	}
	// Реверс элементов массива

	private static void ArrayReverse()
	{
		// Данные метод идеален для собеседования

		System.out.println("\nРеверс элементов массива");

		int[] a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i = 0; i < a.length / 2; i++) {
			a[i] = a[i] + a[a.length - 1 - i];
			a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
			a[i] = a[i] - a[a.length - 1 - i];
		}

		System.out.print("Массив после сортировки : ");
		System.out.println(Arrays.toString(a));
	}
	// Переход от for к foreach

	private static void ForToForeach()
	{
		System.out.println("\nПереход от for к foreach");

		int[] array = {10, 20, 30};

		System.out.print("Массив : ");

		for (int i = 0; i < array.length; i++) {
			// Присваиваем переменной a значение i-го элемента массива array
			int a = array[i];
			// Выводим переменную а, которая равна i-ому элементу массива array
			System.out.print(a + "  ");
			// Изменяем значение переменной а, а значение i-го элемента массива array не изменяется
			a = 20;
		}

		System.out.print("\nМассив : ");

		// Тоже самое, что и выше
		for (int a : array) {
			System.out.print(a + "  ");
			a = 20;
		}
	}
	// Оптимизируем выделение оперативной памяти

	private static void SaveOurRAM()
	{
		// Если динамический диапазон элементов для всех массивов от 0 до 100,
		// то, чтобы не расходовать понапрасну оперативную память,
		// оптимально будет выбрать массив с элементами типа byte
		final int N = 10000;

		byte[] array_byte = new byte[N];    // Займет в памяти 10000 байтов
		short[] array_short = new short[N]; // Займет в памяти 20000 байтов
		int[] array_int = new int[N];       // Займет в памяти 40000 байтов
		long[] array_long = new long[N];    // Займет в памяти 80000 байтов
	}

	private static void ArraysExample_7()
	{
		final int N = 10;
		float[] A = new float[N];

		Locale.setDefault(Locale.US);
		for (int i = 0; i < N; i++) {
			System.out.print(String.format("%7.2f", (A[i] = (float) (Math.random() * 100))));
		}

		System.out.println();
		System.out.println(Arrays.toString(A));

		for (float element : A) {
			System.out.print(String.format("%7.2f", element));
		}

		// Сортировка массива по возрастанию
		Arrays.sort(A);

		// Переворот элементов массива
		float temp = 0;
		for (int i = 0; i < A.length / 2; i++) {
			temp = A[i];
			A[i] = A[A.length - 1 - i];
			A[A.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(A));


		int[] B = new int[N * N * N * N * N * N * N];
		for (int i = 0; i < B.length; i++) {
			B[i] = (int) (5 + Math.random() * 100000);
		}
		System.out.println(Arrays.toString(B));


		// Поиск значения в массиве
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 555) {
				System.out.println(i);
				break;
			}
		}


		// Бинарный поиск вхождения значения в массив
		System.out.println(Arrays.binarySearch(B, 555));


		// Поиск минимального значения массива
		int[] C = B.clone();

		int indexMin = 0;
		for (int i = 1; i < C.length; i++) {
			if (C[i] < C[indexMin]) { indexMin = i; }
		}
		System.out.println(C[indexMin]);
		System.out.println();


		// Сравнение обычной сортировки и с использованием распараллеливания
		long start = System.currentTimeMillis();
		Arrays.sort(B);
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		Arrays.parallelSort(C);
		System.out.println(System.currentTimeMillis() - start);


		// Изменение размеров массива
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 1000);
		}
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));

		arr1 = arr2;
		System.out.println(Arrays.toString(arr1));
	}

	// Типовая задача из домашнего задания. Пример 1
	private static void Homework_Example_1()
	{
		// В массиве хранятся сведения о стоимости 12 различных предметов.
		// Определить общую стоимость всех предметов.

		System.out.println("\nТиповая задача из домашнего задания. Пример 1");

		double[] cost = new double[12];
		double sum = 0;

		// Так как мы изменяем значения элементов массива
		// то используем for
		for (int i = 0; i < cost.length; i++) {
			System.out.print("Введите стоимость " + (i + 1) + " товара : ");
			cost[i] = scanner.nextDouble();
		}

		// Так как мы не изменяем значения элементов массива
		// а только читаем их, то используем foreach
		for (double a : cost) { sum += a; }

		System.out.println("Стоимость всех 12 товаров : " + sum + " у.е.");
	}

	// Типовая задача из домашнего задания. Пример 2

	private static void Homework_Example_2()
	{
		//Дан массив целых чисел. Выяснить:
		// а) верно ли, что сумма элементов массива есть четное число;
		// б) верно ли, что сумма квадратов элементов массива есть пятизначное число;
		// в) верно ли, что сумма элементов массива неотрицательна.

		System.out.println("\nТиповая задача из домашнего задания. Пример 2");

		// Переменная для генерации случайных чисел
		Random random = new Random();

		int[] array = new int[12];
		// Сумма элементов массива
		int sumOfElemets = 0;
		// Сумма квадратов элементов массива
		int sumOfElementsSqr = 0;

		System.out.print("Исходный массив : ");
		for (int i = 0; i < array.length; i++) {
			// В i-ый элемент массива, записываем случайное значение в диапазоне [-50;50)
			array[i] = random.nextInt(100) - 50;
			// Выводим i-ый элемент на экран
			System.out.print(array[i] + "  ");
			// Прибавляем i-ый элемент массива к сумме элементов массива
			sumOfElemets += array[i];
			// Прибавлеяем квадрат i-го элемента массива к сумме квадратов элементов массива
			sumOfElementsSqr += array[i] * array[i];
		}

		System.out.println();

		if (sumOfElemets % 2 == 0) { System.out.println("Cумма элементов массива есть четное число"); }
		else { System.out.println("Cумма элементов массива есть нечетное число"); }

		if (sumOfElementsSqr >= 10000) {
			System.out.println("Cумма квадратов элементов массива есть пятизначное число");
		}
		else { System.out.println("Cумма квадратов элементов массива есть не пятизначное число"); }

		if (sumOfElemets >= 0) { System.out.println("Cумма элементов массива неотрицательна"); }
		else { System.out.println("Cумма элементов массива отрицательна"); }
	}
}