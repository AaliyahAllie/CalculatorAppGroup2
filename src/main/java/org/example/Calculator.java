package org.example;
//this holds our methods for the calculator execution
public class Calculator {

    //why we use public infront of int is because if we want another class to use the add method, and we make
    //it private the other class won't have access to it only the class that its in will
    //PUBLIC = Main class and Calculator Class can make use of it
    //PRIVATE = Only Calculator class can make use of it
    public int add(int a, int b) {
        //addition method to add integer a and integer b together
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero IS NOT POSSIBLE");
        }
        return (double) a/b;
    }
}
