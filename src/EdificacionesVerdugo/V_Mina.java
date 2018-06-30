/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesVerdugo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Verdugo.Verdugo;
import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public class V_Mina implements Verdugo {
     boolean estado=false;
    int daño,
        cantidad=1000;
    public int vida = 350;
    public int costo = 1500;
    public Jugador jugador;

    public V_Mina() {
    }

    public V_Mina(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int damage) {
        this.daño = damage;
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
        AbstractFactory verdugo = FactoryP.getFactory("Verdugo");
        Verdugo mi = verdugo.getVerdugo("Mina");
        V_Mina vm = new V_Mina(jugador);
        if(vm.getJugador().getC_mando().getRecurso1() >= costo 
           && vm.getJugador().getC_mando().getRecurso2() >= costo){
            total = vm.getJugador().getC_mando().getRecurso1()-costo;  
            vm.getJugador().getC_mando().setRecurso1(total);
            total1 = vm.getJugador().getC_mando().getRecurso2()-costo;
            vm.getJugador().getC_mando().setRecurso2(total1);
            System.out.println("Construccion realizada");
            vm.getJugador().getEdi_3().add(mi);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
    
    @Override
    public int recoger(Jugador jugador){
        int num;
        V_Mina a = new V_Mina(jugador);
        num = a.getCantidad();
        a.getJugador().getC_mando3().setRecurso2(a.getJugador().getC_mando3().getRecurso2()+num);
        return num;
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

