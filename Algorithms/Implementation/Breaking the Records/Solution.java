// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++)
            scores[i] = input.nextInt();

        breakingTheRecord(scores);
    }

    private static void breakingTheRecord(int[] scores) {
        int breakMax = 0, max = scores[0], breakMin = 0, min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                breakMax++;
            } else if (scores[i] < min) {
                min = scores[i];
                breakMin++;
            }
        }

        System.out.println(breakMax + " " + breakMin);
    }
}
