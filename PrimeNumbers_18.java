package com.web.java;

public class PrimeNumbers_18 {

	public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First five prime numbers are:");

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
