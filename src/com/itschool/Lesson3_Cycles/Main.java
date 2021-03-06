package com.itschool.Lesson3_Cycles;

import java.util.Scanner;

public class Main {
    // Некоторые горячие клавиши для IntelliJIdea
    // Ctrl + Shift + NumPad-   --- Свернуть всё
    // Ctrl + Shift + NumPad+   --- Развернуть всё
    // Ctrl + Alt + L           --- Форматирование кода
    // Ctrl + /                 --- Закомментировать выделенный фрагмент однострочными комментариями //
    // Ctrl + Shift + /         --- Закомментировать выделенный фрагмент многострочным комментарием  /*  */


    // Экземпляр класса Scanner для считывания данных с консоли
    static private final Scanner scanner = new Scanner(System.in);

    // Конструкция while. Пример 1
    private static void WhileExample_1() {
        // Циклическая конструкция - while.
        System.out.println("\nКонструкция while. Пример 1");
        int counter = 0;

        while (counter < 3) {
            System.out.println("Counter " + ++counter);
        }

        System.out.println("Произведено " + counter + " итераций.");
    }

    // Конструкция while. Пример 2
    private static void WhileExample_2() {
        // Циклическая конструкция - while. (с досрочным выходом из цикла - break)
        System.out.println("\nКонструкция while. Пример 2");
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            break;

            // System.out.println("Эта строка не выполнится."); // так как перед ней ключевое слово break, и это команда никого не будет выполнена, а IDEA считат этот фрагмент ошибкой
        }

        System.out.println("Произведено " + counter + " итераций.");
    }

    // Конструкция while. Пример 3
    private static void WhileExample_3() {
        // Циклическая конструкция - while. (с пропуском итерации - continue)
        System.out.println("\nКонструкция while. Пример 3");
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            continue;

            //System.out.println("Эта строка не выполнится."); // так как перед ней ключевое слово continue, и это команда никого не будет выполнена, а IDEA считат этот фрагемент ошибкой
        }

        System.out.println("Произведено + " + counter + " итераций.");
    }

    // Конструкция while. Пример 4
    private static void WhileExample_4() {
        // Циклическая конструкция - while.
        System.out.println("\nКонструкция while. Пример 4");
        System.out.println("Угадайте задуманный цвет с пяти попыток.");
        System.out.println("Для выхода из программы введите - exit.");

        final int MAXATTEMPT = 5; // Допустимое количество попыток.
        int attempt = 0;          // Счетчик попыток.
        String color = "red";     // Задуманный цвет.

        // for (;attempt < MAXATTEMPT;)
        while (attempt < MAXATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");

            String value = scanner.next();

            if (value.equals("exit")) {
                break;
            }

            if (!value.equalsIgnoreCase(color)) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }

    // Конструкция do-while. Пример 1
    private static void DoWhileExample_1() {
        // Циклическая конструкция - do-while.
        System.out.println("\nКонструкция do-while. Пример 1");
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        }
        while (counter < 3);

        System.out.println("Произведено " + counter + " итераций.");
    }

    // Конструкция do-while. Пример 2
    private static void DoWhileExample_2() {
        // Циклическая конструкция - do-while. (с досрочным выходом из цикла - break)
        System.out.println("\nКонструкция do-while. Пример 2");
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            break;

            //System.out.println("Эта строка не выполнится.");
        }
        while (counter < 3);

        System.out.println("Произведено " + counter + " итераций.");
    }

    // Конструкция do-while. Пример 3
    private static void DoWhileExample_3() {
        // Циклическая конструкция - do-while. (с пропуском итерации - continue)
        System.out.println("\nКонструкция do-while. Пример 3");
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            continue;

            //System.out.println("Эта строка не выполнится.");
        }
        while (counter < 3);

        System.out.println("Произведено " + counter + " итераций.");
    }

    // Конструкция do-while. Пример 4
    private static void DoWhileExample_4() {
// Циклическая конструкция - do-while.
// Факториал числа n (обозначается n!, произносится - эн факториал) — это произведение всех натуральных чисел,
// от 1 до n включительно:
//     n! = 1 * 2 * 3 * ... * n
//     0! = 1

// В комбинаторике факториал натурального числа n интерпретируется как количество перестановок множества из n элементов.
// Например, для множества {A,B,C,D} из 4-х элементов существует: 4! = 1 * 2 * 3 * 4 = 24 перестановки:

//     ABCD  BACD  CABD  DABC
//     ABDC  BADC  CADB  DACB
//     ACBD  BCAD  CBAD  DBAC
//     ACDB  BCDA  CBDA  DBCA
//     ADBC  BDAC  CDAB  DCAB
//     ADCB  BDCA  CDBA  DCBA

        System.out.println("\nКонструкция do-while. Пример 4");

        int counter = 4;
        int factorial = 1;

        System.out.print("Факториал числа: " + counter + "! = ");

        do {
            // Сначала умножение, потом декремент.
            factorial *= counter--;

            // Данная строка эквивалентна:

            //factorial = factorial * counter;
            //counter = counter - 1;
        }
        while (counter > 1);

        System.out.println(factorial);

        final int N = 10;
        factorial = 1;
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }
        System.out.print("Факториал числа: " + N + "! = " + factorial);
    }

    // Конструкция for. Пример 1
    private static void ForExample_1() {
        // Циклическая конструкция - for (цикл со счетчиком).
        System.out.println("\nКонструкция for. Пример 1");

        // for ( Инициализация счетчика итераций; Условие; Изменение счетчика )
        // { Тело цикла }

        for (int counter = 1; counter <= 3; counter++) {
            System.out.println("Counter " + counter);
        }
        //counter = 0; //  counter - недоступен за пределами цикла for.

        System.out.println();
        for (char symbol = 'A'; symbol <= 'z'; symbol++) {
            System.out.println(symbol + " - " + (short) symbol);
        }

    }

    // Конструкция for. Пример 2
    private static void ForExample_2() {
        // Циклическая конструкция (цикл со счетчиком) - for (с досрочным выходом из цикла - break).
        System.out.println("\nКонструкция for. Пример 2");

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter " + counter);

            break;

            //System.out.println("Эта строка не выполнится.");
        }
    }

    // Конструкция for. Пример 3
    private static void ForExample_3() {
        // Циклическая конструкция (цикл со счетчиком) - for (с пропуском итерации - continue).
        System.out.println("\nКонструкция for. Пример 3");

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter " + counter);

            continue;

            //System.out.println("Эта строка не выполнится.");
        }
    }

    // Конструкция for. Пример 4
    private static void ForExample_4() {
        // Цикл for вложенный в цикл for. ( Построение квадрата из звездочек - * )
        System.out.println("\nКонструкция for. Пример 4");

        for (int i = 0; i < 10; i++) {
            // Выводим одну строку из 10 звездочек.
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println(); // Переход на новую строку.
        }
    }

    // Конструкция for. Пример 5
    private static void ForExample_5() {
        // Цикл for вложенный в цикл for. ( Построение треугольника из звездочек - * )
        System.out.println("\nКонструкция for. Пример 5");
        int i = 10;
        int c = 0;
        for (; i > 0; i--) {
            for (int j = 0; j < c; j++) {
                System.out.print(" ");
            }
            c++;

            // Выводим одну строку из 10 звездочек.
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

//            int j = 0;
//            while (j < i)
//            {
//                System.out.print("* ");
//                j++;
//            }

            // Переход на новую строку.
            System.out.println();
        }
    }

    // Конструкция for. Пример 6
    private static void ForExample_6() {
        System.out.println("\nКонструкция for. Пример 6");
        int i; // эта переменная нам понадобится не только в цикле
        for (i = 0; i < 10; i++) {
            int y = i * i;
        }

        // можем использовать переменную где-то ещё
        int x = i + 10;
        System.out.println(x);
    }

    // Конструкция for. Пример 7
    private static void ForExample_7() {
        System.out.println("\nКонструкция for. Пример 7");
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a + ", b = " + b);
        }
    }

    // Конструкция for. Пример 8
    private static void ForExample_8() {
        System.out.println("\nКонструкция for. Пример 8");
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Число " + i + " - чётное");
            } else {
                System.out.println("Число " + i + " - нечётное");
            }

            // или так
            System.out.println("Число " + i + " - " + (i % 2 == 0 ? "" : "не") + "чётное");
        }
    }

    private static void ForExample_9() {
        double x, y, z = 0;
        System.out.println(" Z = X + Y");
        for (x = -5, y = 3; (z = x + y) < 100; x += 0.5, y += 3) {
            System.out.println(z + " = " + x + "  " + y);
        }

        y = 3;
        x = -5;
        do {
            z = x + y;
            System.out.println(z + " = " + x + "  " + y);
            y += 3;
            x += 0.5;
        } while (y < 100);
    }

    // Оптимизация вычислений
    private static void LoopsOptimization() {
        // Префиксный инкремент и декремент (++x , --x) работают быстрее чем постфиксный (x++, x--)
        // Гораздо быстрее будет работать x*x , чем Math.pow(x,2). И тому подобное
        System.out.println("\nОптимизация арифметических вычислений");

        int n = 1000000000;
        long timeout = 0;

        int i = 0;
        int x = 0;

        timeout = System.currentTimeMillis();
        while (i <= n) {
            ++i;
            ++x;
        }
        timeout = System.currentTimeMillis() - timeout;
        System.out.println("Для алгоритма с префиксным инкрементом " + timeout + " ms.");

        i = 0;

        timeout = System.currentTimeMillis();
        while (i <= n) {
            i++;
            x++;
        }
        timeout = System.currentTimeMillis() - timeout;
        System.out.println("Для алгоритма с постфиксным инкрементом " + timeout + " ms.");

        double y = 0;
        n = 1000000;

        timeout = System.currentTimeMillis();
        for (i = 0; i <= n; i++) {
            y = i * i * i;
        }
        timeout = System.currentTimeMillis() - timeout;
        System.out.println("Для алгоритма с i*i " + timeout + " ms.");

        timeout = System.currentTimeMillis();
        for (i = 0; i <= n; i++) {
            y = Math.pow(i, 3);
        }
        timeout = System.currentTimeMillis() - timeout;
        System.out.println("Для алгоритма с Math.pow(i,2) " + timeout + " ms.");

        /*
        // Из-за особенностей реализации проверки условий окончания цикла:
        for (int i = 0; i < 100; i++) {}  // самый медленный
        for (int i = 0; i < 100; ++i) {}  // быстрее
        for (int i = 100; i > 0; i--) {}  // быстрее
        for (int i = 100; i > 0; --i) {}  // самый быстрый
        */
    }

    // Примеры бесконечных циклов
    private static void InfiniteLoops() {
        System.out.println("\nПримеры бесконечных циклов");

        // Бесконечный цикл do
        while (true) {
            // Так мы можем выйти из Бесконечный цикла
            if (true) {
                break;  // Внутри конструкции if, может быть любое логическое выражение
            }
        }

        // Бесконечный цикл do-while
        do {
            // Так мы можем выйти из Бесконечный цикла
            if (true) {
                break;  // Внутри конструкции if, может быть любое логическое выражение
            }
        } while (true);

        // Бесконечный цикл for
        for (; ; ) {
            // Так мы можем выйти из Бесконечный цикла
            if (true) {
                break;  // Внутри конструкции if, может быть любое логическое выражение
            }
        }
    }

    // Типовая задача из задания на занятии. Пример 1
    private static void HomeworkExample_1() {
        // Написать программу, которая выводит на экран таблицу квадратов и кубов целых чисел а от 1 до 10.
        // Столбцы таблицы должны иметь обозначения, например, а, а^2, а^3.
        System.out.println("Типовая задача из домашнего задания. Пример 1");

        int n = 10;
        System.out.print("Введите целое число a : ");
        int a = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("a" + "^" + i + "=" + (int) Math.pow(a, i));
        }
    }

    // Типовая задача из задания на занятии. Пример 2
    private static void HomeworkExample_2() {
        // Определить первые 40 чисел Фибоначчи
        System.out.println("Типовая задача из домашнего задания. Пример 2");

        // fi–2  член ряда
        int previousElementFirst = 0;
        // fi–1  член ряда
        int previousElementSecond = 1;
        // текущий элемент ряда
        int targetElement = 0;
        // количество чисел Фибоначчи
        int n = 40;
        // Выводим первые два числа Фибоначчи
        System.out.print(previousElementFirst + "," + previousElementSecond + ",");

        for (int i = 2; i <= n; i++) {
            // Получаем текущее число Фибоначчи
            targetElement = previousElementFirst + previousElementSecond;
            // Выводим текущее число Фибоначчи
            System.out.print(targetElement + ",");
            // Присваиваем числу fi–2 значение числа fi–1
            previousElementFirst = previousElementSecond;
            // Присваиваем числу fi–1 значение текущего числа fi
            previousElementSecond = targetElement;
        }
        System.out.println();
    }

    // Типовая задача из задания на занятии. Пример 3
    private static void HomeworkExample_3() {
        // Вычислить у = sin 1 + sin 1,1 + sin 1,2 + ... + sin 2.
        System.out.println("Типовая задача из домашнего задания. Пример 3");

        double y = 0;
        for (double x = 1; x <= 2.01; x += 0.1) {
            y += Math.sin(x);
            System.out.println("y = " + String.format("%6.3f", y));
            // y = Double.parseDouble(String.format("%6.3f", y).replace(',', '.'));
            // System.out.println("y = " + y);
        }
    }

    // Типовая задача из задания на занятии. Пример 4
    private static void HomeworkExample_4() {
        // Напечатать таблицу умножения для первых 10 чисел
        System.out.println("Типовая задача из домашнего задания. Пример 4");

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }

    // Типовая задача из задания на занятии. Пример 5
    private static void HomeworkExample_5() {
        // Составить программу для вычисления значений функции   на отрезке  [a,b] с шагом  h.
        // Результат представить в виде таблицы, первый столбец которой — значения аргумента, второй — соответствующие значения функции.
        // F(x) = x - sin(x)
        System.out.println("Типовая задача из домашнего задания. Пример 5");

        int a = -2, b = 5;
        double h = 0.1;

        for (double x = a; x <= b; x++) {
            // Используем форматированный вывод с помощью функции String.format()
            System.out.println("x = " + x + " , y = " + String.format("%.3f", x - Math.sin(x)));
        }
    }

    // Главная функция
    public static void main(String[] args) {
//        WhileExample_1();
//        WhileExample_2();
//        WhileExample_3();
//        WhileExample_4();

//        DoWhileExample_1();
//        DoWhileExample_2();
//        DoWhileExample_3();
//        DoWhileExample_4();
//
//        ForExample_1();
//        ForExample_2();
//        ForExample_3();
//        ForExample_4();
//        ForExample_5();
//        ForExample_6();
//        ForExample_7();
//        ForExample_8();
//        ForExample_9();
//
//        InfiniteLoops();
//
//        LoopsOptimization();
//
//        HomeworkExample_1();
//        HomeworkExample_2();
//        HomeworkExample_3();
//        HomeworkExample_4();
//        HomeworkExample_5();
    }
}