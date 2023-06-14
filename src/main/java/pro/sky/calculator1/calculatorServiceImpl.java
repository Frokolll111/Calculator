package pro.sky.calculator1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class calculatorServiceImpl  {
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
   public int plus(int num1, int num2) {
    return num1 + num2;
}

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }


    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
}