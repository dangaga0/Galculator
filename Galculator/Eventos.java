import java.util.*;

public class Eventos {

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
        Ciclo.barca = true;
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
        if(Enemigo.hp <= 0){
            if (Objetos.shuriken.sold) {
                Objetos.shuriken.sold = false;
                Personaje.dm = Personaje.dm - 4;
            }
            Eventos.esperar(3);
            Personaje.din = Personaje.din + Enemigo.price;
            System.out.println("------------------------------------------------\nhas ganado " + Enemigo.price+" gemas, te espera otra batalla");
            System.out.println("quieres ir a otro lugar a explorar (s/n)");
            String res = sc.nextLine();

            try {
                switch (res) {
                    case "s":
                        Objetos.algo = true;
                        Ciclo.reloj();
                        break;
                    case "n":
                        Ciclo.reloj();
                
                    default: System.out.println("orden incorrecta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("orden incorrecta");
            }
        }

    }

    public static void perm(){
        if (Personaje.hp <= 0) {
            Objetos.turn = false;
            Enemigo.com = false;
            Objetos.algo = true;
            Objetos.pan.sold = false;
            Objetos.hacha.sold = false;
            Objetos.escudo.sold = false;
            Objetos.espada.sold = false;
            Objetos.shuriken.sold = false;
            Objetos.filete.sold = false;
            Objetos.bumeran.sold = false;
            Personaje.din = 0;
            Personaje.hp = 10;
            Personaje.dm = 5;

            
            System.out.println("HAS MUERTO");
            Eventos.esperar(4);
            System.out.println("pulse cualquier letra para regresar");
            
            String vol = sc.nextLine();
            
            if (!vol.equals("")) {
                Ciclo.reloj();
            } else{
                System.out.println("letra, no numero retrasado");
            } 
        }
        
    }

}
