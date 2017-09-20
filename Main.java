package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        start();

    }

    public static void calculateArea(double number1, double number2) {
        System.out.println("Unešenim vrijednostima dobivamo pravokutnik širine " + number1 +" i dužine " + number2);
        System.out.println("Površina pravokutnika iznosi: " + number1 * number2 +
                ", dok je dijagonala " + 2*(number1 + number2) + ".");
    }

    public static double readingUserInput() throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new BufferedInputStream(System.in)));

            String line = reader.readLine();
            if (line == "") {
                System.out.println("Nema unosa");
                start();
            }
            double broj = Double.parseDouble(line);


            return broj;
        }

    public  static void start() throws IOException {
        System.out.println("Unesi širinu pravokutnika:");
        double broj1 = readingUserInput();
        if(broj1 < 0) {
            System.out.println(broj1 + " je negativan.");
            start();
        }
        System.out.println("Unesi dužinu pravokutnika:");
        double broj2 = readingUserInput();
        if(broj2 < 0) {
            System.out.println(broj2 + " je negativan.");
            System.out.println("Unesi ponovno dužinu pravokutnika:");
            broj2 = readingUserInput();

        }
        calculateArea(broj1, broj2);
    }
}



