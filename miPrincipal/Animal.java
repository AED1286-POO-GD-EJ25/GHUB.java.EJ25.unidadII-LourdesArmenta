package miPrincipal;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;


    //constructores
    public Animal() {

    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    };

    //metodo personalizado
    public void saludar(){
        System.out.println("Soy un animal de nombre: "+nombre+" y estoy saludando");
    }

    public void saludar(String texto){
        System.out.println("Este es mi saludo: "+texto);

    }

   

    //

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    
    
}
