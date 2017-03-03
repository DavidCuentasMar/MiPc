package modelo;

import java.util.ArrayList;

public class Bodega {
    ArrayList<Equipo>equipos;
    ArrayList<Desktop>desktops;
    ArrayList<Laptop>laptops;
    int id;
    
    public Bodega(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }
    
    public void agregarDesktop(Desktop d){
        desktops.add(d);
        equipos.add(d);
    }
    
    
}
