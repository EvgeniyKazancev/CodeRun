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
        int summ = 0;

             int[] price = new int[sale];
             int[] bayersPrice = new int[bayer];
        if (sale < 1  || bayer < 1 ) {
         System.out.println("ERROR");
        }else {
             List<Long> result = new ArrayList<>();
             long temp;
             for (int i = 0; i < sale; i++) {
                 price[i] = in.nextInt();
             }
             for (int i = 0; i < bayer; i++) {
                 bayersPrice[i] = in.nextInt();
             }
             Arrays.sort(price);
             Arrays.sort(bayersPrice);

             int index = bayersPrice.length - 1;

            for (int i = 0; i < price.length; i++) {
                 int p = price[i];
                 if (bayersPrice[index] > p) {
                     temp = bayersPrice[index] - price[i];
                     result.add(temp);
                     index--;
                 }
             }

             for (long r : result) {
                 summ += r;


             }

             System.out.println(summ);
         }

    }
}
