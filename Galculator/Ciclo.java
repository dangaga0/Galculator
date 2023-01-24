import java.util.*;

public class Ciclo {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in); 
    static Personaje p1 = new Personaje();

    static String vol;
    static boolean pradera = false;
    static boolean bosque = false;
    static boolean montaña = false;
    static boolean rio = false;
    static boolean barca = false;


    public static void reloj(){
    while(Objetos.algo){

        pradera = false;
        bosque = false;
        montaña = false;
        rio = false;
        System.out.println("Donde quieres ir a explorar?\n-Pradera (p)\n-Bosque (b)\n-Montaña (m)\n-Rio (r)");
        String alg = sc.nextLine();

        switch (alg) {
            case ("p"):
            Objetos.algo = false;
            pradera = true;
            break;
            case ("b"):
            Objetos.algo = false;
            bosque = true;
            break;
            case ("m"):
            Objetos.algo = false;
            montaña = true;
            break;
            case ("r"):
            if (barca) {
                Objetos.algo = false;
                rio = true;
            } else {
                System.out.println("No puedes cruzar el rio sin una barca");
                Eventos.esperar(3);
            }
            break;
            default:
            System.out.println("orden incorrecta");

        }
        }
        Enemigo.com = true;

    

        while(Enemigo.com){
            int ene = rm.nextInt(3);

            if (pradera) {
                switch (ene){
                    case 1 : Enemigo.pato();
                    break;
                    case 2 : Enemigo.slime();
                    break;
                    case 0 : Enemigo.pajaro();
                    break;
                }
                
            } else if(bosque){
                switch (ene){
                    case 1 : Enemigo.mono();
                    break;
                    case 2 : Enemigo.serpiente();
                    break;
                    case 0 : Enemigo.lobo();
                    break;
                }
                
            }else if(montaña){
                switch (ene){
                    case 1 : Enemigo.oso();
                    break;
                    case 2 : Enemigo.golem();
                    break;
                    case 0 : Enemigo.dragon();
                    break;
                }
            }else if(rio){
                System.out.println("C0NTINUARA...");
                Game.inf = 0;

            }

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");


            Objetos.turn = true;

            while(Objetos.turn){
            Personaje.accion();

            while (Objetos.tien) {

                }
            while(Objetos.aldeano){
                Eventos.aldeano();
                Objetos.aldeano = false;
                Objetos.turn = false;
                Enemigo.com = false;
                Objetos.algo = true;
                Ciclo.reloj();

            }
            }

        }

        
    }
}
