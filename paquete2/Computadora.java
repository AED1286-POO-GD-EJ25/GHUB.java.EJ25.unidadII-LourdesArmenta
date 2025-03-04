package paquete2;

public class Computadora {
    //Atributos
    private String marca;
    private String modelo;
    private Monitor monitor;

    //constructores
    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }

    //Getter
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    


}
