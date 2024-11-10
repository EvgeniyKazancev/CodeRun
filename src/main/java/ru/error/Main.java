package ru.error;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);




        int n = scanner.nextInt();

        double[] probabilityRequest = new double[n];

        double[] probabilityError = new double[n];
        double probability = 0.0;
        for (int i = 0; i < n; i++) {
             probabilityRequest[i] = scanner.nextInt();
             probabilityError[i] = scanner.nextInt();
            probability += (probabilityRequest[i] / 100) * (probabilityError[i] / 100);


        }

        for (int i = 0; i < n; i++) {
            double serverError = ((probabilityRequest[i] / 100) * (probabilityError[i] / 100)) / probability;
            System.out.println(serverError);
        }



        scanner.close();
    }

}
