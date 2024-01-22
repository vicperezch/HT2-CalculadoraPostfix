/**
 * @author Nils Muralles & Víctor Pérez
 * @version 1.0.0
 * @since 21/01/24
 * Clase personalizada que modela una pila
 */
public class CustomStack<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    
    /**
     * Agrega un nuevo dato a la pila
     * @param value Valor a añadir
     */
    public void push(T value) {
        if (lastNode == null) {
            lastNode = new Node<T>(value);
            firstNode = lastNode;

        } else {
            Node<T> current = new Node<T>(value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }


    /**
     * Elimina el siguiente elemento en la pila
     * @return Elemento eliminado
     */
    public T pop() {
        if (firstNode != null) {
            T valueFirst = firstNode.getValue();
            firstNode = firstNode.getNext();

            return valueFirst;

        } else {
            return null;
        }
    }
}
