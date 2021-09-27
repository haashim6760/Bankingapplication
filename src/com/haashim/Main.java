package com.haashim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome");
        int balance = 1000;

        for(int i = 0; i == i; i++) {
            
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        int input1;

        if (input.equals("checkbalance")) {
                System.out.println(balance);

            } else if (input.equals("deposit")) {
                input1 = Integer.parseInt(scanner1.next());
                balance = balance + input1;
                System.out.println(balance);

            } else if (input.equals("withdraw")) {
                input1 = Integer.parseInt(scanner1.next());
                balance = balance - input1;
                System.out.println(balance);

            } else if (input.equals("exit")) {
                System.out.println(input);
                break;

            } else {
                System.out.println("Incorrect input");
            }
        }
    }
}