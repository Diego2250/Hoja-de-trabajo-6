import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class generics<T> {
    T obj; 

    generics(T o){
        obj=o;
    }

    T getOb(){
        return obj; 
    }

    public void tipo(){
        System.out.println("Tipo T: "+obj.getClass().getName());
    }
}
