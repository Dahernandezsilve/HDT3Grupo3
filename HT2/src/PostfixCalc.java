import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class PostfixCalc implements IPostfixCalc {

    StackArrayList Stack = new StackArrayList();

    @Override
    public int Evaluate(String expresion) {
        int valor1;
        int valor2;
        String operando;
        int resultado = 0;
        String[] elementos = expresion.split(" ");


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
            } else if (operando.equals("/")){
                resultado = valor1 / valor2;
            }
            Stack.push(resultado);
        }
        return resultado;
    }
}
