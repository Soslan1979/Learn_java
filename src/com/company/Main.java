package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число с точкой: ");
        Scanner num = new Scanner(System.in);
        System.out.println("Ваше число - " + num.nextFloat ());
    }
}


