package modelo;

import java.util.ArrayList;

public class MiPc {
    ArrayList<Bodega>bodegas;
    ArrayList<Equipo>equipos;
    ArrayList<Desktop>desktops;
    ArrayList<Laptop>laptops;

    public MiPc(){
        bodegas = new ArrayList<>();
        equipos = new ArrayList<>();
        desktops = new ArrayList<>();
        
        bodegas.add(new Bodega(1));
        bodegas.add(new Bodega(2));
        bodegas.add(new Bodega(3));                
    }
    public void agregarDesktop(Desktop d, Bodega b){
        desktops.add(d);
        equipos.add(d);
        b.agregarDesktop(d);    
    }
    
    public Bodega findBodega(int idBodega) {
        for (Bodega b : bodegas){
            if (b.getId() == idBodega){
                return b;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
    }
    
}
