// https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.println(migratoryBirds(arr));
    }

    private static int migratoryBirds(int[] arr) {
        int[] sightings = new int[5];

        for (int i = 0; i < arr.length; i++) {
            sightings[arr[i]-1]++;
        }

        int id = 0;
        for (int i = 1; i < 5; i++)
            if (sightings[i] > sightings[id])
                id = i;

        return id+1;
    }
}
