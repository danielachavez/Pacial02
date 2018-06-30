/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import CentroDeMando.CentroDeMando;
import CentroDeMando.CentroDeMando2;
import CentroDeMando.CentroDeMando3;
import Gigante.Gigante;
import Lanzarroca.Lanzarroca;
import Verdugo.Verdugo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniela Chavez
 */
public class Jugador {
    
    public String nombre;
    public CentroDeMando c_mando;
    public CentroDeMando2 c_mando2;
    public CentroDeMando3 c_mando3;
    //edificaciones
    public ArrayList<Gigante> edi_1;
    public ArrayList<Lanzarroca> edi_2;
    public ArrayList<Verdugo> edi_3;
    //vehiculos
    public ArrayList<Gigante> trans_1;
    public ArrayList<Lanzarroca> trans_2;
    public ArrayList<Verdugo> trans_3;
    //milicia
    public ArrayList<Gigante> def_1;
    public ArrayList<Lanzarroca> def_2;
    public ArrayList<Verdugo> def_3;
    
    public Jugador jugador;

    public Jugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador() {
    }

    public Jugador(String nombre, CentroDeMando c_mando) {
        this.nombre = nombre;
        this.c_mando= c_mando;
    }

    public Jugador(String nombre, CentroDeMando c_mando, CentroDeMando2 c_mando2, CentroDeMando3 c_mando3, ArrayList<Gigante> edi_1, ArrayList<Lanzarroca> edi_2, ArrayList<Verdugo> edi_3, ArrayList<Gigante> trans_1, ArrayList<Lanzarroca> trans_2, ArrayList<Verdugo> trans_3) {
        this.nombre = nombre;
        this.c_mando = c_mando;
        this.c_mando2 = c_mando2;
        this.c_mando3 = c_mando3;
        this.edi_1 = edi_1;
        this.edi_2 = edi_2;
        this.edi_3 = edi_3;
        this.trans_1 = trans_1;
        this.trans_2 = trans_2;
        this.trans_3 = trans_3;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroDeMando getC_mando() {
        return c_mando;
    }
    
      public void setC_mando(CentroDeMando c_mando) {
        this.c_mando = c_mando;
    }
      
    public CentroDeMando2 getC_mando2() {
        return c_mando2;
    }

    public void setC_mando2(CentroDeMando2 c_mando2) {
        this.c_mando2 = c_mando2;
    }

    public CentroDeMando3 getC_mando3() {
        return c_mando3;
    }

    public void setC_mando3(CentroDeMando3 c_mando3) {
        this.c_mando3 = c_mando3;
    }

  

    public ArrayList<Gigante> getEdi_1() {
        return edi_1;
    }

    public void setEdi_1(ArrayList<Gigante> edi_1) {
        this.edi_1 = edi_1;
    }

    public ArrayList<Lanzarroca> getEdi_2() {
        return edi_2;
    }

    public void setEdi_2(ArrayList<Lanzarroca> edi_2) {
        this.edi_2 = edi_2;
    }

    public ArrayList<Verdugo> getEdi_3() {
        return edi_3;
    }

    public void setEdi_3(ArrayList<Verdugo> edi_3) {
        this.edi_3 = edi_3;
    }

    public ArrayList<Gigante> getTrans_1() {
        return trans_1;
    }

    public void setTrans_1(ArrayList<Gigante> trans_1) {
        this.trans_1 = trans_1;
    }

    public ArrayList<Lanzarroca> getTrans_2() {
        return trans_2;
    }

    public void setTrans_2(ArrayList<Lanzarroca> trans_2) {
        this.trans_2 = trans_2;
    }

    public ArrayList<Verdugo> getTrans_3() {
        return trans_3;
    }

    public void setTrans_3(ArrayList<Verdugo> trans_3) {
        this.trans_3 = trans_3;
    }

    
    
    public void addJugador(){
        CentroDeMando cm1 = new CentroDeMando();
        CentroDeMando2 cm2 = new CentroDeMando2();
        CentroDeMando3 cm3 = new CentroDeMando3();
        ArrayList<Gigante> edi_1 = new ArrayList();
        ArrayList<Lanzarroca> edi_2 = new ArrayList();
        ArrayList<Verdugo> edi_3 = new ArrayList();
        ArrayList<Gigante> trans_1 = new ArrayList();
        ArrayList<Lanzarroca> trans_2 = new ArrayList();
        ArrayList<Verdugo> trans_3 = new ArrayList();
        Scanner auxi = new Scanner(System.in);
        System.out.println("\nEmpieza el jugador 1");
        System.out.println("Jugador 1, digite su nombre: ");
        String jugador1 = auxi.nextLine();
        Jugador a1 = new Jugador(jugador1, cm1, cm2, cm3, edi_1, edi_2, edi_3, trans_1, trans_2, trans_3);
        ArrayList<Jugador> jug1 = new ArrayList();
        jug1.add(a1);
        System.out.println("Jugador 1: "+a1.getNombre());
        Menu m1 = new Menu(a1);
        m1.MenuRaza(a1);
    }
    
    public void addJugador2(){
        CentroDeMando cm1 = new CentroDeMando();
        CentroDeMando2 cm2 = new CentroDeMando2();
        CentroDeMando3 cm3 = new CentroDeMando3();
        ArrayList<Gigante> edi_1 = new ArrayList();
        ArrayList<Lanzarroca> edi_2 = new ArrayList();
        ArrayList<Verdugo> edi_3 = new ArrayList();
        ArrayList<Gigante> trans_1 = new ArrayList();
        ArrayList<Lanzarroca> trans_2 = new ArrayList();
        ArrayList<Verdugo> trans_3 = new ArrayList();
        Scanner auxi = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String jugador2 = auxi.nextLine();
        Jugador a2 = new Jugador(jugador2, cm1, cm2, cm3, edi_1, edi_2, edi_3, trans_1, trans_2, trans_3);
        ArrayList<Jugador> jug2 = new ArrayList();
        jug2.add(a2);
        System.out.println("Jugador 2: "+a2.getNombre());
        Menu m = new Menu(a2);
        m.MenuRaza(a2);

    }


    
}


