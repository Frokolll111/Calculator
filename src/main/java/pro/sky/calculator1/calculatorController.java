package pro.sky.calculator1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/calculator")
public class calculatorController  {
    private final calculatorService calculator;
    public calculatorController(calculatorService calculator) {
        this.calculator = calculator;
    }
    @GetMapping
    public String helloCalculator() {
        return calculator.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam int num1,@RequestParam int num2) {
        return  calculator.plusCalculator(num1 , num2);
    }

   @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam int num1,@RequestParam int num2) {
        return  calculator.minusCalculator(num1 , num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam int num1,@RequestParam int num2) {
        return calculator.multiplyCalculator(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam int num1,@RequestParam int num2) {
        return calculator.divideCalculator(num1,num2);
    }
}