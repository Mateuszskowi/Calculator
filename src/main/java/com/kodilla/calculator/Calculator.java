package com.kodilla.calculator;
class Calculator{
    public void subtraction() {
        System.out.println("It works!");
    }

    public void addition() {
        System.out.println("It works!");
    }
}
class CalculatorApplication {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.subtraction();
        calculator.addition();
    }
}
