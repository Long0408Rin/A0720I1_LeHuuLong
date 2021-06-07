package com.codegym.service.impl;

import com.codegym.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Long calculator(Long num1, Long num2, String cal) throws Exception {
        switch (cal) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new Exception("Không thể chia cho 0");
                } else {
                    return num1 / num2;
                }
        }
        return null;
    }
}
