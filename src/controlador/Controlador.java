package controlador;

import modelo.Desktop;
import modelo.MiPc;

public class Controlador {
    private MiPc miPc;
    
    public Controlador(MiPc miPc){
        this.miPc = miPc;
    }
    
    public void AgregarDesktop(int Bodega, String Serial, String Marca, String Modelo){        
        Desktop d = new Desktop(Serial, Marca, Modelo, miPc.findBodega(Bodega));
        miPc.agregarDesktop(d, miPc.findBodega(Bodega));        
    }
    
}
