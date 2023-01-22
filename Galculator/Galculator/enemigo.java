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

    public static void serpiente(){

        enemigo serpiente = new enemigo("serpien",11,4,10);
        com = true;
        if(objetos.escudo.sold){
            serpiente.dm = serpiente.dm -1;
        }

    }

    public static void dragon(){

        enemigo dragon = new enemigo("dragon",25,7,15);
        com = true;
        if(objetos.escudo.sold){
            dragon.dm = dragon.dm -1;
        }

    }


    public static void ataque(){

        System.out.println("el enemigo a atacado de vulta infringiendo " + enemigo.dm);
        personaje.hp = (personaje.hp - enemigo.dm);
        System.out.println("--------------------------------\ntu\thp\tdaño\ntu\t"+ personaje.hp+"\t"+personaje.dm+"\n--------------------------------");
        
    }

    
}

