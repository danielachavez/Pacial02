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
public class G_Monedas implements Gigante{
    
    public int vida = 500;
    int daño;
    public int costo = 1000;
    int cantidad=1000;
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
        G_Monedas a = new G_Monedas(jugador);
        num = a.getCantidad();
        a.getJugador().getC_mando().setRecurso2(a.getJugador().getC_mando().getRecurso2()+num);
        return num;
        
    }
    
   
    
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory gigante = FactoryP.getFactory("Gigante");
        Gigante mo = gigante.getGigante("Almacenamiento de Monedas");
        G_Monedas gm = new G_Monedas(jugador);
        if(gm.getJugador().getC_mando().getRecurso1() >= costo 
           && gm.getJugador().getC_mando().getRecurso2() >= costo){
            total = gm.getJugador().getC_mando().getRecurso1()-costo;  
            gm.getJugador().getC_mando().setRecurso1(total);
            total1 = gm.getJugador().getC_mando().getRecurso2()-costo;
            gm.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            gm.getJugador().getEdi_1().add(mo);
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
        
    }  
}

    
  
