package miPrincipal;

public class Principal {
   

    public static void main(String[] args) {
        //Crear objetos persona

        Persona p1 = new Persona();
        //p1.nombre="Juan";
        p1.setNombre("Juan");
        p1.setEdad(19);
        p1.setDni("123");

        System.out.println("Nombre de p1 ="+p1.getNombre());
        System.out.println("Edad de p1 = "+p1.getEdad());
        System.out.println("DNI de p1:"+p1.getDni());
        Persona p2 = new Persona("Martin", 19,"12345");
        //p2.nombre="Martina";
        p2.setNombre("Martina");
        p2.setEdad(21);
        p2.setDni("5555");

        p1.saludar();

        p2.saludar();


        //Sobreescritura de Métodos

        Animal animal1 = new Animal();

        animal1.setNombre("Francisco");

        animal1.saludar();

        Perro perro1 = new Perro("Firulais", 4,"criollo");

        perro1.saludar();
        
        
    }
}