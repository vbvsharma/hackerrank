import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        input.nextLine();

        while (T > 0) {
            String s = input.nextLine();

            StringBuilder even = new StringBuilder("");
            StringBuilder odd = new StringBuilder("");

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even.append(s.charAt(i));
                } else {
                    odd.append(s.charAt(i));
                }
            }

            System.out.println(even + " " + odd);
            T--;
        }
    }
}

