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
public class G_Hechizos implements Gigante{
    
    public int vida = 500;
    public int daño;
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
        G_Hechizos x = new G_Hechizos(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory gigante = FactoryP.getFactory("Gigante");
        Gigante he = gigante.getGigante("Almacenamiento de hechizos");
        G_Hechizos gh = new G_Hechizos(jugador);
        if(gh.getJugador().getC_mando().getRecurso1() >= costo 
           && gh.getJugador().getC_mando().getRecurso3() >= costo){
            total = gh.getJugador().getC_mando().getRecurso1()-costo;  
            gh.getJugador().getC_mando().setRecurso1(total);
            total1 = gh.getJugador().getC_mando().getRecurso3()-costo;
            gh.getJugador().getC_mando().setRecurso3(total1);
            System.out.println("Construccion realizada");
            gh.getJugador().getEdi_1().add(he);
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
        return estado;
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
        G_Hechizos m = new G_Hechizos(jugador);
        m.getJugador().getC_mando().setRecurso3(m.getJugador().getC_mando().getRecurso3()+1500);
    }  
}

    
  
