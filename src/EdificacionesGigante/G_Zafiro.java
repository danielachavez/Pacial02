/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesGigante;

import Gigante.Gigante;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class G_Zafiro implements Gigante{
    public int costo = 2000;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public G_Zafiro() {
    }

    public G_Zafiro(Jugador jugador) {
        this.jugador = jugador;
    }

    

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public void construir(Jugador jugador){
        //return cantidad;
    }
    
    @Override
    public int recoger(Jugador jugador){
        int num;
        G_Zafiro x = new G_Zafiro(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
   
    
    @Override
    public void generar(Jugador jugador){
        int total, total1;
        G_Zafiro gz = new G_Zafiro(jugador);
        if(gz.getJugador().getC_mando().getRecurso1() >= costo 
           && gz.getJugador().getC_mando().getRecurso3() >= costo && estado==false){
            total = gz.getJugador().getC_mando().getRecurso1()-costo;  
            gz.getJugador().getC_mando().setRecurso1(total);
            total1 = gz.getJugador().getC_mando().getRecurso3()-costo;
            gz.getJugador().getC_mando().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno Bayonetta");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
  
    @Override
    public int getAtacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean entrenar(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
