package com.day1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();
        String reversed="";
        for (int i = string.length()-1; i>=0; i--) {
            reversed +=string.charAt(i);

        }
        System.out.println("Reversed String: "+reversed);
    }
}
