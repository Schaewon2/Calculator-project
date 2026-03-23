package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private List<Double> results = new ArrayList<>();

    private double result = 0.0;

    public double calculate(int num1, int num2, char op) {
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / (double) num2;
                break;
        }
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public double getResult() {
        return result;
    }
}
