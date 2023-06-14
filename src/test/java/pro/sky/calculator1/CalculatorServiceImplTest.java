package pro.sky.calculator1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {

    calculatorServiceImpl service = new calculatorServiceImpl();

    @Test
    void testPlus() {
        assertEquals(3, service.plus(1, 2));
        assertEquals(-3, service.plus(-1, -2));
        assertEquals(1, service.plus(-1, 2));
        assertEquals(-1, service.plus(1, -2));
    }

    @Test
    void testMinus() {
        Integer result = service.minus(1, 2);
        assertEquals(-1, result);

        Integer result2 = service.minus(-3, -4);
        assertEquals(1, result2);

        Integer result3 = service.minus(-3, 4);
        assertEquals(-7, result3);

        Integer result4 = service.minus(-1, -1);
        assertEquals(0, result4);
    }
    @Test
    void testMultiply() {
        Integer result = service.multiply(1, 2);
        assertEquals(2, result);

        Integer result2 = service.multiply(-3, -4);
        assertEquals(12, result2);

        Integer result3 = service.multiply(-3, 4);
        assertEquals(-12, result3);

        Integer result4 = service.multiply(-1, -1);
        assertEquals(1, result4);
    }

    @Test
    void testDivide() {
        Integer result = service.divide(1, 2);
        assertEquals(0, result);

        Integer result2 = service.divide(-4, -4);
        assertEquals(1, result2);

        Integer result3 = service.divide(-8, 4);
        assertEquals(-2, result3);

        Integer result4 = service.divide(12, -12);
        assertEquals(-1, result4);
        assertThrows(ArithmeticException.class, () -> service.divide(3, 0));
        try {
            service.divide(3, 0);
            fail();
        } catch (ArithmeticException ignor) {

        }
    }


}
