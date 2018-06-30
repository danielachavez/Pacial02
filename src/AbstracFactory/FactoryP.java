/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Gigante.GiganteFactory;
import Lanzarroca.LanzarrocaFactory;
import Verdugo.VerdugoFactory;



/**
 *
 * @author Daniela Chavez
 */
public class FactoryP {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Gigante":
                return new GiganteFactory();
            case "Lanzarroca":
                return new LanzarrocaFactory(); 
            case "Verdugo":
                return new VerdugoFactory();
        }
        return null;
    }
}
