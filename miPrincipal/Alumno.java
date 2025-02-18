package miPrincipal;
public class Alumno extends Persona{
    //Atributos Alumno
    private String curso;
    private int notas[];

    //Métodos
    //Constructores
    //Vacio
    public Alumno(){
        
    }
   
    //lleno
    public  Alumno(String nombre, int edad, String dni, String curso){
        super(nombre,edad, dni); //invoca al constructor de la clase base
        this.curso = curso;
        this.notas = new int[5]; //inicializando el arreglo


    }
    //Métodos personalizados
    public void estudiar(){
        System.out.println("Soy un alumno y estoy estudianto");
    }

}