// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        System.out.println(dayOfProgrammer(year));
    }

    private static String dayOfProgrammer(int year) {
        String day = "";

        if (year <= 1917) {
            if (year % 4 == 0) {
                day =  "12.09." + year;
            } else {
                day = "13.09." + year;
            }
        } else if (year >= 1919) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                day = "12.09." + year;
            } else {
                day = "13.09." + year;
            }
        } else if (year == 1918) {
            day = "26.09.1918";
        }
        return day;
    }
}
