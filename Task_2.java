package com.epam.homework4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number please:  ");
        int num = sc.nextInt();
        System.out.println("Your number in binary representation:   " + trasform(num));
    }

    public static String trasform(int number) {
        if(number >= 0) {
            String result = "";
            result = result + binaryCod(number);
            result = new StringBuilder(result).reverse().toString();
            return result;
        }
        else if(number < 0){
            String result = "1";
            number = Math.abs(number);
            result = binaryCod(number) + result;
            result = new StringBuilder(result).reverse().toString();
            return result;
        }
        else{
            return null;
        }
    }

    public static String binaryCod(int num){
        String res = "";
        while(num > 0){
            res = res + num % 2;
            num = num / 2;
        }
        return res;
    }
}
