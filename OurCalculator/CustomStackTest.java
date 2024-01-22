import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 22/01/24
 * Clase que prueba los métodos de la pila personalizada
 */
public class CustomStackTest {

    /**
     * Test 1: Sacar un elemento de la pila cuando está vacía
     */
    @Test
    public void popWhenStackIsEmpty() {
        CustomStack<Integer> stack = new CustomStack<>();

        assertEquals(null, stack.pop());
    }


    /**
     * Test 2: Añadir un entero 1 y sacarlo de la pila
     */
    @Test
    public void addingAndPoppingOneElement() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);

        assertEquals(1, (int) stack.pop());
    }


    /**
     * Test 3: Añadir tres elementos y sacar el del medio
     */
    @Test
    public void addingAndPoppingThreeElements() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.pop();

        assertEquals(2, (int) stack.pop());
    }
}
