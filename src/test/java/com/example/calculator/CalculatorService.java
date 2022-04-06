package com.example.calculator;

import org.springframework.stereotype.Service;

public class CalculatorService {
    public String Calculator() {
        return "<b><i>Добро пожаловать в калькулятор</i></b>";
    }
public String CalculatorPlus(Integer num1, Integer num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;
    }

    public String CalculatorMinus(Integer num1, Integer num2) {
        int minus = num1 - num2;
        return num1 + "-" + num2 + "=" + minus;
    }

    public String CalculatorMultiply(Integer num1, Integer num2) {
        int multiply = num1 * num2;
        return num1 + "*" + num2 + "=" + multiply;
    }

    public String CalculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "Деление на 0 запрещено!";
        } else {
            int divide = num1 / num2;
            return num1 + "/" + num2 + "=" + divide;
        }
    }
}
