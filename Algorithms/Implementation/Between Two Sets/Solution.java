// https://www.hackerrank.com/challenges/between-two-sets/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = input.nextInt();

        System.out.println(getTotalX(a, b));
    }

    private static int getTotalX(int[] a, int[] b) {
        int total = 0;

        for (int n = 1; n <= 100; n++) {
            boolean firstCond = true;
            for (int i = 0; i < a.length; i++) {
                if (n % a[i] != 0) {
                    firstCond = false;
                    break;
                }
            }

            if (!firstCond)     continue;

            boolean secondCond = true;
            for (int i = 0; i < b.length; i++) {
                if (b[i] % n != 0) {
                    secondCond = false;
                    break;
                }
            }

            if (secondCond)     total++;
        }

        return total;
    }
}