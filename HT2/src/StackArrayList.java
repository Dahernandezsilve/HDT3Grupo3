import java.util.ArrayList;

/**
 * Clase que permite definir los métodos que se encargarán del correcto funcionamiento de la PILA.
 * @param <T> Se puede crear la clase con cualquier tipo de parametro.
 * @author Diego Alexander Hernández Silvestre
 */
public class StackArrayList<T> implements IStack<T>{

    private ArrayList<T> coreList;

    public StackArrayList(){
        coreList = new ArrayList<T>();
    }

    /**
     * Añade un valor a la pila en la primer posición.
     * @param value Valor a agregar.
     */
    @Override
    public void push(T value) {
        coreList.add(0, value);
    }

    /**
     * Elimina el elemento de la pila en la posición cero.
     * @return El elemento removido
     */
    @Override
    public T pull() {
        return coreList.remove(0);
    }

    /**
     * Obtiene el valor del elemento de la posición cero de la pila
     * @return El elemento obtenido.
     */
    @Override
    public T peek() {
        return coreList.get(0);
    }

    /**
     * Cuenta la cantidad de datos que tiene la pila en ese momento.
     * @return El número de elementos de la pila.
     */
    @Override
    public int count() {
        return coreList.size();
    }

    /**
     * Verifica si la pila se encuentra vacia.
     * @return True = Vacia, False = Contiene elementos.
     */
    @Override
    public boolean isEmpty() {
        return coreList.isEmpty();
    }



}
