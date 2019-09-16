// https://www.hackerrank.com/challenges/arrays-ds/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = input.nextInt();

        for (int i = N-1; i >= 0; i--)
            System.out.print(A[i] + " ");
    }
}
