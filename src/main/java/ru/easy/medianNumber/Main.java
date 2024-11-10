package ru.easy.medianNumber;


import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int unicCount = 0;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                unicCount++;
            }
       }
            System.out.println(unicCount);
    }
}
