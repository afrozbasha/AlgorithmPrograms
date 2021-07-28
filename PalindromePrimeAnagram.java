package com.AlgorithmPrograms;
import java.util.Scanner;

public class PalindromePrimeAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String str = ""+num;
        char[] arr = str.toCharArray();
        int flag=0;
        for (int i=0; i<=arr.length-1; i++ ){
            if (arr[i] != arr[arr.length-i-1]){
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Not Palindrome and Anagram");
        else
            System.out.println("Palindrome and Anagram"); ;
    }



}
