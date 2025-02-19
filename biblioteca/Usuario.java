package biblioteca;
public class Usuario extends Persona{
    //Atributos
    private int numSocio;

    //constrores
    public Usuario(){

    }

    public Usuario(int idPersona, String nombre, String telefono, int numSocio){
        super(idPersona, nombre, telefono);
        this.numSocio = numSocio;

    }

    //métodos personalizados
    public void consultarPrestamos(){

    }
    public void reservar(Libro libro){

    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    

}