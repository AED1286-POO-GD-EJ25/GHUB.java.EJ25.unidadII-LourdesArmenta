package miPrincipal;
public class Forma{

    public double calcularArea(double radio){  
           return Math.PI*Math.pow(radio, 2);
    }

    public double calcularArea(double base, double altura){
        return base*altura/2;
    }

    public float calcularArea(float lado){
        return lado*lado;
    }
   
}