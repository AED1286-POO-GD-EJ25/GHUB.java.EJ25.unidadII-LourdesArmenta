package biblioteca;
public class Libro{
    private int idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private  boolean disponible;

    //constructors

    public Libro() {

    }

    public Libro(int idLibro, String titulo, String autor, String isbn, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    //Métodos personalizados
    public String obtenerInformacionLibro(){
        return null;

    }

    public void agregarEjemmplar(Ejemplar ejemplar){

    }

    public void quitarEjemplar(Ejemplar ejemplar ){
        
    }

    //getter y setter
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

   

    

   
    

}