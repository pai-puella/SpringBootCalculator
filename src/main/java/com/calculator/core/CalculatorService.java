package com.calculator.core;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String plus(Double num1, Double num2) {
        Double result = num1 + num2;
        return String.format("%.2f + %.2f = %.2f", num1, num2, result);
    }

    public String minus(Double num1, Double num2) {
        Double result = num1 - num2;
        return String.format("%.2f - %.2f = %.2f", num1, num2, result);
    }

    public String multiply(Double num1, Double num2) {
        Double result = num1 * num2;
        return String.format("%.2f * %.2f = %.2f", num1, num2, result);
    }

    public String divide(Double num1, Double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        Double result = num1 / num2;
        return String.format("%.2f / %.2f = %.2f", num1, num2, result);
    }
}
