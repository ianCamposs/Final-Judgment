/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ian
 */
public class config {
    
    private int tamanhotelaVertical;
    private int tamanhotelaHorizontal;
    private int luminosidadetela;
    private int volumemusica;
    private int volumeefeitosonoro;
    private int volumeambiente;
    private int FPS;
    
    public static config instancia;
    
    protected config(){
    }
    
    public static config getInstancia(){
        if(instancia==null)
            instancia = new config();
        return instancia;
    }
    
    
}
