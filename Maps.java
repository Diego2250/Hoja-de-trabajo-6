import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.security.PublicKey;
import java.util.ArrayList;
public class Maps {
    private HashMap<String, ArrayList> Productos=new HashMap<s, ArrayList>();
    private ArrayList<String> Datos=new ArrayList<>();
    private LinkedHashMap<String, ArrayList> ProductosL = new LinkedHashMap<String, ArrayList>();
    private TreeMap <String, ArrayList> ProductosT = new TreeMap<String, ArrayList>();

    public void Hash(){
        for (int i = 0; i < Datos.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Datos.get(i);
            String V=Datos.get(i+1);
            if (Productos.size()==0) {
                Nombres.add(V);
                Productos.put(K, Nombres);
            } else if(Productos.get(K)!= null){
                Nombres=Productos.get(K);
                Nombres.add(V);
                Productos.put(K, Nombres);
            }else{
                Nombres.add(V);
                Productos.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
         
    }

    public void Tree(){
        for (int i = 0; i < Datos.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Datos.get(i);
            String V=Datos.get(i+1);
            if (ProductosT.size()==0) {
                Nombres.add(V);
                ProductosT.put(K, Nombres);
            } else if(ProductosT.get(K)!= null){
                Nombres=ProductosT.get(K);
                Nombres.add(V);
                ProductosT.put(K, Nombres);                
            }else{
                Nombres.add(V);
                ProductosT.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
    }

    public void Linked(){
        for (int i = 0; i < Datos.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Datos.get(i);
            String V=Datos.get(i+1);
            if (ProductosL.size()==0) {
                Nombres.add(V);
                ProductosT.put(K, Nombres);
            } else if(ProductosT.get(K)!= null){
                Nombres=ProductosT.get(K);
                Nombres.add(V);
                ProductosT.put(K, Nombres);                
            }else{
                Nombres.add(V);
                ProductosT.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
    }

    public void datos(ArrayList data){
       for (int i = 0; i < data.size(); i++) {
           String value = data.get(i);
           String[] lista= value.split("-");
           Datos.add(lista[0]);
           Datos.add(lista[1]);
       } 
    }

    public void Nombre_de_producto(String n, int hash){
        switch (hash) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;    
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;    
        
            default:
                break;
        }
    }

    public void Datos_producto(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }

    public void Datos_producto_nombres(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }

    public void Everything(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }

    public void AddValor(String v1, String v2, int n){
        String message="Se ha agregado de manera exitosa";
        ArrayList<String> values=new ArrayList<>(); 
        switch (n) {
            case 1:
                if (Productos.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;
            case 2:
                if (ProductosT.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;
            case 3:
                if (ProductosL.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;    
            default:
                break;
        }
    }

    public HashMap<String, ArrayList> getProductos() {
        return Productos;
    }

    public void setProductos(HashMap<String, ArrayList> Productos) {
        this.Productos = Productos;
    }

    public LinkedHashMap <String, ArrayList> getProductosL() {
        return ProductosL;
    }

    public void setProductosL(LinkedHashMap <String, ArrayList> ProductosL) {
        this.ProductosL = ProductosL;
    }

    public TreeMap <String, ArrayList> getProductosT() {
        return ProductosT;
    }

    public void setProductosT(TreeMap <String, ArrayList> ProductosT) {
        this.ProductosT = ProductosT;
    }

    public ArrayList <String> getDatos() {
        return Datos;
    }

    public void setDatos(ArrayList <String> Datos) {
        this.Datos = Datos;
    }

    
}
