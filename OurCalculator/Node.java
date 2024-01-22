/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 22/01/24
 * Clase que representa un nodo de la pila
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    /**
     * Constructor de clase
     * @param value Valor que almacena el nodo
     */
    public Node(T value) {
        this.value = value;
        next = null;
    }

    /**
     * Getter
     * @return Valor que almacena el nodo
     */
    public T getValue() {
        return value;
    }

    /**
     * Setter
     * @param value Nuevo valor a almacenar
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Getter
     * @return Siguiente nodo en la pila
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Setter
     * @param next Nuevo nodo al cual apuntar
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
