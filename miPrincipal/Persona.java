package miPrincipal;
public class Persona{
     private String nombre;
     private int edad;
     private String dni;

    
    //Constructores
    //Vacio
    public Persona(){
        
    }

    //lleno
    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    //Métodos personalizado
    public void saludar(){
        System.out.println("Hola, soy una Persona de nombre "+this.nombre);
    }

    //Propiedades

    //Lee el atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    //asigne un valor al atributo nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Lee el atributo edad
    public int getEdad(){
        return this.edad;
    }
    //asigna un valor al atributo edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //lee el atributo dni
    public String getDni(){
        return this.dni;
    }
    //asigna el valor al atributo dni
    public void setDni(String dni){
        this.dni = dni;
    }


}