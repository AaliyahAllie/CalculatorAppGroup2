package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator App");
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nResults");

        System.out.println(a + "+" + b + "=" + calc.add(a, b));
        System.out.println(a + " - " + b + "=" + calc.subtract(a, b));
        System.out.println(a + " * " + b + "=" + calc.multiply(a, b));
        try{
            System.out.println(a + " / " + b + "=" + calc.divide(a, b));
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}