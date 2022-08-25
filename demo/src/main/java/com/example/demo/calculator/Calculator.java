package com.example.demo.calculator;

public class Calculator {
    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }
    public int add(int first, int second) {
        return first + second;
    }
    public int subtract(int first, int second) {
        return first - second;
    }
/*
    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second){
        if(second == 0)
            throw new ArithmeticException();
        return first / second;
    }

 */

}
