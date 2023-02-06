import java.util.*;


public class Enemigo{

    static Random rm = new Random();

    static String name;
    static boolean turn = false; 
    static int hp;
    static int dm;
    static boolean vivo = true;
    static boolean com = false;
    static int price;
    static boolean explo =false;
    static int xp = 0;
 

    Enemigo(String name,int hp,int dm,int price, int xp){


        this.name = name;
        this.hp = hp;
        if(Objetos.armadura.sold){
            this.dm = dm -3;
        } else if(Objetos.escudo.sold){
            this.dm = dm -1;
        }else{
            this.dm = dm;}
        
        this.price = price;
        this.xp = xp;
    }
        
    

    public static void pato(){

        Enemigo pato = new Enemigo("pato",7,2,4,3);
        com = true;
        Objetos.turn = true;

    }

    public static void rabbit(){

        Enemigo rabbit = new Enemigo("rabbit",8,2,5,4);
        com = true;
        Objetos.turn = true;
    }

    public static void pajaro(){

        Enemigo slime = new Enemigo("pajaro",6,3,4,3);
        com = true;
        Objetos.turn = true;


    }

    public static void buitre(){

        Enemigo buitre = new Enemigo("buitre",11,7,12,7);
        com = true;
        Objetos.turn = true;


    }

    public static void camello(){

        Enemigo camello = new Enemigo("camello",12,6,11,7);
        com = true;
        Objetos.turn = true;
        
    }

    public static void skeleton(){

        Enemigo skeleton = new Enemigo("skeleton",8,10,10,8);
        com = true;
        Objetos.turn = true;
        

    }

    public static void dragon(){

        Enemigo dragon = new Enemigo("dragon",40,15,25,20);
        com = true;
        Objetos.turn = true;
        
    }

    public static void ryno(){

        Enemigo ryno = new Enemigo("ryno",30,9,15,13);
        com = true;
        Objetos.turn = true;
        

    }

    public static void unicorn(){

        Enemigo unicorn = new Enemigo("unicornio",29,10,15,13);
        com = true;
        Objetos.turn = true;
       
    }

    public static void pato_mutante(){

        Enemigo pato_mutante = new Enemigo("pato\nmutante",20,10,13,15);
        com = true;
        Objetos.turn = true;
        

    }

    public static void pato_TNT(){

        Enemigo patoTNT = new Enemigo("pato\nTNT",1,20,15,17);
        com = true;
        Objetos.turn = true;
        explo = true;
        

    }

    public static void monarca_hacha(){

        Enemigo monarca_hacha = new Enemigo("monarca\nhachas",45,30,45,35);
        com = true;
        Objetos.turn = true;
        

    }

    public static void monarca_espadas(){

        Enemigo monarca_espadas = new Enemigo("monarca\nespadas",55,20,45,35);
        com = true;
        Objetos.turn = true;
        

    }

    public static void monarca_escudo(){

        Enemigo monarca_escudo = new Enemigo("monarca\nescudos",100,10,47,35);
        com = true;
        Objetos.turn = true;
        

    }

    public static void rey_pato(){

        Enemigo rey_pato = new Enemigo("rey\npato",60,27,99,99);
        com = true;
        Objetos.turn = true;
        

    }


    public static void ataque(){
        if (dm <0) {
            dm = 0;
        }
        System.out.println("el enemigo a atacado inflingiendo " + Enemigo.dm);
        Personaje.hp = (Personaje.hp - Enemigo.dm);
        System.out.println("--------------------------------\ntu\thp\tdaño\ntu\t"+ Personaje.hp+"\t"+Personaje.dm+"\n--------------------------------");
        
    }

    
}

