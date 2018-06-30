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
public class G_Monedas implements Gigante{
    
    public int costo = 2000;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public G_Monedas() {
    }

    public G_Monedas(Jugador jugador) {
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
        G_Monedas a = new G_Monedas(jugador);
        num = a.getCantidad();
        a.getJugador().getC_mando().setRecurso2(a.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
   
    
    @Override
    public void generar(Jugador jugador){
        int total, total1;
        G_Monedas gm = new G_Monedas(jugador);
        if(gm.getJugador().getC_mando().getRecurso1() >= costo 
           && gm.getJugador().getC_mando().getRecurso3() >= costo && estado==false){
            total = gm.getJugador().getC_mando().getRecurso1()-costo;  
            gm.getJugador().getC_mando().setRecurso1(total);
            total1 = gm.getJugador().getC_mando().getRecurso3()-costo;
            gm.getJugador().getC_mando().setRecurso3(total1);
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
