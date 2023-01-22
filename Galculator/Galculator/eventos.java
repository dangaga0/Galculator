import java.util.*;

public class eventos {

    static Scanner sc = new Scanner(System.in);
    
    public static void aldeano(){

        System.out.println("");


    }

    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 500);
         } catch (Exception e) {
            System.out.println(e);
         }
    }   

    public static void enem(){
        if(enemigo.hp <= 0){
            if (objetos.shuriken.sold) {
                objetos.shuriken.sold = false;
                personaje.dm = personaje.dm - 4;
            }
            eventos.esperar(3);
            personaje.din = personaje.din + enemigo.price;
            System.out.println("------------------------------------------------\nhas ganado " + enemigo.price+" gemas, te espera otra batalla");
            ciclo.reloj();
        }

    }

    public static void perm(){
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
            eventos.esperar(4);
            System.out.println("pulse cualquier letra para regresar");
            
            String vol = sc.nextLine();
            
            if (!vol.equals("")) {
                ciclo.reloj();
            } else{
                System.out.println("letra, no numero retrasado");
            } 
        }
        
    }

}
