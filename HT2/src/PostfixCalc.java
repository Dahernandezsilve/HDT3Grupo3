import static java.lang.Integer.parseInt;

public class PostfixCalc implements IPostfixCalc {

    StackArrayList Stack = new StackArrayList();

    @Override
    public int Evaluate(String expresion) {
        int valor1;
        int valor2;
        String operando;
        int resultado;
        String[] elementos = expresion.split(" ");
        for (String elemento: elementos){
            while (Stack.count()!=2){
                if (elemento.equals("1") | elemento.equals("2") | elemento.equals("3") || elemento.equals("4") || elemento.equals("5") | elemento.equals("6") | elemento.equals("7") | elemento.equals("8") | elemento.equals("9")){
                    Stack.push(parseInt(elemento));
                }
            }
            if (elemento.equals("+") | elemento.equals("-") | elemento.equals("/") || elemento.equals("*")){
                Stack.push(elemento);
            }
            valor1 = (int) Stack.peek();
            Stack.pull();
            valor2 = (int) Stack.peek();
            Stack.pull();
            operando = (String) Stack.peek();
            if (operando== "+"){
                resultado = valor1 + valor2;
            } else if (operando == "-"){
                resultado = valor1 - valor2;
            }

        }
        return 0;
    }
}
