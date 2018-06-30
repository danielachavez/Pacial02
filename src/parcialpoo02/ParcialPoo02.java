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
     
        System.out.println("Instruccciones del juego");
        System.out.println("Caracteristicas de cada raza");
        System.out.println("*La raza de Gigante tiene la habilidad  de que el ataque de sus tropas es el doble");
        System.out.println("*La raza Lanzarroca Poseen la milicia mas fuerte de todas, pero el costo de edificaciones y milicia es muy alto");
        System.out.println("*La raza Verdugo Poseen los mejores vehiculos para atacar, pero sus edificaciones son debiles");
        System.out.println("Atencion");
        System.out.println("Estar segur al momento de seleccionar una raza, una vez seleccionada la raza no podra cambiar su eleccion. ");
        System.out.println("El primer jugador debe agregar al segundo jugador desde el menu al finalizar su primer turno.");
        System.out.println("\nComenzar el juego (Si/No)");
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
