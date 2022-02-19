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
