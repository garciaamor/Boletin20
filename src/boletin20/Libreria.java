package boletin20;

import java.util.ArrayList;
import java.util.Collections;

public class Libreria {
    ArrayList <Libro> lib=new ArrayList();
    String propietario;
    
    public void cargarArray(){
        Libro lib1=new Libro("Primer","AA","12",3.5,3);
        Libro lib2=new Libro("Segundo","BB","23",5,7);
        Libro lib3=new Libro("Tercer","CC","34",7.5,3);
        Libro lib4=new Libro("Cuarto","DD","45",5.75,1);
        lib.add(lib1);
        lib.add(lib2);
        lib.add(lib3);
        lib.add(lib4);
        
    }
    public void engadir(Libro k){
        lib.add(k);
    }
    public void venderLibro(String ISB){
        for (int i=0;i<lib.size();i++){
        if (lib.get(i).ISBN.equals(ISB))
            lib.get(i).unidades--;
    }
    }
    public void amosaX(String ISB){
        
        for (int i=0;i<lib.size();i++){
           if (lib.get(i).ISBN.equals(ISB)){
               System.out.println(lib.get(i).toString());
               
           }
                }
        
    }
    public String amosar(){
        Collections.sort(lib);
        String cadea="";
        for(Libro lib:lib){
            cadea+="\n"+lib.toString();
        }
        return cadea;
    }
    public void darBaixa(){
        
        for (int i=0;i<lib.size();i++){
            if(lib.get(i).unidades==0)
                lib.remove(i);
        }
        
    }
    
    
}
