import static java.lang.Integer.parseInt;

/**
 *Clase que permite definir los métodos que se encargarán del correcto funcionamiento de la calculadora postfix.
 * @author Diego Alexander Hernández Silvestre
 */
public class PostfixCalc implements IPostfixCalc {

    StackArrayList Stack = new StackArrayList();

    /**
     * Se encargara de evaluar la expresion que el usuario desee ingresar.
     * @param expresion Es una simple expresion como: 1 2 + 4 * 3 +
     * @return El resultado de evaluar la expresion.
     */
    @Override
    public int Evaluate(String expresion) {
        int valor1;
        int valor2;
        String operando;
        int resultado = 0;
        String[] elementos = expresion.split(" ");

        if (Stack.isEmpty()){
            for (int i=0; i<elementos.length;i++){
                while (Stack.count()<=1){
                    if (elementos[i].equals("1") | elementos[i].equals("2") | elementos[i].equals("3") | elementos[i].equals("4") | elementos[i].equals("5") | elementos[i].equals("6") | elementos[i].equals("7") | elementos[i].equals("8") | elementos[i].equals("9")){
                        Stack.push(parseInt(elementos[i]));
                        i++;
                    }
                }
                if (elementos[i].equals("+") | elementos[i].equals("-") | elementos[i].equals("/") | elementos[i].equals("*")){
                    Stack.push(elementos[i]);
                }

                operando = (String) Stack.peek();
                Stack.pull();
                valor2 = (int) Stack.peek();
                Stack.pull();
                valor1 = (int) Stack.peek();
                Stack.pull();
                if (operando.equals("+")){
                    resultado = valor1 + valor2;
                } else if (operando.equals("-")){
                    resultado = valor1 - valor2;
                } else if (operando.equals("*")){
                    resultado = valor1 * valor2;
                } else if (operando.equals("/") & valor2 != 0) {
                    resultado = valor1 / valor2;
                }
                Stack.push(resultado);
            }
        }
        return resultado;
    }
}
