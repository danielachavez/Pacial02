/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosGigante;

import Gigante.Gigante;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class G_Camion implements  Gigante {
    
    public int vida=150;
    public int daño = 150;
    public int costo = 2000;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public  G_Camion() {
    }

    public  G_Camion(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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
        return cantidad;
    }
    
    @Override
    public int getAtacar(){
        return vida;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        G_Camion gc = new G_Camion(jugador);
        if(gc.getJugador().getC_mando().getRecurso1() >= costo 
           && gc.getJugador().getC_mando().getRecurso3() >= costo && estado==false){
            total = gc.getJugador().getC_mando().getRecurso1()-costo;  
            gc.getJugador().getC_mando().setRecurso1(total);
            total1 = gc.getJugador().getC_mando().getRecurso3()-costo;
            gc.getJugador().getC_mando().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno Bayonetta");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }

    
    
}
