package com.itschool.Lesson3_Cycles;

public class ClassWorkTasks {
    public static void main(String[] args) {
        int zz = 12345679;

        System.out.println("Task 1:");
        for (int i = 9; i <= 81; i += 9) {
            System.out.println(zz + " * " + i + " = " + zz * i);
        }

        System.out.println("Task 2:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + 7 * i);
        }

        System.out.println("Task 3:");
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(String.format("%6.0f", (float) x * y));
            }
            System.out.println();
        }

        System.out.println("Task 4:");
        for (double x = 0.0000000001; x <= 20; x++) {
            System.out.println("sin " + x + " = " + String.format("%126.82f", Math.sin(Math.PI / x)));
        }


        System.out.println("Task 5:");
        // 5! = 1 * 2 * 3 * 4 * 5
        int n = 5;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = k * i;
        }
        System.out.println(k);

        System.out.println("Task 6:");
        double x = 1, y = 0, yk;
        int sign = +1;
        n = 1;
        for (k = 1; k <= 13; k += 2) {
            yk = sign * Math.pow(x, k) / n;
            System.out.println(yk);
            y = y + yk;
            sign *= -1;
            n = n * (k + 1) * (k + 2);
        }
        System.out.println(y);

        System.out.println("Task 7:");
        double a = -3, b = +3, h = 0.5;
        for (x = a; x < b; x += h) {
            if (Math.cos(x) != 0) {
                y = Math.tan(x);
                System.out.println("Y(" + x + ") = " + String.format("%6.3f", y));
            } else {
                System.out.println("Y(" + x + ") not exists");
            }
        }
        System.out.println();
        for (x = a; x < b; x += h) {
            if (Math.sin(x) != 0) {
                y = 1 / Math.tan(x) + 1;
                System.out.println("Y(" + x + ") = " + String.format("%6.3f", y));
            } else {
                System.out.println("Y(" + x + ") not exists");
            }
        }

        System.out.println("Task 8:");
        double z = 0, Xi;
        x = 0;
        n = 20;
        double kfac = 1;
        for (int i = 1; i <= 20; i++) {
            Xi = Math.random();
            for (k = 1; k < n; k++) {
                kfac = 1;
                for (int l = 1; l <= k; l++) {
                    kfac = kfac * l;
                }
                z += (Math.pow(Xi, k) / kfac);
            }
        }

        System.out.println("Z = " + String.format("%15.7f", z));

        System.out.println("Task 9:");
        n = 0;
        k = 1;
        while (n <= 15) {
            if (k % 19 == 0 && k > 100) {
                System.out.println(k);
                n++;
            }
            k++;
        }

        k = 1;
        for (n = 0; n <= 15; k++) {
            if (k % 19 == 0 && k > 100) {
                System.out.println(k);
                n++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (10 - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Task 10:");
        n = 1221;
        double N = n, nReversed = 0, digit;
        k = (int) Math.log10(n) + 1;
        System.out.println(k);

        for (int i = 1; i <= k; i++) {
            digit = n % 10;
            System.out.println(digit);
            n /= 10;
            nReversed += digit * Math.pow(10, k - i);
        }
        System.out.println("n = " + String.format("%20.0f", N));
        System.out.println("reversed N = " + String.format("%11.0f", nReversed));

        if (N == nReversed) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }



        /*
        double n = 1, ch = 1, x = 5, sign = +1, sum = 0;
        for (int i = 3; i < 13; i+=2) {
            ch = Math.pow(x, i);
            n = n * (i-1)* i;
            sign = -sign;
            sum += (ch/n)*sign;
            //System.out.println(ch);
            //System.out.println(i+"! = " + n);
        }
        System.out.println("Sum = " + (x - sum) );
//5
        double a = -5, b = 6, h = 1.5, res = 0;
        for (double x1 = a; x1 <= b; x1+=h) {
            System.out.println("ctg " + x1 + "\t=\t" + 1/ Math.tan(x1)+1);

        }*/
    }
}
