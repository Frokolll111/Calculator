package pro.sky.calculator1;

public interface calculatorService {
    String helloCalculator();
    String plusCalculator(int num1, int num2);
    String minusCalculator(int num1, int num2);
    String multiplyCalculator(int num1, int num2);
    String divideCalculator(int num1, int num2);

    int divideByZero(int num1, int num2);

    String noDataSubmitted(String num1, String num2);
}
