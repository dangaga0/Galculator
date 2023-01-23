import java.util.*;


public class enemigo {

    static Random rm = new Random();

    static String name;
    static boolean turn = false; 
    static int hp;
    static int dm;
    static boolean vivo = true;
    static boolean com = false;
    static int price;

    enemigo(String name,int hp,int dm,int price){

        this.name = name;
        this.hp = hp;
        this.dm = dm;
        this.price = price;

        
    }

    public static void pato(){

        enemigo pato = new enemigo("pato",7,2,5);
        com = true;
        if(objetos.escudo.sold){
            pato.dm = pato.dm -1;
        }

    }

    public static void slime(){

        enemigo slime = new enemigo("slime",6,1,2);
        com = true;
        if(objetos.escudo.sold){
            slime.dm = slime.dm -1;
        }

    }

    public static void pajaro(){

        enemigo slime = new enemigo("pajaro",7,3,5);
        com = true;
        if(objetos.escudo.sold){
            slime.dm = slime.dm -1;
        }

    }

    public static void serpiente(){

        enemigo serpiente = new enemigo("serpien",11,4,10);
        com = true;
        if(objetos.escudo.sold){
            serpiente.dm = serpiente.dm -1;
        }

    }

    public static void mono(){

        enemigo mono = new enemigo("mono",12,5,11);
        com = true;
        if(objetos.escudo.sold){
            mono.dm = mono.dm -1;
        }

    }

    public static void lobo(){

        enemigo lobo = new enemigo("lobo",8,9,10);
        com = true;
        if(objetos.escudo.sold){
            lobo.dm = lobo.dm -1;
        }

    }

    public static void dragon(){

        enemigo dragon = new enemigo("dragon",25,7,15);
        com = true;
        if(objetos.escudo.sold){
            dragon.dm = dragon.dm -1;
        }

    }

    public static void golem(){

        enemigo golem = new enemigo("golem",30,6,20);
        com = true;
        if(objetos.escudo.sold){
            golem.dm = golem.dm -1;
        }

    }

    public static void oso(){

        enemigo centaleon = new enemigo("oso",27,8,18);
        com = true;
        if(objetos.escudo.sold){
            centaleon.dm = centaleon.dm -1;
        }

    }


    public static void ataque(){

        System.out.println("el enemigo a atacado de vulta infringiendo " + enemigo.dm);
        personaje.hp = (personaje.hp - enemigo.dm);
        System.out.println("--------------------------------\ntu\thp\tdaño\ntu\t"+ personaje.hp+"\t"+personaje.dm+"\n--------------------------------");
        
    }

    
}

