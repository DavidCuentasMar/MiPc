package modelo;
public class Equipo {
    String serial;
    String marca;
    String modelo;
    Bodega bodega;

    public Equipo(String serial, String marca, String modelo, Bodega bodega) {
        this.serial = serial;
        this.marca = marca;
        this.modelo = modelo;
        this.bodega = bodega;
    }

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    
}
