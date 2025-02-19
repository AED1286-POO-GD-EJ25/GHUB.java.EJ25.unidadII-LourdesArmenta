package biblioteca;
public class Invitado extends Persona{
    //Atributos
    private String institucion;

    //constructores
    public Invitado(){

    }

    public Invitado(int idPersona, String nombre, String telefono, String institucion){
        super(idPersona, nombre, telefono);
        this.institucion = institucion;
    }

    //Métodos personalizado
    public boolean consultarDisponibilidad(Libro libro){
        return true;
    }

    public void solicitarPrestamoTemporal(Libro libro){

    }

    //getter y setter

    public String getInstitucion(){
        return this.institucion;
    }

    public void setInstitucion(String institucion){
        this.institucion = institucion;

    }


}