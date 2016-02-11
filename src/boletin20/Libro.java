package boletin20;

public class Libro implements Comparable<Libro>{
   
    String titulo;
    String autor;
    String ISBN;
    double prezo;
    int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, double prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }

    @Override
    public int compareTo(Libro o) {
        if(titulo.compareToIgnoreCase(o.titulo)<0){
            return -1;         
        }
    else if(titulo.compareToIgnoreCase(o.titulo)>0){
            return 1;
        }
    else{
            return 0;
    }
    
    
    }       
}
