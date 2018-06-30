/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;


import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryP;
import Gigante.Gigante;
import Lanzarroca.Lanzarroca;
import Verdugo.Verdugo;
import java.util.Scanner;

/**
 *
 * @author Daniela Chavez
 */
public class Menu {
    
    public Jugador jugador;

    public Menu() {
    }
    
    public Menu(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    //abstracts
    AbstractFactory gigante = FactoryP.getFactory("Gigante");
    AbstractFactory lanzarroca = FactoryP.getFactory("Lanzarroca");
    AbstractFactory verdugo = FactoryP.getFactory("Verdugo");
    
    //edificaciones, vehiculos, milicia 
    Gigante g = gigante.getGigante("Almacenamiento de Monedas");
    Gigante g1 = gigante.getGigante("Almacenamiento de Zafiros");
    Gigante g2 = gigante.getGigante("Generador de Hechizos");
    Gigante g3 = gigante.getGigante("Caldero de hechizo");
    Gigante g4 = gigante.getGigante("Laboratorio");
    Gigante g5 = gigante.getGigante("Torre de arqueras");
    Gigante g6 = gigante.getGigante("Camion");
    Gigante g7 = gigante.getGigante("Cuadrimoto");
    Gigante g8 = gigante.getGigante("Arqueras");
    Gigante g9 = gigante.getGigante("Gigante");
    
    
    
    //edificaciones, vehiculos, milicia 0
    Lanzarroca l = lanzarroca.getLanzarroca("Almacenamiento de Oro");
    Lanzarroca l1 = lanzarroca.getLanzarroca("Almacenamiento de Gema");
    Lanzarroca l2 = lanzarroca.getLanzarroca("Generador de Elixir");
    Lanzarroca l3 = lanzarroca.getLanzarroca("Extractor");
    Lanzarroca l4 = lanzarroca.getLanzarroca("Taller");
    Lanzarroca l5 = lanzarroca.getLanzarroca("Torre Infernal");
    Lanzarroca l6 = lanzarroca.getLanzarroca("Tanque");
    Lanzarroca l7 = lanzarroca.getLanzarroca("Avioneta");
    Lanzarroca l8 = lanzarroca.getLanzarroca("Esbirros");
    Lanzarroca l9 = lanzarroca.getLanzarroca("Lanzarroca");
    
    //edificaciones, vehiculos, milicia
    Verdugo v = verdugo.getVerdugo("Almacenamiento de Fichas ");
    Verdugo v1 = verdugo.getVerdugo("Almacenamiento de Diamamante");
    Verdugo v2 = verdugo.getVerdugo("Generador de Acido");
    Verdugo v3 = verdugo.getVerdugo("Mina de diamantes");
    Verdugo v4 = verdugo.getVerdugo("Torre tesla");
    Verdugo v5 = verdugo.getVerdugo("Cuartel");
    Verdugo v6 = verdugo.getVerdugo("Motocicleta");
    Verdugo v7 = verdugo.getVerdugo("Camion");
    Verdugo v8 = verdugo.getVerdugo("Duendes");
    Verdugo v9 = verdugo.getVerdugo("Verdugo");
    
    
    public void MenuRaza(Jugador jugador){
        Menu menu = new Menu(jugador);
        
        Scanner auxi = new Scanner(System.in);
        int opc;
        System.out.println("\n"+getJugador().getNombre() +"\nEliga su raza:\n");
        System.out.println("1. Gigante");
        System.out.println("2. Lanzarroca");
        System.out.println("3. Verdugo");
        System.out.println("Digite una opcion: ");
        opc = auxi.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Selecciono la raza Gigante");
                menu.MenuGigante(jugador);
            break;
            
            case 2:
                System.out.println("Selecciono la raza Lanzarroca");
                menu.MenuLanzarroca(jugador);
            break;
            
            case 3:
                System.out.println("Selecciono la raza Verdugo");
                menu.MenuVerdugo(jugador);
            break;
            
            default:
                System.out.println("Selecciono La raza Gigante");
                menu.MenuGigante(jugador);
        }
    }

    public void MenuGigante(Jugador jugador) {
        int opc=0;
        String res;
        do{
            System.out.println("----------------------Recursos---------------------");
            System.out.println("Monedas: "+getJugador().getC_mando().getRecurso1());
            System.out.println("Zafiro: "+getJugador().getC_mando().getRecurso2());
            System.out.println("Hechizo: "+getJugador().getC_mando().getRecurso3());
            System.out.println("\n********Gigante********");
            System.out.println("1. Atacar");
            System.out.println("2. Generar Hechizos");
            System.out.println("3. Construir Almacenamiento de Monedas");
            System.out.println("4. Construir Almacenamiento zafiro");
            System.out.println("5. Construir Almacenamiento de hechizos");  
            System.out.println("6. Construir Caldero de hechizos");  
            System.out.println("7. Construir Torre de arqueras");       
            System.out.println("8. Construir Laboratorio");
            System.out.println("9. Construir Camion");
            System.out.println("10. Construir Cuadrimoto");
            System.out.println("11. Entranar Gigante");
            System.out.println("12. Entrenar Arqueras");            
            System.out.println("13. Recoger monedas");
            System.out.println("14. Recoger zafiros");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            System.out.println("17. Agregar segundo jugador");
            
            Scanner auxi = new Scanner(System.in); 
            try{
                System.out.println("\nDigite una opcion: ");
                opc = auxi.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    System.out.println("Que desea atacar?\n");
                    System.out.println("1. Edificacion recursos");
                    System.out.println("2. Edificacion vehiculos");
                    System.out.println("3. Edificacion milicias");
                    System.out.println("4. Centro de Mando");
                    res = auxi.next();
                    switch(res){
                        case "1":
                            System.out.println("Que desea ocupar para atacar?\n");
                            System.out.println("1. Arqueras");
                            System.out.println("2. Gigante");
                            String res1;
                            res1 = auxi.next();
                            switch(res1){
                                case "1":
                                    if(g8.estado()==true){
                                        System.out.println("Las Arqueras estan disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getEdi_1().indexOf(l)-g8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Arqueras entrenadas");
                                    }
                                break;
                                case "2":
                                    if(g9.estado()==true){
                                        System.out.println("El Gigante esta disponible para un nuevo ataque");
                                        g.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Gigante entrenado");
                                    }
                                break;
                            }
                            break;
                            case "2":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Arqueras");
                            System.out.println("2. Gigante");
                            String res12;
                            res12 = auxi.next();
                            switch(res12){
                                case "1":
                                    if(g8.estado()==true){
                                        System.out.println("Las Arqueras estan disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getEdi_1().indexOf(l)-g8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Arqueras entrenadas");
                                    }
                                break;
                                case "2":
                                    if(g9.estado()==true){
                                        System.out.println("El Gigante esta disponible para un nuevo ataque");
                                        g.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Gigante entrenado");
                                    }
                                break;
                            }
                            break;
                            case "3":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Arqueras");
                            System.out.println("2. Gigantes");
                            String res31;
                            res31 = auxi.next();
                            switch(res31){
                                case "1":
                                    if(g8.estado()==true){
                                        System.out.println("Las Arqueras estan disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getEdi_1().indexOf(l)-g8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Arqueras entrenadas");
                                    }
                                break;
                                case "2":
                                    if(g9.estado()==true){
                                        System.out.println("El Gigante esta disponible para un nuevo ataque");
                                        g.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Gigante entrenado");
                                    }
                                break;
                            }
                            break;
                        case "4":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Arqueras");
                            System.out.println("2. Gigante");
                            String res11;
                            res11 = auxi.next();
                            switch(res11){
                                case "1":
                                    if(g8.estado()==true){
                                        System.out.println("Las Arqueras estan disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getC_mando2().getVida()-g8.getAtacar();
                                        getJugador().getC_mando2().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+g8.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando2().getVida());
                                    }else{
                                        System.out.println("No tiene Arqueras entrenadas");
                                    }
                                break;
                                case "2":
                                    if(g9.estado()==true){
                                        System.out.println("El Gigante esta disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getC_mando2().getVida()-g9.getAtacar();
                                        getJugador().getC_mando2().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+g9.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando2().getVida());
                                    }else{
                                        System.out.println("No tiene Gigante entrenado");
                                    }
                                break;
                            }
                    }
                break;                     
                case 2:
                    g2.generar(jugador);
                break;
                case 3:
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                    System.out.println("Cuesta 1000 Caldero, 1000 Laboratorio. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                break;    
                case 4:
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                    System.out.println("Cuesta 1500 laboratorio, 1500 Torre. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g1.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                break;
                case 5:
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                    System.out.println("Cuesta 1500 Caldero, 1500 Torre. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g2.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                break;
                case 6:
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                    System.out.println("Cuesta 1000 Laboratorio 1000 Torre. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g3.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_1().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_1().size());
                break;
                case 7:
                    System.out.println("Cuesta 1000 Caldero, 1000 Laboratorio. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g4.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 8:
                    System.out.println("Cuesta 2000 Laboratorio, 2000 Torre. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g5.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 9:
                    System.out.println("Cuesta 1500 Caldero, 1500 Laboraotrio. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g6.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 10:
                    System.out.println("Cuesta 1500 Laboratorio, 1500 Caldero. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g7.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 11:
                    System.out.println("Cuesta 1000 Laboratorio, 1000 Caldero. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g8.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 12:
                    System.out.println("Cuesta 2000 Torre, 2000 Caldero. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        g9.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 13:
                    System.out.println("Se recogio esta cantidad de Monedas: "+g.recoger(jugador));
                    break;
                case 14:
                    System.out.println("Se recogio esta cantidad de Zafiro: "+g1.recoger(jugador));
                    break;
                case 15:
                    int c1 = getJugador().getC_mando().getCapacidad1();
                    int c2 = getJugador().getC_mando().getCapacidad2();
                    int c3 = getJugador().getC_mando().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double resp= (ca1+ca2+ca3);
                    resp=resp*0.25;
                    resp=(int)resp/3;
                    
                    System.out.println("El costo por recurso para mejorar El Centro de Mando es de: "+resp);
                    
                    if(getJugador().getC_mando().getRecurso1() >= resp && getJugador().getC_mando().getRecurso2() >= resp && getJugador().getC_mando().getRecurso3() >= resp){
                        getJugador().getC_mando().mejorar();
                        System.out.println("Recurso 1: "+getJugador().getC_mando().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getC_mando().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getC_mando().getRecurso2());
                        System.out.println("Desea continurar para mejorar El Centro de Mando?(Si/No)");
                        res = auxi.next();
                        getJugador().getC_mando().setRecurso1(getJugador().getC_mando().getRecurso1()-1833);
                        getJugador().getC_mando().setRecurso2(getJugador().getC_mando().getRecurso2()-1833);
                        getJugador().getC_mando().setRecurso3(getJugador().getC_mando().getRecurso3()-1833);
                        System.out.println("\nSe mejoro El Centro de Mando\n");
                    }else{
                        System.out.println("No tiene suficientes recursos ");
                    }
                    break;
                case 16:
                    Menu m = new Menu(jugador);
                    m.MenuLanzarroca(jugador);
                    break;
            }

        }while(opc!=17); 
    }  
    
    public void MenuLanzarroca(Jugador jugador) {
        String res;
        int opc=0;
        do{
            System.out.println("-*-*-*-*-*-*-*-*-*-Recursos-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Titanio: "+getJugador().getC_mando2().getRecurso1());
            System.out.println("Carbon: "+getJugador().getC_mando2().getRecurso2());
            System.out.println("Ecos: "+getJugador().getC_mando2().getRecurso3());
            System.out.println("\n*-*-*-*-*-*-*-Lanzarroca-*-*-*-*-*-*-*-");
            System.out.println("1. Atacar");
            System.out.println("2. Generar Elixir");
            System.out.println("3. Construir Almacenamiento Oro");
            System.out.println("4. Construir Almacenamiento Gema");
            System.out.println("5. Construir Almacenamiento de Elixir");
            System.out.println("6. Construir Extractor");
            System.out.println("7. Construir Taller");
            System.out.println("8. Construir Torre Infernal");
            System.out.println("9. Construir Avioneta");
            System.out.println("10. Construir Tanque");
            System.out.println("11. Entrenar Lanzarroca");
            System.out.println("12. Entrenar Esbirros");
            System.out.println("13. Recoger  Oro");
            System.out.println("14. Recoger Gema");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            System.out.println("17. Agregar segundo jugador");
            
            Scanner auxi= new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = auxi.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    System.out.println("Que desea atacar?\n");
                    System.out.println("1. Edificacion recursos");
                    System.out.println("2. Edificacion vehiculos");
                    System.out.println("3. Edificacion milicias");
                    System.out.println("4. Centro de Mando");
                    res = auxi.next();
                    switch(res){
                        case "1":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Esbirros");
                            System.out.println("2. Lanzarroca");
                            String res1;
                            res1 = auxi.next();
                            switch(res1){
                                case "1":
                                    if(l8.estado()==true){
                                        System.out.println("Los Esbirros estan disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Esbirros entrenados");
                                    }
                                break;
                                case "2":
                                    if(l9.estado()==true){
                                        System.out.println("El Lanzarroca esta disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Lanzarroca entrenado");
                                    }
                                break;
                            }
                            case "2":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Esbirros");
                            System.out.println("2. Lanzarroca");
                            String res14;
                            res14 = auxi.next();
                            switch(res14){
                                case "1":
                                    if(l8.estado()==true){
                                        System.out.println("Los Esbirros estan disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Esbirros entrenados");
                                    }
                                break;
                                case "2":
                                    if(l9.estado()==true){
                                        System.out.println("El Lanzarroca esta disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Lanzarroca entrenado");
                                    }
                                break;
                                case "3":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Esbirros");
                            System.out.println("2. Lanzarroca");
                            String res31;
                            res31 = auxi.next();
                            switch(res31){
                                case "1":
                                    if(l8.estado()==true){
                                        System.out.println("Los Esbirros estan disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Esbirros entrenados");
                                    }
                                break;
                                case "2":
                                    if(l9.estado()==true){
                                        System.out.println("El Lanzarroca esta disponible para un nuevo ataque");
                                        l8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Lanzarroca entrenado");
                                    }
                                break;
                            case "4":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Esbirros");
                            System.out.println("2. Lanzarrocas");
                            String res11;
                            res11 = auxi.next();
                            switch(res11){
                                case "1":
                                    if(l8.estado()==true){
                                        System.out.println("Los Esbirros estan disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getC_mando().getVida()-l8.getAtacar();
                                        getJugador().getC_mando().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+l8.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando().getVida());
                                    }else{
                                        System.out.println("No tiene Esbirros entrenados");
                                    }
                                break;
                                case "2":
                                    if(l9.estado()==true){
                                        System.out.println("El Lanzarroca esta disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getC_mando().getVida()-l9.getAtacar();
                                        getJugador().getC_mando().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+l9.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando().getVida());
                                    }else{
                                        System.out.println("No tiene Lanzarroca entrenada");
                                    }
                                break;
                        }
                    }
                }
            }
                break;
                case 2:
                    l2.generar(jugador);
                break;
                case 3:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 1500 oro , 1500 gema. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("S")){
                        l.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 4:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 1500 oro, 1500 gema. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l1.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 5:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 2000 oro, 2000 elixir. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l2.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 6:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 1000 carbon, 1000 ecos. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l3.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 7:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 1500 oro, 1500 gema. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l4.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 8:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 1500 gema, 1500 elixir. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l5.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 9:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 2000 oro, 2000 gema. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l6.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 10:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 50 oro, 50 elixir. Desea continuar?((Si/No)");
                    res= auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l7.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                break;
                case 11:
                    System.out.println("Cuesta 1000 oro, 1000 elixir. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l8.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 12:
                    System.out.println("Cuesta 2000 gema, 2000 elixir. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        l9.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 13:
                    System.out.println("Se recogio esta cantidad de Oro: "+l.recoger(jugador));
                    break;
                case 14:
                    System.out.println("Se recogio esta cantidad de Gema: "+l1.recoger(jugador));
                    break;
                case 15:
                    int c1 = getJugador().getC_mando2().getCapacidad1();
                    int c2 = getJugador().getC_mando2().getCapacidad2();
                    int c3 = getJugador().getC_mando2().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double resp= (ca1+ca2+ca3);
                    resp=resp*0.25;
                    resp=(int)resp/3;
                    
                    System.out.println("El costo por recurso para mejorar El Centro de Mando es de: "+resp);
                    
                    if(getJugador().getC_mando2().getRecurso1() >= resp && getJugador().getC_mando2().getRecurso2() >= resp && getJugador().getC_mando2().getRecurso3() >= resp){
                        getJugador().getC_mando2().mejorar();
                        System.out.println("Tienes: ");
                        System.out.println("Recurso 1: "+getJugador().getC_mando2().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getC_mando2().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getC_mando2().getRecurso2());
                        System.out.println("Desea continurar para mejorar El Centro de Mando?(Si/No)");
                        res = auxi.next();
                        getJugador().getC_mando2().setRecurso1(getJugador().getC_mando2().getRecurso1()-1833);
                        getJugador().getC_mando2().setRecurso2(getJugador().getC_mando2().getRecurso2()-1833);
                        getJugador().getC_mando2().setRecurso3(getJugador().getC_mando2().getRecurso3()-1833);
                        System.out.println("\nSe mejoro El Centro de Mando\n");
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
                
                case 16:
                    Menu m = new Menu(jugador);
                    m.MenuGigante(jugador);
                    
                break;  
            }

        }while(opc!=17); 
    }  
    
    public void MenuVerdugo(Jugador jugador){
        String res;
        int opc=0;
        do{
            System.out.println("-*-*-*-*-*-*-*-*-*-Recursos-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Fichas: "+getJugador().getC_mando3().getRecurso1());
            System.out.println("Diamantes: "+getJugador().getC_mando3().getRecurso2());
            System.out.println("Acido: "+getJugador().getC_mando3().getRecurso3());
            System.out.println("\n*-*-*-*-*-*-*-*Verdugo*-*-*-*-*-*-*-*-");
            System.out.println("1. Atacar");
            System.out.println("2. Generar Acido");
            System.out.println("3. Construir Almacenamiento de Fichas");
            System.out.println("4. Construir Almacenamiento de Diamantes");
            System.out.println("5. Construir Almacenamiento de Acido");
            System.out.println("6. Construir Mina de Diamante");
            System.out.println("7. Construir Torre tesla");
            System.out.println("8. Construir Cuartel");
            System.out.println("9. Construir Motocicleta");
            System.out.println("10. Construir Camion");
            System.out.println("11. Entrenar Duendes");
            System.out.println("12. Entrenar Verdugo");
            System.out.println("13. Recoger  Fichas");
            System.out.println("14. Recoger Diamante");
            System.out.println("15. Mejorar Centro Mando");
            System.out.println("16. Terminar turno");
            System.out.println("17. Agregar segundo jugador");
            
            Scanner auxi = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = auxi.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){
                case 1:
                    System.out.println("Que desea atacar?\n");
                    System.out.println("1. Edificacion recursos");
                    System.out.println("2. Edificacion vehiculos");
                    System.out.println("3. Edificacion milicias");
                    System.out.println("4. Centro de Mando");
                    res = auxi.next();
                    switch(res){
                        case "1":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Duendes");
                            System.out.println("2. Verdugo");
                            String res1;
                            res1 = auxi.next();
                            switch(res1){
                                case "1":
                                    if(v8.estado()==true){
                                        System.out.println("Los Duendes estan disponible para un nuevo ataque");
                                        v8.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Duendes entrenados");
                                    }
                                break;
                                case "2":
                                    if(v9.estado()==true){
                                        System.out.println("El Verdugo esta disponible para un nuevo ataque");
                                        v9.getAtacar();
                                        System.out.println("Ataque realizado");
                                    }else{
                                        System.out.println("No tiene Verdugo entrenado");
                                    }
                                break;
                            }
                        case "4":
                            System.out.println("Que desea ocupar para el ataque?\n");
                            System.out.println("1. Duendes");
                            System.out.println("2. Verdugo");
                            String res11;
                            res11 = auxi.next();
                            switch(res11){
                                case "1":
                                    if(v8.estado()==true){
                                        System.out.println("Los Duendes estan disponible para un nuevo ataques");
                                        int total;
                                        total = getJugador().getC_mando2().getVida()-v8.getAtacar();
                                        getJugador().getC_mando2().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+v8.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando2().getVida());
                                    }else{
                                        System.out.println("No tiene Duendes entrenados");
                                    }
                                break;
                                case "2":
                                    if(v9.estado()==true){
                                        System.out.println("El Verdugo esta disponible para un nuevo ataque");
                                        int total;
                                        total = getJugador().getC_mando2().getVida()-v9.getAtacar();
                                        getJugador().getC_mando2().setVida(total);
                                        System.out.println("Ataque realizado, se hizo "+v9.getAtacar()+" de daño");
                                        System.out.println("Nueva vida centro mando de rival: "+getJugador().getC_mando2().getVida());
                                    }else{
                                        System.out.println("No tiene Verdugo entrenado");
                                    }
                                break;
                            }
                    }
                break;
                case 2:
                    v2.generar(jugador);
                break;
                case 3:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 fichas, 50 diamante. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 4:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 fichas, 50 diamante. Desea continuar?((S/N)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v1.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 5:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 fichas, 50 acido. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v2.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 6:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 acido, 50 diamante. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v3.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 7:
                    System.out.println("isEmpty: "+getJugador().getEdi_2().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_2().size());
                    System.out.println("Cuesta 50 diamante, 50 acido. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v4.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 8:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 ficha, 50 acido. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v5.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 9:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 ficha, 50 diamante. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v6.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 10:
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                    System.out.println("Cuesta 50 diamante, 50 acido. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v7.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEdi_3().isEmpty());
                    System.out.println("size: "+getJugador().getEdi_3().size());
                break;
                case 11:
                    System.out.println("Cuesta 100 acido, 100 ficha. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v8.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 12:
                    System.out.println("Cuesta 100 acido, 100 diamante. Desea continuar?((Si/No)");
                    res = auxi.next();
                    if(res.equalsIgnoreCase("Si")){
                        v9.entrenar(jugador);
                    }else{
                        break;
                    }
                break;
                case 13:
                    System.out.println("Se recogio esta cantidad de Ficha: "+v.recoger(jugador));
                    break;
                case 14:
                    System.out.println("Se recogio esta cantidad de Diamante: "+v1.recoger(jugador));
                    break;
                case 15:
                    int c1 = getJugador().getC_mando3().getCapacidad1();
                    int c2 = getJugador().getC_mando3().getCapacidad2();
                    int c3 = getJugador().getC_mando3().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double resp= (ca1+ca2+ca3);
                    resp=resp*0.25;
                    resp=(int)resp/3;
                    
                    System.out.println("El costo por recurso para la mejora El Centro de Mando es de: "+resp);
                    
                    if(getJugador().getC_mando3().getRecurso1() >= resp && getJugador().getC_mando3().getRecurso2() >= resp && getJugador().getC_mando3().getRecurso3() >= resp){
                        getJugador().getC_mando().mejorar();
                        System.out.println("Recurso 1: "+getJugador().getC_mando3().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getC_mando3().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getC_mando3().getRecurso2());
                        System.out.println("Desea continurar para mejora El Centro de Mando?(Si/No)");
                        res = auxi.next();
                        getJugador().getC_mando3().setRecurso1(getJugador().getC_mando3().getRecurso1()-1833);
                        getJugador().getC_mando3().setRecurso2(getJugador().getC_mando3().getRecurso2()-1833);
                        getJugador().getC_mando3().setRecurso3(getJugador().getC_mando3().getRecurso3()-1833);
                        System.out.println("\nSe mejoro El Centro de Mando\n");
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
            }
        }while(opc!=16); 
    }
}
