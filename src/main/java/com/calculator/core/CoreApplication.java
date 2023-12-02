package com.calculator.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/calculator")
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorController.class, args);
	}

}
