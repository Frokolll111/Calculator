package pro.sky.calculator1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequestMapping
public class calculatorController {
    private final calculatorService calculatorService;

    public calculatorController(calculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator" + "/plus")
    public String plusCalculator(@RequestParam int num1, int num2) {
        return  calculatorService.plusCalculator(num1 , num2);
    }

    @GetMapping(path = "/calculator" + "/minus")
    public String minusCalculator(@RequestParam int num1, int num2) {
        return  calculatorService.minusCalculator(num1 , num2);
    }

    @GetMapping(path = "/calculator" + "/multiply")
    public String multiplyCalculator(@RequestParam int num1, int num2) {
        return calculatorService.multiplyCalculator(num1,num2);
    }

    @GetMapping(path = "/calculator" + "/divide")
    public String divideCalculator(@RequestParam int num1, int num2) {
        return calculatorService.divideCalculator(num1,num2);
    }
    @RequestMapping
    @GetMapping(path = "/calculator" + "/divide")
    public int divideByZeroCalculator(@RequestParam int num1, int num2) {
        return calculatorService.divideByZero(num1,num2);
    }

    @GetMapping
    public String noDataSubmitted(@RequestParam String num1, String num2) {
        return calculatorService.noDataSubmitted(num1, num2);
    }
}