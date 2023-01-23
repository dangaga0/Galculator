import java.util.*;

public class personaje {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

    boolean vivo = true;
    static int din = 90;
    static int hp = 10;
    static int dm = 5;
    static int phu;
    static String vol;

    


    personaje(){

        
    }

    public static void accion(){

    

        System.out.println("-atacar (a)\n-huir (h)\n-tienda (t)\n-inventario (i)");
        String acc =sc.nextLine();

        if (acc.equals("a")) {

            if (objetos.bumeran.sold){
            int dob = rm.nextInt(5);
            if (dob == 1) {
                ataque();
                eventos.enem();
                eventos.esperar(3);
                enemigo.ataque();
                eventos.perm();         
                eventos.esperar(3);
                ataque2();
                eventos.enem();
                eventos.esperar(2);       
                
            } else {
                ataque();
                eventos.enem();
                eventos.esperar(3);
                enemigo.ataque();
                eventos.perm();
                eventos.esperar(2);         
            } 
            }
            if (!objetos.bumeran.sold) {
                ataque();
                eventos.enem();
                eventos.esperar(3);
                enemigo.ataque();
                eventos.perm();
                eventos.esperar(2);         
            }
                
            if (objetos.shuriken.sold) {
                objetos.shuriken.sold = false;
                personaje.dm = personaje.dm - 4;
            }
            
            
        } else if(acc.equals("h")){
            phu = rm.nextInt(2);

            if (phu == 0) {
                eventos.esperar(2);
                System.out.println("No has podido huir");
                eventos.esperar(2);
                enemigo.ataque();
                eventos.perm();

                
            } else {
                eventos.esperar(2);
                System.out.println("has hudido con exito");
                
                enemigo.com = false;
                objetos.turn = false;
                ciclo.reloj();

            }
        } else if(acc.equals("t")){

            objetos.tienda();
            
        }    
        else if(acc.equals("i")){
            objetos.tien = true;
            inventario();
        }else{
            System.out.println("orden incorrecta");
        }

                        
        
    }

    public static void ataque(){

        System.out.println("has atacado y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");
        
    }

    public static void ataque1(){

        System.out.println("has atacado y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        
    }

    public static void ataque2(){

        System.out.println("¡Has vuleto a atacar por el bomerang! y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");
        
    }

    public static void inventario(){

    System.out.println("***************INVENTARIO***************");

    if (objetos.hacha.sold) {
        System.out.println("\n-hacha, +9 daño");
    }
    
    if (objetos.bumeran.sold) {
        System.out.println("-bumerang, +4 daño y oportunidad de doble golpe");
    }

    if (objetos.espada.sold) {
        System.out.println("-espada, +2 daño");
    }

    if (objetos.shuriken.sold) {
        System.out.println("-shuriken(x1), +4 daño");
    }

    if (objetos.escudo.sold) {
        System.out.println("-escudo, -1 daño recibido");
    }

    if (objetos.esclavo.sold) {
        System.out.println("-parece que el pobre esclavo ha muerto...");
    }

    System.out.println("\n****Stadisticas****");
    System.out.println("\n-" + personaje.hp+" hp");
    System.out.println("-"+personaje.dm+" daño");
    System.out.println("-"+personaje.din+" gemas");
    

    System.out.println("\npulse cualquier tecla para regresar");
                
                vol = sc.nextLine();
                
                if (!vol.equals("")) {
                    objetos.tien = false;
                    System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");
                }else{
                    
                    inventario();
                }


    }


    
}
