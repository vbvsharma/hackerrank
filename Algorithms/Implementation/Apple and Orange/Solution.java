// https://www.hackerrank.com/challenges/apple-and-orange/problem

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int t = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();

        int[] appleDist = new int[m];
        for (int i = 0; i < m; i++)
            appleDist[i] = input.nextInt();

        int[] orangeDist = new int[n];
        for (int i = 0; i < n; i++)
            orangeDist[i] = input.nextInt();

        countApplesAndOranges(s, t, a, b, appleDist, orangeDist);
    }

    private static void countApplesAndOranges(int s, int t, int a, int b, int[] appleDist, int[] orangeDist) {
        int countApples = 0, countOranges = 0;

        for (int i = 0; i < appleDist.length; i++) {
            if (0 < appleDist[i] && s <= a + appleDist[i] && a + appleDist[i] <= t)
                countApples++;
        }

        for (int i = 0; i < orangeDist.length; i++) {
            if (0 > orangeDist[i] && s <= b + orangeDist[i] && b + orangeDist[i] <= t)
                countOranges++;
        }

        System.out.println(countApples + "\n" + countOranges);


    }
}
