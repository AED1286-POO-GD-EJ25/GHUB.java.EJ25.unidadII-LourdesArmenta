package miPrincipal;

public class Perro extends Animal{
    //Atributo
    private String raza;

    //vacio
    public Perro(){

    }

    //lleno
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    //getter y setter

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
