import java.util.*;

public class Personaje {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

    boolean vivo = true;
    static int din = 90;
    static int hp = 10;
    static int dm = 5;
    static int phu;
    static String vol;

    


    Personaje(){

        
    }

    public static void accion(){

    

        System.out.println("-atacar (a)\n-huir (h)\n-tienda (t)\n-inventario (i)");
        String acc =sc.nextLine();

        if (acc.equals("a")) {

            if (Objetos.anillo_hielo.sold) {
                int conj = rm.nextInt(3);
                if (conj == 1) {
                    System.out.println("El enemigo esta congelado y no puede atacar");
                    Eventos.esperar(3);
                } else {
                    Enemigo.ataque();
                    Eventos.esperar(3);
                    Eventos.perm();
                    
                }
            } else{
                Enemigo.ataque();
                Eventos.perm();
                Eventos.esperar(3);
            }

            ataque();
            Eventos.enem();
            Eventos.esperar(3);
            if (Objetos.bumeran.sold){
                int dob = rm.nextInt(5);
                if (dob == 1) {
                    if (Enemigo.hp > 0) {
                        ataque2();
                        Eventos.enem();
                        Eventos.esperar(2);
                    }
                }
            }
            if (Objetos.anillo_fuego.sold) {
                Eventos.quem();
                System.out.println("--------------------------------\nEnemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                Eventos.enem();
                
            }

                
            if (Objetos.shuriken.sold) {
                Objetos.shuriken.sold = false;
                Personaje.dm = Personaje.dm - 4;
            }
            
            
        } else if(acc.equals("h")){

            if (Ciclo.rio) {
                System.out.println("no puedes huir");
            } else {
                phu = rm.nextInt(2);

            if (phu == 0) {
                Eventos.esperar(2);
                System.out.println("No has podido huir");
                Eventos.esperar(2);
                Enemigo.ataque();
                Eventos.perm();

                
            } else {
                Eventos.esperar(2);
                System.out.println("has hudido con exito");
                Eventos.esperar(2);
                Eventos.vex();

            }
            }
            

            
        } else if(acc.equals("t")){

            Objetos.tienda();
            
        }    
        else if(acc.equals("i")){
            Objetos.tien = true;
            inventario();
        }else{
            System.out.println("orden incorrecta");
        }

        }

                        
        
    

    public static void ataque(){

        System.out.println("has atacado y has infligido " + dm);
        Enemigo.hp = (Enemigo.hp - dm);

        System.out.println("--------------------------------\nEnemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        
    }

    public static void ataque1(){

        System.out.println("has atacado y has infligido " + dm);
        Enemigo.hp = (Enemigo.hp - dm);

        
    }

    public static void ataque2(){

        System.out.println("¡Has vuleto a atacar por el bomerang! y has infligido " + dm);
        Enemigo.hp = (Enemigo.hp - dm);

        System.out.println("--------------------------------\nEnemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        
    }

    public static void inventario(){

    System.out.println("***************INVENTARIO***************");

    if (Objetos.hacha.sold) {
        System.out.println("\n-hacha, +9 daño");
    }
    
    if (Objetos.bumeran.sold) {
        System.out.println("-bumerang, +4 daño y oportunidad de doble golpe");
    }

    if (Objetos.espada.sold) {
        System.out.println("-espada, +2 daño");
    }

    if (Objetos.shuriken.sold) {
        System.out.println("-shuriken(x1), +4 daño");
    }

    if (Objetos.escudo.sold) {
        System.out.println("-escudo, -1 daño recibido");
    }

    if (Objetos.esclavo.sold) {
        System.out.println("-parece que el pobre esclavo ha muerto...");
    }

    System.out.println("\n****Stadisticas****");
    System.out.println("\n-" + Personaje.hp+" hp");
    System.out.println("-"+Personaje.dm+" daño");
    System.out.println("-"+Personaje.din+" gemas");
    

    System.out.println("\npulse cualquier tecla para regresar");
                
                vol = sc.nextLine();
                
                if (!vol.equals("")) {
                    Objetos.tien = false;
                    System.out.println("--------------------------------\nEnemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                }else{
                    
                    inventario();
                }


    }


    
}
