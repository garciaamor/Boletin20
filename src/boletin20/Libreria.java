package boletin20;

import java.util.ArrayList;

public class Libreria {
    ArrayList <Libro> lib=new ArrayList();
    String propietario;
    
    public void cargarArray(){
        Libro lib1=new Libro("Primer","AA","12",3.5,3);
        Libro lib2=new Libro("Segundo","BB","23",5,7);
        Libro lib3=new Libro("Tercer","CC","34",7.5,3);
        Libro lib4=new Libro("Cuarto","DD","45",5.75,2);
        lib.add(lib1);
        lib.add(lib2);
        lib.add(lib3);
        lib.add(lib4);
        
    }
    public void engadir(Libro k){
        lib.add(k);
    }
    public void venderLibro(String ISBN){
        lib.remove(ISBN);
    }
    public void amosaX(String ISBN){
        for (int i=0;i<lib.size();i++){
            lib.get(i).toString();
                }
        
    }
    public void amosar(){
        
    }
    public void darBaixa(){
        
    }
    
    
}
