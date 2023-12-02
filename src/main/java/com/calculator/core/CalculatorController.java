package com.calculator.core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1") Double num1, @RequestParam(value = "num2") Double num2) {
        return calculatorService.divide(num1, num2);
    }
}
