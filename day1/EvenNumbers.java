package com.day1;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of even numbers to generate: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
    }
}