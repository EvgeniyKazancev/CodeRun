package ru.ostap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sale = in.nextInt();
        int bayer = in.nextInt();
        long summ ;
        if (sale < 1 || bayer < 1) {
            System.out.println("ERROR");
        } else {
            int[] price = new int[sale];
            int[] bayersPrice = new int[bayer];
            for (int i = 0; i < sale; i++) {
                price[i] = in.nextInt();
            }
            for (int i = 0; i < bayer; i++) {
                bayersPrice[i] = in.nextInt();
            }

            summ = calculateSum(price, bayersPrice);
            System.out.println(summ);

        }

    }
    public static long calculateSum(int[] price, int[] bayersPrice) {
        long sum = 0;
        List<Long> result = new ArrayList<>();

        Arrays.sort(price);
        Arrays.sort(bayersPrice);
        int index = bayersPrice.length - 1;
        for (int i = 0; i < price.length; i++) {
            if (index < 0) break;

            if (bayersPrice[index] > price[i]) {
                long temp = bayersPrice[index] - price[i];
                result.add(temp);
                index--;
            }
        }

        for (long r : result) {
            sum += r;
        }
        return sum;
    }
}
