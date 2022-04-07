package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }

    @GetMapping(path = "/plus")
    public String sumNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sum(num1, num2);
        return generateMassage(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String subtractNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sum(num1, num2);
        return generateMassage(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.sum(num1, num2);
        return generateMassage(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0){
            return "<h>Второй аргумент равен 0. Деление на 0 невозможно.</h1>";
        }
        int result = calculatorService.divide(num1, num2);
        return generateMassage(num1, num2, '/', result);
    }

    public String generateMassage(int num1, int num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}
