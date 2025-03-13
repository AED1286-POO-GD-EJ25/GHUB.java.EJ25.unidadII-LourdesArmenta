package miPrincipal;

import java.util.Scanner;

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
                    break;
                case 4:
                    //seleccione Forma
                    break;
                5:
                    //seleccione Punto
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
    
}
