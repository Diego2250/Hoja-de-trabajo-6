import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class archivos {
    public archivos(){

    }

    
    /** 
     * @return ArrayList
     */
    public ArrayList leer(){
        ArrayList<String> data= new ArrayList<>();
        try {
          File myObj = new File("ListadoProducto.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String linea = myReader.nextLine();
            data.add(linea);

          }
          myReader.close();
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
        return data; 
      }

}
