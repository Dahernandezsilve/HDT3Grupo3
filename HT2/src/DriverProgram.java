public class DriverProgram {
    public static void main (String[] args){
        TXT datos = new TXT();
        System.out.println("BIENVENIDO A LA CALCULADORA POSTFIX");
        String operacion = datos.leer("D:\\UVG\\Cursos\\Semestre 3\\Algoritmos y estructuras\\HojasdeTrabajo\\HT2\\datos.txt");
        System.out.println("Su archivo ha sido importado correctamente");
        System.out.println("Su archivo contiene la siguiente expresion: " + operacion);
        System.out.println("El resultado de evaluar esa expresion en la calculadora es la siguiente: ");
        System.out.println("");
    }
}
