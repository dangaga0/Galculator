import java.util.*;

public class Personaje extends Eventos{

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

    static int din = 10;
    static int hp = 15;
    static int dm = 5;
    static int lv = 1;
    static int xp = 0;
    static double aulv2 = Personaje.lv * Personaje.lv * 0.5 *0.42 +4;
    static int aulv = (int) aulv2;
    static int phu;
    static String vol;
    static boolean tnt = false;
    static boolean key = false;
    static boolean ataque = false;
    static int aum;
    static boolean defensa = false;
    static boolean velocidad = false;

    


    Personaje(){

        
    }

    public static void accion(){

    

        System.out.println("-atacar (a)\n-huir (h)\n-inventario (i)");
        String acc =sc.nextLine();

        if (acc.equals("a")) {

            if (ataque) {
                aum = (int)(dm * 0.5);
                dm += aum;
            }
            if (defensa) {
                Enemigo.dm -= 3;
            }
            
            if (Objetos.anillo_fuego.sold) {
                quem();
                System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                esperar(3);
                enem();
                
            }

            if (velocidad) {
                ataque();
                enem();
                esperar(3);
                if (Objetos.anillo_hielo.sold) {
                    int conj = rm.nextInt(3);
                    if (conj == 1) {
                        System.out.println("El enemigo esta congelado y no puede atacar");
                        esperar(3);
                    } else {
                        Enemigo.ataque();
                        esperar(3);
                        perm();
                        
                    }
                } else{
                    Enemigo.ataque();
                    perm();
                    esperar(3);
                }
            }else{
                if (Objetos.anillo_hielo.sold) {
                    int conj = rm.nextInt(3);
                    if (conj == 1) {
                        System.out.println("El enemigo esta congelado y no puede atacar");
                        esperar(3);
                    } else {
                        Enemigo.ataque();
                        esperar(3);
                        perm();
                        
                    }
                } else{
                    Enemigo.ataque();
                    perm();
                    esperar(3);
                }
    
                ataque();
                enem();
                esperar(3);
            }
                     
            if (Objetos.bumeran.sold){
                int dob = rm.nextInt(5);
                if (dob == 1) {
                    if (Enemigo.hp > 0) {
                        ataque2();
                        enem();
                        esperar(2);
                    }
                }
            }
            if (Objetos.anillo_fuego.sold && Enemigo.hp > 0) {
                quem();
                System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                enem();
                
            }
            if (ataque) {
                dm -= aum;
                ataque = false;
            }
            if (defensa) {
                Enemigo.dm += 3;
                defensa = false;
            }
            velocidad = false;
            if (Objetos.collar_mistico.sold) {
                hp += 2;
                
            }
            

                
            
            
        } else if(acc.equals("h")){

            if (Ciclo.rio) {
                System.out.println("no puedes huir");
            } else {
                phu = rm.nextInt(4);

            if (phu == 0) {
                esperar(2);
                System.out.println("No has podido huir");
                esperar(2);
                Enemigo.ataque();
                perm();

                
            } else {
                esperar(2);
                System.out.println("has hudido con exito");
                esperar(2);
                vex();

            }
            }            
            
            
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

        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        
    }

    public static void ataque1(){

        System.out.println("has atacado y has infligido " + dm);
        Enemigo.hp = (Enemigo.hp - dm);

        
    }

    public static void ataque2(){

        System.out.println("¡Has vuleto a atacar por el bomerang! y has infligido " + dm);
        Enemigo.hp = (Enemigo.hp - dm);

        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        
    }

    public static void inventario(){

    System.out.println("***************INVENTARIO***************");

    if (Objetos.hacha.sold) {
        System.out.println("\n-hacha, +9 daño");
    }
    
    if (Objetos.bumeran.sold) {
        System.out.println("\n-bumerang, +4 daño y oportunidad de doble golpe");
    }

    if (Objetos.espada.sold) {
        System.out.println("\n-espada, +2 daño");
    }


    if (Objetos.escudo.sold) {
        System.out.println("\n-escudo, -1 daño recibido");
    }

    if (Objetos.armadura.sold) {
        System.out.println("\n-armadura, -2 daño recibido");
    }

    if (Objetos.anillo_fuego.sold) {
        System.out.println("\n-anillo_fuego, inflige 3 de daño al principio y final del turno");
    }

    if (Objetos.anillo_hielo.sold) {
        System.out.println("\n-anillo_hielo, puede congelar al enemigo impidiendole atacar");
    }
    if (Objetos.collar_mistico.sold) {
        System.out.println("\n-collar_mistico, respera 2 de salud al terminar el turno");
    }

    if (Objetos.pan.sold) {
        System.out.println("\n-pan(x"+Objetos.panc+"), +5 de vida\t\t\t\t(p)");
    }
    if (Objetos.shuriken.sold) {
        System.out.println("\n-shuriken(x"+Objetos.shurikenc+"), +4 daño\t\t\t\t(s)");
    }
    if (Objetos.filete.sold) {
        System.out.println("\n-filetes(x"+Objetos.filetesc+"), +15 de vida\t\t\t(f)");
    }
    if (Objetos.poc_ataque.sold) {
        System.out.println("\n-poc_ataque(x"+Objetos.poc_ataquec+"), +50% daño\t\t\t(a)");
    }
    if (Objetos.poc_defensa.sold) {
        System.out.println("\n-poc_defensa(x"+Objetos.poc_defensac+"), -3 daño recivido\t\t(d)");
    }
    if (Objetos.poc_velocidad.sold) {
        System.out.println("\n-poc_velocidad(x"+Objetos.poc_velocidadc+"), ataca primero\t\t(v)");
    }

    if (Objetos.esclavo.sold) {
        System.out.println("\n-parece que el pobre esclavo ha muerto...");
    }

    if (tnt) {
        System.out.println("\n-algo de tnt sacada del culo de un pato");
    }
    if (key){
        System.out.println("\n-llave del castillo, ¿porque tiene esta forma tan extraña?");
    }



    System.out.println("\n****Stadisticas****");
    System.out.println("\n-" + hp+" hp");
    System.out.println("-"+ dm+" daño");
    System.out.println("-"+ din+" gemas");
    System.out.println("-lv "+ lv + "  " +xp);
    System.out.println(aulv);

    

    System.out.println("\n(r) para regresar o las letras para usar los objetos");
                
        vol = sc.nextLine();
        switch (vol) {
            case "r":
            System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
            break;
            case "p":
            if (Objetos.panc>0) {
                curar(5);
                Objetos.panc--;
            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();
            break;
            case "f":
            if (Objetos.filetesc>0) {
                curar(15);
                Objetos.filetesc--;
            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();
            break;
            case "s":
            if (Objetos.shurikenc>0) {
                System.out.println("has infligido 4 de daño");
                Enemigo.hp -= 4;
                enem();
                Objetos.shurikenc--;

            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();
            break;
            case "a":
            if (Objetos.poc_ataquec>0) {
                System.out.println("has bebido la poc_ataque");
                ataque = true;
                Objetos.poc_ataquec--;

            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();
            break;
            case "d":
            if (Objetos.poc_defensac>0) {
                System.out.println("has bebido la poc_defensa");
                defensa = true;
                Objetos.poc_defensac--;

            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();

            break;
            case "v":
            if (Objetos.poc_velocidadc>0) {
                System.out.println("has bebido la poc_velocidad");
                velocidad = true;
                Objetos.poc_velocidadc--;

            } else {
                System.out.println("no te quedan unidades");
            }
            inventario();

            break;
            
            default:
            System.out.println("orden incorrecta");
                break;
                
        }
        
                
                


    }


    
}
