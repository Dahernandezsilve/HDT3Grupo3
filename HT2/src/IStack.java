/**
 * Interfaz que permite añadir los métodos de una ADT Stack (PILA).
 * @param <T> Se puede ingresar cualquier tipo de parametro.
 * @author Diego Alexander Hernández Silvestre
 */
public interface IStack<T> {

    /**
     * Añade un valor a la pila en la primer posición.
     * @param value Valor a agregar.
     */
    void push(T value);

    /**
     * Elimina el elemento de la pila en la posición cero.
     * @return El elemento removido
     */
    T pull();

    /**
     * Obtiene el valor del elemento de la posición cero de la pila
     * @return El elemento obtenido.
     */
    T peek();

    /**
     * Cuenta la cantidad de datos que tiene la pila en ese momento.
     * @return El número de elementos de la pila.
     */
    int count();

    /**
     * Verifica si la pila se encuentra vacia.
     * @return True = Vacia, False = Contiene elementos.
     */
    boolean isEmpty();
}
