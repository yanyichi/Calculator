package hw.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    Operator operator =new Operator();

    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public double getAdd(@PathVariable double firstNumber, @PathVariable double secondNumber) {
        return operator.add(firstNumber,secondNumber);
    }

    @GetMapping("/sub/{firstNumber}/{secondNumber}")
    public double getSub(@PathVariable double firstNumber, @PathVariable double secondNumber) {
        return operator.sub(firstNumber,secondNumber);
    }

    @GetMapping("/mul/{firstNumber}/{secondNumber}")
    public double getMul(@PathVariable double firstNumber, @PathVariable double secondNumber) {
        return operator.mul(firstNumber,secondNumber);
    }

    @GetMapping("/div/{firstNumber}/{secondNumber}")
    public double getDiv(@PathVariable double firstNumber, @PathVariable double secondNumber) {
        return operator.div(firstNumber,secondNumber);
    }

    @GetMapping("/mod/{firstNumber}/{secondNumber}")
    public double getMod(@PathVariable double firstNumber, @PathVariable double secondNumber) {
        return operator.mod(firstNumber,secondNumber);
    }

}
