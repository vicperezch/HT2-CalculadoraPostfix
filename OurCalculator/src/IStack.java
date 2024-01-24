package src;

/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 20/01/24
 * Interfaz que describe los métodos para el funcionamiento de la pila
 */

public interface IStack<T> {
    void push(T value);
    T pop();
}
