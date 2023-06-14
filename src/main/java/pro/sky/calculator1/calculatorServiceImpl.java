package pro.sky.calculator1;

import org.springframework.stereotype.Service;

@Service
public class calculatorServiceImpl implements calculatorService {
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
@Override
    public String plusCalculator(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "Ошибка нету 1 или 2 числа ";
        }
        int sum = num1 + num2;
        return  num1 + " + "+ num2 +" = " + sum;
    }
    @Override
    public String minusCalculator(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "Ошибка нету 1 или 2 числа ";
        }
        int sum = num1 - num2;
        return  num1 + " - "+ num2 +" = " + sum;
    }
    @Override
    public String multiplyCalculator(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "Ошибка нету 1 или 2 числа ";
        }
        int sum = num1 * num2;
        return  num1 + " * "+ num2 +" = " + sum;
    }

    @Override
    public String divideCalculator(int num1, int num2) {
        if (num2 == 0) {
            return " Делить на ноль нельзя " ;
        }
        int sum = num1 / num2;
        return  num1 + " / "+ num2 +" = " + sum;
    }
}