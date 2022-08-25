package com.example.demo.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
/*
* Autowiring feature of spring framework enables you to inject the object dependency implicitly.
* It internally uses setter or constructor injection.
* Autowiring can't be used to inject primitive and string values. It works with reference only.
 */
    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
/*
*Annotation Type GetMapping. Annotation for mapping HTTP GET requests onto specific handler methods.
 */

/*
*    @GetMapping("/sum")
    public List<SumValue> getsum(int firstNumber, int secondNumber){
        return calculatorService.getSum(firstNumber, secondNumber);
    }
*/


    @PostMapping("/sum")
    public List<SumValue> getSum(@RequestBody Calculator calc){
        //System.out.println(calc.getFirstNumber() + "  " + calc.getSecondNumber());
        return calculatorService.getSum(calc.getFirstNumber(), calc.getSecondNumber());
    }

    @PostMapping("/subtract")
    public List<SubtractValue> getSubtract(@RequestBody Calculator calc){
        return calculatorService.getSubtract(calc.getFirstNumber(), calc.getSecondNumber());
    }




}
