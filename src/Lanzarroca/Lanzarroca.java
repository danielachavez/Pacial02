/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanzarroca;

import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public interface Lanzarroca {
    void construir(Jugador jugador);
    int recoger(Jugador jugador);
    int getAtacar();
    boolean entrenar(Jugador jugador);
    void generar(Jugador jugador);
    boolean estado();
    
}
