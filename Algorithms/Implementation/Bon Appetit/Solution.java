// https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] bill = new int[n];
        for (int i = 0; i < n; i++)
            bill[i] = input.nextInt();

        int b = input.nextInt();

        bonAppetit(bill, k, b);
    }

    private static void bonAppetit(int[] bill, int k, int b) {
        int total = 0;
        for (int i = 0; i < bill.length; i++)
            total += bill[i];

        if (b != (total - bill[k]) / 2) {
            System.out.println(b - (total - bill[k]) / 2);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}

