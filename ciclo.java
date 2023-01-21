import java.util.*;

public class ciclo {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in); 
    static personaje p1 = new personaje();

    static String vol;

    public static void reloj(){
    while(objetos.algo){

        System.out.println("Deseas entablar una batalla? (s/n)");
        String alg = sc.nextLine();

        switch (alg) {
            case ("s"):
            objetos.algo = false;
            break;
            case ("n"):
            System.out.println("entonces porque juegas?");
            break;

        }
        }
        enemigo.com = true;

    

        while(enemigo.com){

            int ene = rm.nextInt(3);

        switch (ene){
            case 1 : enemigo.pato();
            break;
            case 2 : enemigo.serpiente();
            break;
            case 0 : enemigo.dragon();
            break;
        }

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n----------------------------------------");

            objetos.turn = true;

            while(objetos.turn){
            personaje.accion();

                if (personaje.hp <=0 || enemigo.hp <=0) {  
                    objetos.turn = false;   
                    }                
            }
        
            if (personaje.hp <= 0) {
                objetos.turn = false;
                enemigo.com = false;
                objetos.algo = true;
                objetos.pan.sold = false;
                objetos.hacha.sold = false;
                objetos.escudo.sold = false;
                objetos.espada.sold = false;
                objetos.shuriken.sold = false;
                objetos.filete.sold = false;
                objetos.bumeran.sold = false;
                personaje.din = 0;
                personaje.hp = 10;
                personaje.dm = 5;

                
                System.out.println("HAS MUERTO");
                System.out.println("pulse para volver a jugar");
                
                vol = sc.nextLine();
                
                if (!vol.equals("")) {
                    reloj();
                }


            } else if(enemigo.hp <= 0){
                personaje.din = personaje.din + enemigo.price;
                System.out.println("------------------------------------------------\nhas ganado " + enemigo.price+" gemas, te espera otra batalla");
            }

        }

        while (objetos.tien = true) {

        }
    }
}
