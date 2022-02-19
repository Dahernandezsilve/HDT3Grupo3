import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase que permite definir los métodos que se encargarán del correcto funcionamiento de la lectura de archivos.
 * @author Diego Alexander Hernández Silvestre
 */
public class TXT {

    /**
     * Método encargado de leer el archivo .txt y almacenar el contenido en una variable.
     * @param direccion Dirección en la que se encuentra el archivo.
     * @return String con lo que el archivo contenía.
     */
    public String leer (String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String textotemp = "";
            String bflinea;
            while ((bflinea = bf.readLine()) != null){ //Ciclo que permitirá recorrer todo el txt.
                textotemp = textotemp + bflinea; //Texto completo
            }
            texto = textotemp;

        }catch (Exception e){
            System.out.println("El archivo no fue encontrado");
        }
        return texto;
    }
}
