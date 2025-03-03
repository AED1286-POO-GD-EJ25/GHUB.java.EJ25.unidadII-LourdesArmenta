package paquete1;

public class Automovil {
    //Atributos
    private String marca;
    private String modelo;
    private Motor motor;

    //Constructores
    
    public Automovil(String marca, String modelo, String tipoMotor, int potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor, potenciaMotor);
    }
    

    public Automovil() {
        //terminar codigo
    }


    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }


    //getter y setter
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    

    

}
