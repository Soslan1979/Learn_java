package com.company;
import java.util.Scanner;

public class lesson_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age >>> ");
        age = scanner.nextInt();

        if (age <= 10) {
            System.out.print("Child");
        }
        if (age > 10 || age <= 18 )
            System.out.print("Teenager");
        else {
            System.out.println("Adult");
        }
    }
}






