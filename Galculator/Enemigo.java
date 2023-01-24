import java.util.*;


public class Enemigo {

    static Random rm = new Random();

    static String name;
    static boolean turn = false; 
    static int hp;
    static int dm;
    static boolean vivo = true;
    static boolean com = false;
    static int price;

    Enemigo(String name,int hp,int dm,int price){

        this.name = name;
        this.hp = hp;
        this.dm = dm;
        this.price = price;

        
    }

    public static void pato(){

        Enemigo pato = new Enemigo("pato",7,2,5);
        com = true;
        if(Objetos.escudo.sold){
            pato.dm = pato.dm -1;
        }

    }

    public static void slime(){

        Enemigo slime = new Enemigo("slime",6,1,2);
        com = true;
        if(Objetos.escudo.sold){
            slime.dm = slime.dm -1;
        }

    }

    public static void pajaro(){

        Enemigo slime = new Enemigo("pajaro",7,3,5);
        com = true;
        if(Objetos.escudo.sold){
            slime.dm = slime.dm -1;
        }

    }

    public static void serpiente(){

        Enemigo serpiente = new Enemigo("serpien",11,4,10);
        com = true;
        if(Objetos.escudo.sold){
            serpiente.dm = serpiente.dm -1;
        }

    }

    public static void mono(){

        Enemigo mono = new Enemigo("mono",12,5,11);
        com = true;
        if(Objetos.escudo.sold){
            mono.dm = mono.dm -1;
        }

    }

    public static void lobo(){

        Enemigo lobo = new Enemigo("lobo",8,9,10);
        com = true;
        if(Objetos.escudo.sold){
            lobo.dm = lobo.dm -1;
        }

    }

    public static void dragon(){

        Enemigo dragon = new Enemigo("dragon",25,7,15);
        com = true;
        if(Objetos.escudo.sold){
            dragon.dm = dragon.dm -1;
        }

    }

    public static void golem(){

        Enemigo golem = new Enemigo("golem",30,6,20);
        com = true;
        if(Objetos.escudo.sold){
            golem.dm = golem.dm -1;
        }

    }

    public static void oso(){

        Enemigo centaleon = new Enemigo("oso",27,8,18);
        com = true;
        if(Objetos.escudo.sold){
            centaleon.dm = centaleon.dm -1;
        }

    }


    public static void ataque(){

        System.out.println("el Enemigo a atacado de vulta infringiendo " + Enemigo.dm);
        Personaje.hp = (Personaje.hp - Enemigo.dm);
        System.out.println("--------------------------------\ntu\thp\tdaño\ntu\t"+ Personaje.hp+"\t"+Personaje.dm+"\n--------------------------------");
        
    }

    
}

