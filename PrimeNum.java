package com.AlgorithmPrograms;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Prime numbers range of 0 - 1000 Numbers");
        PrimeNum primeNum = new PrimeNum();
        primeNum.primeOrNot(0, 1000);
    }

    public static void primeOrNot(int low, int high) {
        while (low < high) {
            int flag = 0;

            // ignore numbers less than 2
            if (low <= 1) {
                ++low;
                continue;
            }

            // if low is a non-prime number, flag will be 1
            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.print(low+" ");

            low++;
        }
    }
}
