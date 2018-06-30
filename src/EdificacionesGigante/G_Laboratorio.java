/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesGigante;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Gigante.Gigante;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class G_Laboratorio implements Gigante{
    
    
    int daño,
         cantidad;
    public int vida = 500;
    public int costo = 1000;
    
    public Jugador jugador;

    public G_Laboratorio() {
    }

    public G_Laboratorio(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
   
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory gigante = FactoryP.getFactory("Gigante");
        Gigante lab = gigante.getGigante("Laboratorio");
        G_Laboratorio gl = new G_Laboratorio(jugador);
        if(gl.getJugador().getC_mando().getRecurso1() >= costo 
           && gl.getJugador().getC_mando().getRecurso2() >= costo){
            total = gl.getJugador().getC_mando().getRecurso1()-costo;  
            gl.getJugador().getC_mando().setRecurso2(total);
            total1 = gl.getJugador().getC_mando().getRecurso2()-costo;
            gl.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            gl.getJugador().getEdi_1().add(lab);
        }else{
            System.out.println("No tiene suficientes recursos ");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
        return cantidad;
    }
    
    @Override
    public int getAtacar(){
        return daño;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        boolean estado =false;
        return estado;
    }
    
    @Override
    public boolean estado(){
        boolean estado = false;
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
}
