/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigante;

import Player.Jugador;

/**
 *
 * @author Daniela Chavez
 */
public interface Gigante {
    void construir(Jugador jugador);
    int recoger(Jugador jugador);
    int getAtacar();
    boolean entrenar(Jugador jugador);
    boolean estado();
    void generar(Jugador jugador);
    
}
