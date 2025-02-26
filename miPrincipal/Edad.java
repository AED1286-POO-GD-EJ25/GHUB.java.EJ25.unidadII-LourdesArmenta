package miPrincipal;

public class Edad {
    private int edadHijo, edadPadre,edadMadre;

    //Constructores
    public Edad() {

    }

    public Edad(int edadHijo, int edadPadre, int edadMadre) {
        this.edadHijo = edadHijo;
        this.edadPadre = edadPadre;
        this.edadMadre = edadMadre;
    }

    //Metodo Personalizado

    public int calcularDifPadreHijo(){
        return this.edadPadre-this.edadHijo;
        
    }

    public int calcularDifMadreHijo(){
        return this.edadMadre-this.edadHijo;

    }

    public int calcularDifPadreMadre(){
        if(this.edadPadre>this.edadMadre)
           return this.edadPadre-this.edadMadre;
        else
            return this.edadMadre-this.edadPadre;

    }

    //Getter y setter
    public int getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(int edadHijo) {
        this.edadHijo = edadHijo;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }

    public int getEdadMadre() {
        return edadMadre;
    }

    public void setEdadMadre(int edadMadre) {
        this.edadMadre = edadMadre;
    }

    
    
    
}
