/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosGigante;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Gigante.Gigante;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class G_Cuadrimoto implements Gigante {
    
    public int vida = 150;
    public int daño = 150;
    public int costo = 1500;
    int cantidad;
    public Jugador jugador;
    boolean estado = false;

    public G_Cuadrimoto() {
    }

    public G_Cuadrimoto(Jugador jugador) {
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
        int total, total1;
        AbstractFactory nintendo = FactoryP.getFactory("Gigante");
        Gigante cua = nintendo.getGigante("Cuadrimoto");
        G_Cuadrimoto gc = new G_Cuadrimoto(jugador);
        if(gc.getJugador().getC_mando().getRecurso1() >= costo 
           && gc.getJugador().getC_mando().getRecurso2() >= costo){
            total = gc.getJugador().getC_mando().getRecurso1()-costo;  
            gc.getJugador().getC_mando().setRecurso1(total);
            total1 = gc.getJugador().getC_mando().getRecurso2()-costo;
            gc.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            gc.getJugador().getTrans_1().add(cua);
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
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }

   
    
}
