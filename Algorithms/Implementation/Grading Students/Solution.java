// https://www.hackerrank.com/challenges/grading/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] grades = new int[n];
        for (int i = 0; i < n; i++)
            grades[i] = input.nextInt();

        gradeStudents(grades);
    }

    private static void gradeStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                System.out.println(grades[i]);
            } else if (grades[i] % 5 > 2) {
                System.out.println((grades[i] + 5) - (grades[i] % 5));
            } else {
                System.out.println(grades[i]);
            }
        }
    }
}
