/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 20/01/24
 * Clase que prueba los métodos de la calculadora
 */

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
    
    /**
     * Test 1: Colocar un operador considerado no válido retorna una excepción 
     */
    @Test
    public void testNotAValidOperatorThrowsException() {
        Calculator newCalculator = new Calculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> newCalculator.calculate('.', 5, 8));
        assertNull(exception.getMessage());
    }

    /**
     * Test 2: Divisiones aritméticas simples funcionan
     */
    @Test
    public void testEightDividedByFourEqualsTwo() {
        Calculator newCalculator = new Calculator();
        assertEquals(2, newCalculator.calculate('/', 8, 4));
    }

    /**
     * Test 3: Método para multiplicar funciona correctamente
     */
    @Test
    public void testFiveTimesTenDoesntEqualFourty() {
        Calculator newCalculator = new Calculator();
        assertFalse(newCalculator.multiply(5, 10) == 40);
    }
}
