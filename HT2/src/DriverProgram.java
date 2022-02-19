public class DriverProgram {
    public static void main (String[] args){
        TXT datos = new TXT();
        PostfixCalc p = new PostfixCalc();
        System.out.println("BIENVENIDO A LA CALCULADORA POSTFIX");
        String expresion = datos.leer("D:\\UVG\\Cursos\\Semestre 3\\Algoritmos y estructuras\\HojasdeTrabajo\\HT2\\datos.txt");
        String elementos[] = expresion.split(" ");
        System.out.println("Su archivo ha sido importado correctamente");
        System.out.println("Su archivo contiene la siguiente expresion: " + expresion);
        System.out.println("El resultado de evaluar esa expresion en la calculadora es la siguiente: ");
        System.out.println(p.Evaluate(expresion));
        System.out.println("");
    }
}
