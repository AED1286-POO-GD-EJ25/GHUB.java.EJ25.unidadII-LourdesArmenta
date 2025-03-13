package paquete2;

public class Monitor {
    //Atributos
    private String marca;
    private int tamanio;

    //constructor lleno
    public Monitor(String marca, int tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //
    public String obtenerDetalles(){
        return "Monitor marca: "+this.marca+" Tamaño: "+this.tamanio+" pulgadas";
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public int getTamanio() {
        return tamanio;
    }
    

    

    

}
