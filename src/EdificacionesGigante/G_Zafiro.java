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
import Verdugo.Verdugo;

/**
 *
 * @author Daniela Chavez
 */
public class G_Zafiro implements Gigante{
    
    public int vida = 500;
    int daño;
    public int costo = 1500;
    int cantidad=100;
    public Jugador jugador;
    boolean estado = false;

    public G_Zafiro() {
    }

    public G_Zafiro(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
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
        G_Zafiro x = new G_Zafiro(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
   @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory gigante = FactoryP.getFactory("Gigante");
        Gigante he = gigante.getGigante("Almacenamiento de Zafiros");
        G_Zafiro gz = new G_Zafiro(jugador);
        if(gz.getJugador().getC_mando().getRecurso2() >= costo 
           && gz.getJugador().getC_mando().getRecurso3() >= costo){
            total = gz.getJugador().getC_mando().getRecurso2()-costo;  
            gz.getJugador().getC_mando().setRecurso2(total);
            total1 = gz.getJugador().getC_mando().getRecurso3()-costo;
            gz.getJugador().getC_mando().setRecurso3(total1);
            System.out.println("Construccion realizada");
            gz.getJugador().getEdi_1().add(he);
        }else{
            System.out.println("No tiene suficientes recursos ");
        }
    }

    @Override
    public int getAtacar(){
        return daño;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        boolean estado = false;
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
