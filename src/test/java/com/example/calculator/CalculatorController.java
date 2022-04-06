package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorServiсe calculatorServiсe = new CalculatorServiсe();

    public CalculatorController(CalculatorServiсe calculatorServiсe) {
        this.calculatorServiсe = calculatorServiсe;
    }

    @GetMapping(path = "/calculator")
    public String Calculator() {
        return calculatorServiсe.Calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String CalculatorPlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.CalculatorPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String CalculatorMinus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.CalculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String CalculatorMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.CalculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String CalculatorDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculatorServiсe.CalculatorDivide(num1, num2);
    }
}
