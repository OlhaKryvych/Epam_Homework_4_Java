package com.epam.homework4;

import java.util.Scanner;

public class Task_Extra_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of piramid please: ");
        int height = sc.nextInt();
        if(height <= 9 && height >= 1){
            printPiramid(height);
        }
        else {
            System.out.println("Invalid height");
        }
    }
    public static void printPiramid(int height){
        for(int i = 0; i <= height; i++){
            for(int j = 0; j < height - i; j++){
                System.out.print(" ");
            }
            printNumbers(i+1);
            System.out.println();
        }
    }
    public static void printNumbers(int maxNum){
        for(int i = 0; i < maxNum; i++){
            System.out.print(i+1);
        }
        for(int i = maxNum-1; i > 0; i--){
            System.out.print(i);
        }
    }
}
