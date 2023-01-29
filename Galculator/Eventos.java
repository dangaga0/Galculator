import java.io.FileReader;
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

    public static void vex(){
            System.out.println("quieres ir a otro lugar a explorar (s/n)");
            String res = sc.nextLine();

            switch (res) {
                case "s":
                    Objetos.algo = true;
                    Ciclo.reloj();
                    break;
                case "n":
                    Ciclo.reloj();
                    break;
                
                default: System.out.println("orden incorrecta");
                    break;
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
            Objetos.turn = false;
            
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
            Ciclo.rio = false;
            Ciclo.barca = false;
            Ciclo.portal = false;
            Ciclo.castillo = false;
            Ciclo.villa = false;
            Ciclo.portal2 = false;


            Personaje.din = 0;
            Personaje.hp = 10;
            Personaje.dm = 5;

            
            try {
                try (FileReader file = new FileReader("muerte.txt")) {
                    int valor=file.read();
                    while(valor!=-1){
                        System.out.print((char)valor);
                        valor=file.read();
                    }
                }
                } catch (Exception e) {
                System.out.println(e);
            }
            Eventos.esperar(4);
            System.out.println("");
            System.out.println("pulse cualquier letra para regresar");
            
            String vol = sc.nextLine();
            
            if (!vol.equals("")) {
                Ciclo.reloj();
            } else{
                System.out.println("letra, no numero retrasado");
            } 
        }
        
    }

    public static void quem(){
        System.out.println("El enemigo ha sufrido 3 de daño por quemaduras");
        Enemigo.hp = Enemigo.hp -2;

    }

    public static void villa() {
        System.out.print("Esta todo destrozado y parece no queda nadie");
                Eventos.esperar(1);
                System.out.print(".");
                Eventos.esperar(1);
                System.out.print(".");
                Eventos.esperar(1);
                System.out.print(".");
                System.out.println("");
                Eventos.esperar(3);
                Enemigo.pato_mutante();
                System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");                    while (Objetos.turn) {
                    Personaje.accion();
                }
                Eventos.esperar(3);
                System.out.println("parece que aun quedan algunos enemigos");
                Eventos.esperar(3);
                Enemigo.pato_mutante();
                System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");                    while (Objetos.turn) {
                    Personaje.accion();
                }
                Enemigo.pato_TNT();
                System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");                    while (Objetos.turn) {
                    Personaje.accion();
                }
                Eventos.esperar(3);
                System.out.println("-¡Queda alguien bajo esos escombros!");
                Eventos.esperar(3);
                System.out.println("¿puede contarme que ha ocurrido?");
                Eventos.esperar(3);
                System.out.println("-Joven aventurero, hemos sido arrasados por esos patos con los que te acabas de enfrentar.");
                Eventos.esperar(5);
                System.out.println("Se han llevado a un gran numero de nosotros a ese castillo, pero no puedes entrar porque");
                Eventos.esperar(5);
                System.out.print(".");
                Eventos.esperar(1);
                System.out.print(".");
                Eventos.esperar(1);
                System.out.print(".");
                Eventos.esperar(3);
                System.out.println("");
                System.out.println("-Justo se tenia que morir ahora, que guion tan original");
                Eventos.esperar(4);
                System.out.println("Supongo que no me queda más remedio que explorar ese portal");
                Ciclo.portal = true;
                Ciclo.villa = true;
                Eventos.esperar(4);
    }
    public static void portal(){

    }

}
