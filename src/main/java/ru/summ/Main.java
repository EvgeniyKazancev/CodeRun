package ru.summ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> results = new ArrayList<>();
        findCombinations(n, n, new ArrayList<>(), results);

        Collections.reverse(results);
        for (List<Integer> combination : results) {
            System.out.println(formatCombination(combination));
        }
        in.close();
    }

    private static void findCombinations(int n, int max, List<Integer> current, List<List<Integer>> results) {
        if (n == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = Math.min(n, max); i >= 1; i--) {
            current.add(i);
            findCombinations(n - i, i, current, results);
            current.remove(current.size() - 1);
        }
    }

    private static String formatCombination(List<Integer> combination) {
        StringBuilder sb = new StringBuilder();
        for (int num : combination) {

            sb.append(num).append(" + ");
        }
            sb.setLength(sb.length() - 3);
            return sb.toString();

    }
}


