import java.io.BufferedReader;
import java.io.FileReader;

public class TXT {

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
