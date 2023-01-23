import java.util.*;

public class eventos {

    static Scanner sc = new Scanner(System.in);
    
    public static void aldeano(){

        esperar(4);
        System.out.println("Parece que el esclavo quiere decirte algo.");
        esperar(5);
        System.out.println("Por favor, ayudame.");
        esperar(4);
        System.out.println("Mi poblado ha sido arrasado y soy el unico que ha podido escapar, necesito que salves a mi familia.");
        esperar(6);
        System.out.println("El poblado se encuentra al otro lado de rio, para cruzar necesitaras esta barca.");
        esperar(5);
        System.out.println("**has obtenido una barca**");
        ciclo.barca = true;
        esperar(3);
        System.out.println("Ten cuidado, hemos sido atacados por seres muy peligrosos...");
        esperar(5);
        System.out.println("LOS PATOS MUTANTES.");
        esperar(3);

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
            System.out.println("quieres ir a otro lugar a explorar (s/n)");
            String res = sc.nextLine();

            try {
                switch (res) {
                    case "s":
                        objetos.algo = true;
                        ciclo.reloj();
                        break;
                    case "n":
                        ciclo.reloj();
                
                    default: System.out.println("orden incorrecta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("orden incorrecta");
            }
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
