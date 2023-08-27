import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    private ContaBancaria contaBancaria;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria("000");
    }

    @ParameterizedTest(name = "{1}")
    @CsvSource(value = {
            "-2.0, O valor para saque não pode ser negativo!",
            "0.1, O valor para saque não pode ser maior que o saldo atual da conta!"
    })
    public void withdrawExceptionCases(Double withdrawValue, String expectedMessage) {
        try {
            contaBancaria.sacar(withdrawValue);
        } catch (Exception e) {
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
