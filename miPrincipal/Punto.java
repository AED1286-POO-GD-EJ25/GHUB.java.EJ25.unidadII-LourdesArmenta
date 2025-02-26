package miPrincipal;
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
    public double calcularDistancia(Punto punto){
        return 0;
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
