import static java.lang.Integer.TYPE;
import static java.lang.Integer.parseInt;

/**Universidad del Valle de Guatemala
 * Facultad de Ingeniería
 * Departamento de Ciencia de la Computación.
 * Algoritmos y Estructuras de datos.
 * Sección: 20
 *
 * Hoja de Trabajo #2
 *
 * Entorno: El ejercicio tiene como objetivo, lograr que el usuario
 * experimente una simulación de un sistema de radio a traves de una interfaz.
 *
 * Estudiante: Diego Alexander Hernández Silvestre
 * Carné: 21270
 * @version 1.0
 * @author Diego Alexander Hernández Silvestre
 */
public class DriverProgram {
    /**
     * Método principal que se encargará de mostrar al usuario el resultado de establecer su archivo.
     * @param args Permite ejecutar el programa.
     */
    public static void main (String[] args){
        int contadorDigitos = 0;
        int contadorOperadores = 0;
        boolean valor1 = false;
        boolean valor2 = false;
        boolean operador = false;

        TXT datos = new TXT();
        PostfixCalc p = new PostfixCalc();
        System.out.println("BIENVENIDO A LA CALCULADORA POSTFIX");
        String expresion = datos.leer("D:\\UVG\\Cursos\\Semestre 3\\Algoritmos y estructuras\\HojasdeTrabajo\\HT2\\datos.txt");
        String elementos[] = expresion.split(" ");
        for (String elemento: elementos){
            if (elemento.equals("0") | elemento.equals("1") | elemento.equals("2") | elemento.equals("3") | elemento.equals("4") | elemento.equals("5") | elemento.equals("6") | elemento.equals("7") | elemento.equals("8") | elemento.equals("9")){
                contadorDigitos++;
            }
            if (elemento.equals("+") | elemento.equals("-") | elemento.equals("/") | elemento.equals("*")){
                contadorOperadores++;
            }
        }
        if (elementos[0].equals("+") | elementos[0].equals("-") | elementos[0].equals("/") | elementos[0].equals("*")){
            valor1 = true;
        }
        if (elementos[1].equals("+") | elementos[1].equals("-") | elementos[1].equals("/") | elementos[1].equals("*")){
            valor2 = true;
        }
        if (elementos[2].equals("+") | elementos[2].equals("-") | elementos[2].equals("/") | elementos[2].equals("*")){
           operador = true;
        }
        if (contadorOperadores+1 == contadorDigitos & !valor1 & !valor2 & operador){
            System.out.println("Su archivo ha sido importado correctamente");
            System.out.println("Su archivo contiene la siguiente expresion: " + expresion);
            System.out.println("El resultado de evaluar esa expresion en la calculadora es la siguiente: ");
            System.out.println(p.Evaluate(expresion));
            System.out.println("");
        } else {
            System.out.println("La expresion ingresada en el archivo es invalida");
        }
    }
}
