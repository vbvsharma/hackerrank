// https://www.hackerrank.com/challenges/kangaroo/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();

        if (solve(x1, v1, x2, v2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean solve(int x1, int v1, int x2, int v2) {
        if (x1 == x2)   return true;
        if (v1 == v2)   return false;
        return (x2 - x1) * (v1 - v2) >= 0 && Math.abs(x2 - x1) % Math.abs(v1 - v2) == 0;
    }
}