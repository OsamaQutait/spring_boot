package com.example.demo.calculator;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    public List<Calculator> getSum(){
        return List.of(new Calculator(5, 10));
    }
}
