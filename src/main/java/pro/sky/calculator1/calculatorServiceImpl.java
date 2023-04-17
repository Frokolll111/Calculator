package pro.sky.calculator1;

import org.springframework.stereotype.Service;
@Service
public class calculatorServiceImpl implements calculatorService {
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plusCalculator(int num1, int num2) {
        int sum = num1 + num2;
        return  num1 + " + "+ num2 +" = " + sum;
    }

    public String minusCalculator(int num1, int num2) {
        int sum = num1 - num2;
        return  num1 + " - "+ num2 +" = " + sum;
    }

    public String multiplyCalculator(int num1, int num2) {
        int sum = num1 * num2;
        return  num1 + " * "+ num2 +" = " + sum;
    }


    public String divideCalculator(int num1, int num2) {
        int sum = num1 / num2;
        return  num1 + " / "+ num2 +" = " + sum;
    }

    public int divideByZero( int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new RuntimeException();
        }
    }

    public String noDataSubmitted(String num1, String num2) {
        if (num1 != null || num2 != null ) {
            return null;
        }else
            throw new RuntimeException();
    }
}
