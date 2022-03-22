import java.io.IOException;
import java.lang.invoke.VarHandle.AccessMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion=0, opcion2=0, hash=0; 
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
                "4. Salir\n";
        String menu2 = "\nIngrese la opción que desea utilizar: \n" +
                "1. Ingresar producto\n" +
                "2. Buscar producto\n" +
                "3. Detalles de categoria\n" +
                "4. Detalles de categoria orddenados\n" +
                "5. Mostrar todos los productos con categorias\n" +
                "6. Salir\n";   
        System.out.println(menu);
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opción invalida");
            }  
        switch (opcion) {
            case 1:
                hash=1; 
                map.Hash();
                break;
            case 2:
                hash=2; 
                map.Tree();
                break;
            case 3:
                hash=3;
                System.out.println(hash);
                map.Linked(); 
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }                
        while (salir == false) {
            System.out.println(menu2); 
            try {
                opcion2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opción invalida");
            }
            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nombre de la categoria");
                    String v1=scan.nextLine(); 
                    System.out.println("Ingrese el nombre de la producto");
                    String v2=scan.nextLine(); 
                    map.AddValor(v1, v2, hash);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea buscar");
                    String name=scan.nextLine();
                    map.Nombre_de_producto(name, hash);
                    break;
                case 3: 
                     map.Datos_producto(hash);   
                     break;  
                case 4:
                    map.Datos_producto_nombres(hash);
                    break;   
                case 5:
                    map.Everything(hash);;
                    break;          
                case 6: 
                    System.out.println("Gracias, adios");
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }         
        }
    }
}
