// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = input.nextInt();

        System.out.println(divisibleSumPairs(ar, k));
    }

    private static int divisibleSumPairs(int[] ar, int k) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
