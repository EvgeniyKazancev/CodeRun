package ru.programmerInBeach;


import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test-- > 0) {
            int shizlong = scanner.nextInt();
            int[] arr = new int[shizlong];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
           Arrays.sort(arr);
           int minXor = Integer.MAX_VALUE;

            for (int i = 1; i < arr.length; i++) {
                int xorResult = arr[i] ^ arr[i - 1];
               if (xorResult < minXor) {
                   minXor = xorResult;
               }
            }

            System.out.println(minXor);
        }


        scanner.close();
    }
}
