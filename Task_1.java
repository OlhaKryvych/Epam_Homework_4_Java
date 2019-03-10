package com.epam.homework4;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string please: ");
        String line = sc.nextLine();
        System.out.println("Unique symbols of entered line:  " + uniqueSymbol(line));
    }

    public static String uniqueSymbol(String line) {
        if(line.trim().length() != 0) {
            String unique = "";
            for(int count = 0; count < line.length(); count++) {
                char symbol = line.charAt(count);
                if(!unique.contains(String.valueOf(symbol))) {
                    unique = unique + symbol;
                }
            }
            return unique;
        }
        return null;
    }
}