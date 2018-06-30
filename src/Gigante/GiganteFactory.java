/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigante;

import AbstracFactory.AbstractFactory;
import EdificacionesGigante.G_Caldero;
import EdificacionesGigante.G_Laboratorio;
import EdificacionesGigante.G_Torre;
import Lanzarroca.Lanzarroca;
import EdificacionesGigante.G_Hechizos;
import EdificacionesGigante.G_Monedas;
import EdificacionesGigante.G_Zafiro;
import TropaGigante.T_Arqueras;
import TropaGigante.T_Gigante;
import VehiculosGigante.G_Camion;
import VehiculosGigante.G_Cuadrimoto;
import Verdugo.Verdugo;

/**
 *
 * @author Daniela Chavez
 */
public class GiganteFactory implements AbstractFactory {
    @Override
    public Gigante getGigante(String type){
        switch(type){
            case "Hichizos":
                return new G_Hechizos();
            case "Monedas":
                return new G_Monedas();
            case "Zafiro":
                return new G_Zafiro();
            case "Camion":
                return new G_Camion();
            case "Cudrimoto":
                return new G_Cuadrimoto();
            case "Caldero de Hechizos":
                return new G_Caldero();
            case "Torre de arqueras":
                return new G_Torre();
            case "Laboratorio":
                return new G_Laboratorio();
            case "Gigante":
                return new T_Gigante();
            case "Tropas de arqueras":
                return new T_Arqueras();
          
        }
        return null;
    }
    
    @Override
    public Lanzarroca getLanzarroca(String type){
        return null;
    }
    
    @Override
    public Verdugo getVerdugo(String type){
        return null;
    }
}


