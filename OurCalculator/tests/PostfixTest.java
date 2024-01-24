package tests;

import static org.junit.Assert.*;
import org.junit.*;
import src.Postfix;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 23/01/24
 * Clase que prueba los métodos de la clase postfix
 */
public class PostfixTest {
    
    /**
     * Test 1: Probar expresión 11 - 2 +
     */
    @Test
    public void testingAnInvalidPostfixExpression() {
        Postfix postfix = new Postfix();

        postfix.readOperation();
        assertEquals("La expresión no es válida", postfix.postfixOperate());
    }


    /**
     * Test 2: Probar expresión 10 2 / 2 - 1 +
     */
    @Test
    public void testingValidPostfixExpression() {
        Postfix postfix = new Postfix();

        postfix.readOperation();
        assertEquals("4", postfix.postfixOperate());
    }
}
