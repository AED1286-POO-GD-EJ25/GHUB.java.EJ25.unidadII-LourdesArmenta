package paquete2;

public class Computadora {
    //Atributos
    private String marca;
    private String modelo;
    private Monitor monitor;

    //constructores
    public Computadora() {

    }
    
    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }

    //Método personalizado
    public String obtenerDetalles(){
        return "Computadora marca: "+this.marca+" Modelo:"+this.modelo+"\n"+
                "Monitor marca: "+this.monitor.getMarca()+" Tamaño: "+this.monitor.getTamanio()+" pulgadas";
                
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

    //setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    
    


}
