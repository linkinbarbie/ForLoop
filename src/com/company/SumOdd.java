package com.company;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }


    }

    public static int sumOdd(int Start, int End) {
        int sum = 0;
        if ((Start >= 0 && End >= 0) && End >= Start) {
            for (int i = Start; i <= End; i++) {
                if (isOdd(i)) {
                  //  System.out.println(i);
                    sum += i;
                }


            }
            return sum;

        }
        return -1;

    }
}
