package biblioteca;
public class Bibliotecario extends Persona{
    //Atributo
    private int numEmpleado;

    //constructores
    public Bibliotecario(){
    
    }

    public Bibliotecario(int idPersona, String nombre, String telefono,int numEmpleado){
        super(idPersona, nombre,telefono);
        this.numEmpleado = numEmpleado;

    }

    //Métodos personalizados
    public void registrarPrestamo(Usuario usuario, Ejemplar ejemplar){

    }

    public void registrarDevolucion(Prestamo prestamo){

    }

    public Libro buscarLibro(String libro){
       return null;

    }

    public void agregarLibro(Libro libro){

    }

    public void generarReporteLibros(){

    }

    //Propiedades
    public int getNumEmpleado(){
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }
        
        
}