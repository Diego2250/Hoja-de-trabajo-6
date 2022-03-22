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

    public String Nombre_de_producto(String n, int hash){
        String message=""; 
        switch (hash) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            message="Categoria "+m.getKey()+" : producto"+productos; 
                        }
                    }
                }
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosT.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            message="Categoria "+m.getKey()+" : producto"+productos; 
                        }
                    }
                }
                break;    
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosL.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(nombre)){
                            message="Categoria "+m.getKey()+" : producto"+productos; 
                        }
                    }
                }
                break;    
        
            default:
                break;
        }
    }

}
