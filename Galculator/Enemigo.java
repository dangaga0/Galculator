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
        if(Objetos.armadura.sold){
            this.dm = dm -3;
        } else if(Objetos.escudo.sold){
            this.dm = dm -1;
        }else{
            this.dm = dm;}
        
        this.price = price;
    }
        
    

    public static void pato(){

        Enemigo pato = new Enemigo("pato",7,2,4);
        com = true;
        Objetos.turn = true;

    }

    public static void slime(){

        Enemigo slime = new Enemigo("slime",6,1,2);
        com = true;
        Objetos.turn = true;
    }

    public static void pajaro(){

        Enemigo slime = new Enemigo("pajaro",7,3,4);
        com = true;
        Objetos.turn = true;


    }

    public static void buitre(){

        Enemigo buitre = new Enemigo("buitre",11,7,12);
        com = true;
        Objetos.turn = true;


    }

    public static void camello(){

        Enemigo camello = new Enemigo("camello",12,6,11);
        com = true;
        Objetos.turn = true;
        
    }

    public static void momia(){

        Enemigo momia = new Enemigo("momia",8,10,10);
        com = true;
        Objetos.turn = true;
        

    }

    public static void dragon(){

        Enemigo dragon = new Enemigo("dragon",27,11,15);
        com = true;
        Objetos.turn = true;
        
    }

    public static void golem(){

        Enemigo golem = new Enemigo("golem",40,9,20);
        com = true;
        Objetos.turn = true;
        

    }

    public static void oso(){

        Enemigo oso = new Enemigo("oso",29,10,15);
        com = true;
        Objetos.turn = true;
       
    }

    public static void pato_mutante(){

        Enemigo pato_mutante = new Enemigo("pato\nmutante",20,12,13);
        com = true;
        Objetos.turn = true;
        

    }

    public static void pato_TNT(){

        Enemigo pato_dinamita = new Enemigo("pato\nTNT",1,20,15);
        com = true;
        Objetos.turn = true;
        

    }


    public static void ataque(){

        System.out.println("el enemigo a atacado inringiendo " + Enemigo.dm);
        Personaje.hp = (Personaje.hp - Enemigo.dm);
        System.out.println("--------------------------------\ntu\thp\tdaño\ntu\t"+ Personaje.hp+"\t"+Personaje.dm+"\n--------------------------------");
        
    }

    
}

