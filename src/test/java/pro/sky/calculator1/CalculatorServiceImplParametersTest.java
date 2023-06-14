package pro.sky.calculator1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametersTest {
    calculatorServiceImpl service = new calculatorServiceImpl();


    private static Collection<Arguments> parameters() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-4, -8),
                Arguments.of(9, -2),
                Arguments.of(1, -6));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testPlus(int num1, int num2) {
        Integer actual = service.plus(num1, num2);
        Integer expected = num1 + num2;
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testMinus(int num1, int num2) {
        Integer actual = service.minus(num1, num2);
        Integer expected = num1 - num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testMultiply(int num1, int num2) {
        Integer actual = service.multiply(num1, num2);
        Integer expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testDivide(int num1, int num2) {
        Integer actual = service.divide(num1, num2);
        Integer expected = num1 / num2;
        assertEquals(expected, actual);
    }
}
