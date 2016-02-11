package boletin20;

import javax.swing.JOptionPane;

public class Boletin20 {

    public static void main(String[] args) {
        
        Libreria libros=new Libreria();
       
        int res;
        
           libros.cargarArray();
        do {
            
            res=Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones :\n 1. Mostrar libro a partir del ISBN \n 2. Añadir un nuevo libro \n 3. Vender libro introduciendo el ISBN\n 4. Dar de baja los libros que tengan 0 unidades\n 5. Mostrar todos los libros \n 6. Salir del programa"));
        switch(res){
            case 1 :
                libros.amosaX(JOptionPane.showInputDialog("Introduce el ISBN"));
                break;
            case 2 :
                String titulo=JOptionPane.showInputDialog("Introduce el titulo del nuevo libro");
                String autor=JOptionPane.showInputDialog("Introduce el autor del nuevo libro");
                String ISBN=JOptionPane.showInputDialog("Introduce el ISBN del nuevo libro");
                double prezo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del nuevo libro"));
                int unidades=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades disponibles del nuevo libro"));
                libros.engadir(new Libro(titulo,autor,ISBN,prezo, unidades ));
                break;
            case 3:
                libros.venderLibro(JOptionPane.showInputDialog("Introduce el ISBN"));
                break;
            case 4:
                libros.darBaixa();
                break;
            case 5:
                System.out.println(libros.amosar());
                break;
            case 6:
                System.out.println("Saliendo del programa");
                break;
            
        }
        }
        while (res!=6);
            System.exit(0);
    
        
      
            
           }
     
        
        
    }
    

