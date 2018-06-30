/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanzarroca;

import AbstracFactory.AbstractFactory;
import EdificacionesLanzarroca.L_Infernal;
import EdificacionesLanzarroca.L_Extractor;
import EdificacionesLanzarroca.L_Taller;
import Gigante.Gigante;
import EdificacionesLanzarroca.L_Elixir;
import EdificacionesLanzarroca.L_Gema;
import EdificacionesLanzarroca.L_Oro;
import TropaLanzarroca.T_Esbirros;
import TropaLanzarroca.T_Lanzarroca;
import VehiculosLanzarroca.L_Avioneta;
import VehiculosLanzarroca.L_Tanque;
import Verdugo.Verdugo;

/**
 *
 * @author Daniela Chavez
 */
public class LanzarrocaFactory implements AbstractFactory{
    
    @Override
    public Gigante getGigante(String type){
        return null;
    }
    
    @Override
    public Lanzarroca getLanzarroca(String type){
        
        switch(type){
            case "Oro":
                return new L_Oro();
            case "Gema":
                return new L_Gema();  
            case "Elixir":
                return new L_Elixir();
            case "Tanque":
                return new L_Tanque();
            case "Avioneta":
                return new L_Avioneta();
            case "Recolector de Elixir":
                return new L_Extractor();
            case "Taller":
                return new L_Taller();
            case "Torre infernal":
                return new L_Infernal();
            case "Lanzarroca":
                return new T_Lanzarroca();
            case "Tropa Lanzarroca":
                return new T_Esbirros();
                    
        }    
        return null;
    }  

   @Override
    public Verdugo getVerdugo(String type){
        return null;
    }

   

}
