package com.day1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int a= scanner.nextInt();
        System.out.print("Enter a Second Number: ");
        int b= scanner.nextInt();
        while (b!=0){
            int temp =b;
            b= a%b;
            a= temp;
        }
        System.out.println("GCD: "+a);
    }
}
