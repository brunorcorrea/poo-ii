package test;

import main.DivisionByZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionByZeroTest {
    @Test
    public void given_valid_values_then_return_the_first_divided_by_the_second() {
        Assertions.assertEquals(5.0, DivisionByZero.divide(10.0, 2.0));
    }

    @Test
    public void given_second_value_is_zero_then_return_ArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            DivisionByZero.divide(1.0, 0.0);
        });
    }
}