package com.BASIC;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int reversed = 0, remainder;

        while (num > 0) {
            remainder = num % 10;          // get last digit
            reversed = (reversed * 10) + remainder; // build reversed number
            num /= 10;                     // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
