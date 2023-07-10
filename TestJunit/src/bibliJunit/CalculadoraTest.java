package bibliJunit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculadoraTest {

    private Assertions Assert;

    @Test
    public void deveriaSomarDoisNumerosPositivos () {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
    }
}
