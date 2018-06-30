/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verdugo;

import AbstracFactory.AbstractFactory;
import EdificacionesVerdugo.V_Cuartel;
import EdificacionesVerdugo.V_Mina;
import EdificacionesVerdugo.V_Tesla;
import Gigante.Gigante;
import Lanzarroca.Lanzarroca;
import EdificacionesVerdugo.V_Acido;
import EdificacionesVerdugo.V_Diamante;
import EdificacionesVerdugo.V_Fichas;
import TropaVerdugo.T_Duendes;
import TropaVerdugo.T_Verdugo;
import VehiculosVerdugo.V_Camion;
import VehiculosVerdugo.V_Motocicleta;

/**
 *
 * @author Daniela Chavez
 */
public class VerdugoFactory implements AbstractFactory{
   
    @Override
    public Gigante getGigante(String type){
        return null;
    }
    
    @Override
    public Lanzarroca getLanzarroca(String type){
        return null;
    }
    
    @Override
    public Verdugo getVerdugo(String type){
        
        switch(type){
            case "Fichas":
                return new V_Fichas();
            case "Acido":
                return new V_Acido();
            case "Diamante":
                return new V_Diamante();
            case "Motocicleta":
                return new V_Motocicleta();
            case "Camion":
                return new V_Camion();
            case "Mina de diamantes":
                return new V_Mina();
            case "Torre Tesla":
                return new V_Tesla();
            case "Cuartel":
                return new V_Cuartel();
            case "Verdugo":
                return new T_Verdugo();
            case "Tropa de duendes":
                return new T_Duendes();
                
        }
        return null;
    }

    
}
