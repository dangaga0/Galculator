import java.util.*;

public class personaje {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

    boolean vivo = true;
    static int din = 90;
    static int hp = 10;
    static int dm = 5;
    static int phu;

    


    personaje(){

        
    }

    public static void accion(){

    

        System.out.println("-atacar (a)\n-huir (h)\n-tienda (t)\n-inventario (i)");
        String acc =sc.nextLine();

        if (acc.equals("a")) {

            if (objetos.bumeran.sold){
            int dob = rm.nextInt(5);
            if (dob == 1) {
                ataque1();
                ataque2();
                
            } else {
                ataque();
            } 
            enemigo.ataque();
            }
            if (objetos.shuriken.sold) {
                objetos.shuriken.sold = false;
                personaje.dm = personaje.dm - 4;
            }
            
            
        } else if(acc.equals("h")){
            phu = rm.nextInt(2);

            if (phu == 0) {
                System.out.println("No has podido huir");
                enemigo.ataque();
                
            } else {
                System.out.println("has hudido con exito");
                enemigo.com = false;
                objetos.turn = false;
                ciclo.reloj();

            }
        } else if(acc.equals("t")){

            enemigo.com = false;
            objetos.tienda();
            

        }    
        else if(acc.equals("i")){
        }

                        
        
    }

    public static void ataque(){

        System.out.println("has atacado y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n----------------------------------------");
        
    }

    public static void ataque1(){

        System.out.println("has atacado y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        
    }

    public static void ataque2(){

        System.out.println("¡Has vuleto a atacar por el bomerang! y has infligido " + dm);
        enemigo.hp = (enemigo.hp - dm);

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n----------------------------------------");
        
    }


    
}
