package com.epam.homework4;

import java.util.Scanner;

public class Task_Extra_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number please:   ");
        int number = sc.nextInt();
        System.out.println("Result:  " + getLastNumbers(number));
    }
    public static String getLastNumbers(int i_num){
        String result = "";
        if(i_num >= 10 || i_num <= -10){
            int len = String.valueOf(i_num).length();
            result = String.valueOf(i_num).substring(len - 2);
        }
        else {
            return "Invalid number";
        }
        return reverse(result);
    }
    public static String reverse(String i_res){
        String result = "";
        for(int i = i_res.length()-1; i >= 0; i--){
            result = result + i_res.charAt(i);
        }
        return result;
    }

}
