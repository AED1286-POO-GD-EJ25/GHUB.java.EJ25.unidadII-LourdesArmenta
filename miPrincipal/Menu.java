package miPrincipal;

import java.util.Scanner;

import paquete1.Automovil;
import paquete1.Motor;
import paquete2.Computadora;
import paquete2.Monitor;


public class Menu {
   

    //constructor
    public Menu(){

    }

    //metodos personalizados
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
        
                case 1:
                    //seleccione Persona
                    break;
                case 2:
                    //seleccione Animal
                    break;
                case 3:
                    //seleccione calculadora
                    Calculadora calculadora = new Calculadora();

                    System.out.println("La suma = "+calculadora.sumar(5,10));
                    System.out.println("La suma = "+calculadora.sumar(5,10.5));
                    System.out.println("La suma = "+calculadora.sumar(5.0,10.5));
            
                    float x=1,y=2,z=3;
                    float sumar = calculadora.sumar(x, y, z);
                    System.out.println("La suma = "+sumar);
            
                    System.out.println("La suma = "+calculadora.sumar(5.0f,10.0f,20.0f));
                    break;
                case 4:
                    //seleccione Forma
                    break;
                case 5:
                    //seleccione Punto
                     //Creacion de objetos
                    /*
                    * sintaxis:
                    * 
                    * 
                    *
                    */

                    Punto punto = new Punto();

                    Punto punto1; //creando una referencia al objeto punto
                    punto1 = new Punto(); //instancia el objeto constructor vacia

                    System.out.println("valor de x del punto1="+punto1.getX());
                    System.out.println("valor de y del punto1="+punto1.getY());

                    Punto punto2; //referencia a objeto
                    punto2 = new Punto(10,8); //invocando al constructor lleno

                    System.out.println("valor de x del punto2="+punto2.getX());
                    System.out.println("valor de y del punto2="+punto2.getY());

                    punto1.desplegar();
                    punto2.desplegar();

                    punto1.leer();
                    punto1.desplegar();

                    punto2.leer();
                    punto2.desplegar();

                    double d = punto1.calcularDistancia(punto2);

                    System.out.println("La distancia entre el punto1 y el punto2 = "+d);
                    break;
                case 6: 
                    //seleccione automovil
                    break;
               case  7:
                    //seleccione Computadora
                    break;
               case 0:
                    System.out.println("Saliendo...");
                    break;
                

                default:
                    System.out.println("Opción no válida");


            }
        } while (opcion !=0);

    }

    private void mostrarMenu(){
        System.out.println("\n--- Menu de opciones clases ---");
        System.out.println("1. Persona");
        System.out.println("2. Animal");
        System.out.println("3. Calculadora");
        System.out.println("4. Forma");
        System.out.println("5. Punto");
        System.out.println("6. Automovil");
        System.out.println("7. Computadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

    }

    private void agregarPersona(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporciona Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona Edad:");
        int edad = scanner.nextInt();
        System.out.println("Proporciona DNI:");
        String dni = scanner.next();

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

    }
    private void agregarAnimal(){
        //Sobreescritura de Métodos

        Animal animal1 = new Animal();

        animal1.setNombre("Francisco");

        animal1.saludar();

        Perro perro1 = new Perro("Firulais", 4,"criollo");

        perro1.saludar();
        
        Animal animal2 = new Animal();

        animal2.setNombre("LOurdes");

        animal2.saludar();
        animal2.saludar("Hola");

    }
    private void agregarAutomovil(){
         //crear objetos Autoovil

        Automovil auto = new Automovil("Honda","CRV",
                                       "turbo DOHCVTEC",190);

        System.out.println("El automovil marca: "+auto.getMarca()+", modelo:"+auto.getModelo()+
                           " tiene un motor de tipo: "+auto.getMotor().getTipo()+
                           " Potencia: "+auto.getMotor().getPotencia());

        Motor motor = new Motor("5.0",395);
        Automovil auto1 = new Automovil("Ford","Lobo",motor);

        System.out.println("El automovil marca: "+auto1.getMarca()+", modelo:"+auto1.getModelo()+
        " tiene un motor de tipo: "+auto1.getMotor().getTipo()+
        " Potencia: "+auto1.getMotor().getPotencia());

        Automovil auto2 = new Automovil();
        auto2.setMarca("suzuki");
        auto2.setModelo("swift");
        
        Motor motor2 = new Motor("SN",80);

        auto2.setMotor(motor2);

        System.out.println("Estoy revisando el error:");
        System.out.println("El automovil marca: "+auto2.getMarca()+", modelo:"+auto2.getModelo()+
        " tiene un motor de tipo: "+auto2.getMotor().getTipo()+
        " Potencia: "+auto2.getMotor().getPotencia());

    }
    private void agregarComputadora(){
        
        //Uso de la Relacion de Agregacion

        //Forma1
        Computadora compu1 = new Computadora("HP","MX25" , new Monitor("HP",16));

        System.out.println("Computadora 1 marca: "+compu1.getMarca()+" modelo: "+
                                                  compu1.getModelo()+"\n"+
                                                  "Marca monitor: "+compu1.getMonitor().getMarca()+
                                                  " Tammaño: "+compu1.getMonitor().getTamanio()+" pulgadas");
        //forma2
        Monitor monitor1 = new Monitor("Apple",16);
        Computadora compu2 = new Computadora("Apple","MacBook pro",monitor1);

        System.out.println("Computadora 2 marca: "+compu2.getMarca()+" modelo: "+
                                                    compu2.getModelo()+"\n"+
                                                    "Monitor marca: "+compu2.getMonitor().getMarca()+
                                                     " Tamaño: "+compu2.getMonitor().getTamanio()+" pulgadas");
        //forma3

        Computadora compu3 = new Computadora();

        compu3.setMarca("IBM");
        compu3.setModelo("S/M");
        compu3.setMonitor(monitor1);

        System.out.println(compu3.obtenerDetalles());

    }
    
}
