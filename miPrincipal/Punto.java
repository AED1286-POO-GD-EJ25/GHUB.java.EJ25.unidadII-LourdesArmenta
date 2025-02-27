package miPrincipal;
import java.util.Scanner;

public class Punto {
    //atributos
    private int x;
    private int y;
    //constructores

    public Punto() {
        this.x=0;
        this.y=0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodo personalizado
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Proporciona el valor de x:");
        this.x = entrada.nextInt();
        System.out.print("Proporciona el valor de y:");
        this.y = entrada.nextInt();

    }

    public void desplegar(){
        //System.out.println("Valor de x="+this.x+" Valor de y="+this.y);
        //System.out.println("Valor de x="+x+" Valor de y="+y);
        System.out.println("Valor de x="+getX()+" Valor de y="+getY());

    }


    public double calcularDistancia(Punto p){
        double resultado;
        resultado = Math.sqrt( Math.pow((p.getX()-this.x),2) + 
                    Math.pow((p.getY()-this.y),2));
        return resultado;

    }

    //getter y setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    
}
