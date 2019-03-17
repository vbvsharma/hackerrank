// https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            
            Integer phone = phonebook.get(s);

            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phone);
            }
        }
        in.close();
    }
}