public class PostfixCalc implements IPostfixCalc {

    StackArrayList Stack = new StackArrayList();

    @Override
    public int Evaluate(String expresion) {

        String[] elementos = expresion.split(" ");
        if (Stack.isEmpty()){
            Stack.push(elementos);

        }

        return 0;
    }
}
