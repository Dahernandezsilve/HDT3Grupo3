/**
 * Interfaz que permite añadir los métodos que la calculadora de postfix empleara.
 * @author Diego Alexander Hernández Silvestre
 */
public interface IPostfixCalc {

    /**
     * Se encargara de evaluar la expresion que el usuario desee ingresar.
     * @param expresion Es una simple expresion como: 1 2 + 4 * 3 +
     * @return El resultado de evaluar la expresion.
     */
    int Evaluate(String expresion);
}
