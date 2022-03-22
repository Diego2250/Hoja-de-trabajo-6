import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion=0; 
        boolean salir=false; 
        archivos arch=new archivos(); 
        Scanner scan=new Scanner(System.in);
        Maps map=new Maps();
        ArrayList<String> datos=new ArrayList<>();
        datos=arch.leer(); 
        map.datos(datos);
        String menu = "\nIngrese la opción que desea utilizar: \n" +
                "1. HashMap\n" +
                "2. TreeMap\n" +
                "3. LinkedHashMap\n" +
                "6. Salir\n";
        while (salir == false) {
            System.out.println(menu);
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opción invalida");
            }          
        }
    }
}
