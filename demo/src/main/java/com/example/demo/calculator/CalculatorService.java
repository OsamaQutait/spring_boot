package com.example.demo.calculator;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    public List<SumValue> getSum(int firstNumber, int secondNumber){
        Calculator calc = new Calculator(firstNumber, secondNumber);
        SumValue sum = new SumValue(calc.add(calc.getFirstNumber(), calc.getSecondNumber()));
        return List.of(sum);
    }

    public List<SubtractValue> getSubtract(int firstNumber, int secondNumber){
        Calculator calc = new Calculator(firstNumber, secondNumber);
        SubtractValue subtract = new SubtractValue(calc.subtract(calc.getFirstNumber(), calc.getSecondNumber()));
        return List.of(subtract);

    }

}
