package com.AlgorithmPrograms;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings : ");
        System.out.println("String One : ");
        String str1 = sc.nextLine();
        System.out.println("String Two : ");
        String str2 = sc.nextLine();

        //Replace space to backspace
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        //change to arrays
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        if (arr1.length != arr2.length)
            System.out.println("False");

        //Soring arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //checking equal
        if (Arrays.equals(arr1, arr2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
