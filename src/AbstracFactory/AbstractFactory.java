/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Gigante.Gigante;
import Lanzarroca.Lanzarroca;
import Verdugo.Verdugo;

/**
 *
 * @author Daniela Chavez
 */
public interface AbstractFactory {
    Gigante getGigante(String type);
    Lanzarroca getLanzarroca(String type);
    Verdugo getVerdugo(String type);
    
}
