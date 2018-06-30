/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesLanzarroca;

import Lanzarroca.Lanzarroca;
import EdificacionesVerdugo.V_Acido;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class L_Elixir implements Lanzarroca{
    

    public int costo = 1000;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public L_Elixir() {
    }

    public L_Elixir(Jugador jugador) {
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
    public int recoger(Jugador jugador){
        int num;
        L_Elixir x = new L_Elixir(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }

   
    
    @Override
    public void generar(Jugador jugador){
        int total, total1;
        V_Acido va = new V_Acido(jugador);
        if(va.getJugador().getC_mando().getRecurso1() >= costo 
           && va.getJugador().getC_mando().getRecurso3() >= costo && estado==false){
            total = va.getJugador().getC_mando2().getRecurso1()-costo;  
            va.getJugador().getC_mando().setRecurso1(total);
            total1 = va.getJugador().getC_mando().getRecurso3()-costo;
            va.getJugador().getC_mando().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entrenaron Old Hunters");
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
    public void construir(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
