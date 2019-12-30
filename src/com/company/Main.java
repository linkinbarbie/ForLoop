package com.company;

public class Main {

    public static void main(String[] args) {
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000d, i));
//        }
//
//        System.out.println("**********");
//
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000d, i));
//
//
//        }
        int n = 0;
        for (int i = 1; i < 15; i++) {


            if (isPrime(i)) {
                n++;

                switch (n) {
                    case 1:
                    case 2:
                    case 3:



                        System.out.println(i + " is a prime number " + "and the count is " + n);
                        break;

                }
            }
        } }










    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }



//        public static double calculateInterest ( double amount, double interestRate){
//            return (amount * (interestRate / 100));
//        }
    }

