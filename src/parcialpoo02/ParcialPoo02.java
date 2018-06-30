/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo02;

import Player.Jugador;
import java.util.Scanner;


/**
 *
 * @author Daniela Chavez
 */


public class ParcialPoo02 {
    
    public static void main (String[] args) {
        Jugador a = new Jugador();
     
        System.out.println("Instruccciones del juego\n");
        System.out.println("Le Mostraremos las caracteristicas de cada raza");
        System.out.println("La raza de Gigante tiene la habilidad  de que el ataque de sus tropas es el doble");
        System.out.println("La raza Lanzarroca Poseen la milicia mas fuerte de todas, pero el costo de edificaciones y milicia es muy alto");
        System.out.println("L raza Verdugo Poseen los mejores vehiculos para atacar, pero sus edificaciones son debiles\n");
        System.out.println("Atencion\n");
        System.out.println("Por reglas del juego, el primer jugador debe agregar al segundo desde el menu en su primer turno\nasi como el jugador 2 debe pasar su primer turno para poder dar inicio a la batalla.");
        System.out.println("Si hace caso omiso a las indicaciones, se le infectara la maquina con Ransomware.");
        System.out.println("\nAcepta las indicaciones y llamadas de atencion?(Si/No)");
        Scanner auxi = new Scanner(System.in);
        String b = auxi.next();
        if(b.equalsIgnoreCase("Si")){
            try {  
            Thread.sleep(1000);                
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        } 
        a.addJugador();
        a.addJugador2();
        }else{
            System.exit(0);
        }
        
    }
}
