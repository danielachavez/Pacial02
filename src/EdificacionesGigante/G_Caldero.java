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
public class G_Caldero implements Gigante{
    
    int daño,
        cantidad=1000;
    int vida = 500;
    int costo = 1500;
    public Jugador jugador;
    
    public G_Caldero(){
        
    }

    public G_Caldero(Jugador jugador) {
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
        Gigante g1 = gigante.getGigante("Caldero de hechizo");
        G_Caldero gc = new G_Caldero(jugador);
         if(gc.getJugador().getC_mando().getRecurso1() >= costo 
           && gc.getJugador().getC_mando().getRecurso3() >= costo){
            total = gc.getJugador().getC_mando().getRecurso1()-costo;  
            gc.getJugador().getC_mando().setRecurso1(total);
            total1 = gc.getJugador().getC_mando().getRecurso3()-costo;
            gc.getJugador().getC_mando().setRecurso3(total1);
            System.out.println("Construccion realizada");
            gc.getJugador().getEdi_1().add(g1);
        }else{
            System.out.println("No tiene suficientes recursos ");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
        int num;
        G_Caldero x = new G_Caldero(jugador);
        num = x.getCantidad();
        x.getJugador().getC_mando().setRecurso2(x.getJugador().getC_mando().getRecurso2()+num);
        return num;
    }
    
    @Override
    public int getAtacar(){
        int total;
        G_Caldero gc = new G_Caldero();
        System.out.println("antes: "+getVida());
        total = getVida()-gc.getDaño();
        setVida(total);
        System.out.println("despues: "+getVida());
        return total;
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
