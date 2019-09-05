// https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++)
            s[i] = input.nextInt();
        int d = input.nextInt();
        int m = input.nextInt();

        System.out.println(birthdayChocolate(s, d, m));
    }

    private static int birthdayChocolate(int[] s, int d, int m) {
        int count = 0;

        for (int i = 0; i < s.length - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++)     sum += s[j];

            if (sum == d)   count++;
        }
        return count;
    }
}
