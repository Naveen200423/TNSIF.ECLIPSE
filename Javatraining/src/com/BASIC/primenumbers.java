package com.BASIC;

public class primenumbers {
	 public static void main(String[] args) {
	        System.out.println("Prime numbers from 1 to 100 are:");

	        for (int n = 2; n <= 100; n++) {
	            boolean isPrime = true;

	            // Check Divisibility from 2 to sort(n)
	            
	            for (int i = 2; i * i <= n; i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(n + " ");
	            }
	        }
	    }
	}


