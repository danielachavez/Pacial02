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
public class G_Hechizos implements Gigante{
    
    
    public int daño = 75;
    public int costo = 1000;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public G_Hechizos() {
    }

    public G_Hechizos(Jugador jugador) {
        this.jugador = jugador;
    }

    

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
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
        G_Hechizos x = new G_Hechizos(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
    @Override
    public int getAtacar(){
       return daño;
    }
    
    
    @Override
    public boolean estado(){
        return estado;
    }

    @Override
    public boolean entrenar(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generar(Jugador jugador) {
       int total, total1;
        G_Hechizos gh = new G_Hechizos(jugador);
        if(gh.getJugador().getC_mando().getRecurso1() >= costo 
           && gh.getJugador().getC_mando().getRecurso2() >= costo && estado==false){
            total = gh.getJugador().getC_mando().getRecurso1()-costo;  
            gh.getJugador().getC_mando().setRecurso1(total);
            total1 = gh.getJugador().getC_mando().getRecurso2()-costo;
            gh.getJugador().getC_mando().setRecurso2(total1);
            setEstado(true);
            System.out.println("Se entreno Koopa Troopas");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
    }

  
    
   
}
