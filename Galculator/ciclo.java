import java.util.*;

public class ciclo {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in); 
    static personaje p1 = new personaje();

    static String vol;
    static boolean pradera = false;
    static boolean bosque = false;
    static boolean montaña = false;
    static boolean rio = false;
    static boolean barca = false;


    public static void reloj(){
    while(objetos.algo){

        pradera = false;
        bosque = false;
        montaña = false;
        rio = false;
        System.out.println("Donde quieres ir a explorar?\n-Pradera (p)\n-Bosque (b)\n-Montaña (m)\n-Rio (r)");
        String alg = sc.nextLine();

        switch (alg) {
            case ("p"):
            objetos.algo = false;
            pradera = true;
            break;
            case ("b"):
            objetos.algo = false;
            bosque = true;
            break;
            case ("m"):
            objetos.algo = false;
            montaña = true;
            break;
            case ("r"):
            if (barca) {
                objetos.algo = false;
                rio = true;
            } else {
                System.out.println("No puedes cruzar el rio sin una barca");
                eventos.esperar(3);
            }
            break;
            default:
            System.out.println("orden incorrecta");

        }
        }
        enemigo.com = true;

    

        while(enemigo.com){
            int ene = rm.nextInt(3);

            if (pradera) {
                switch (ene){
                    case 1 : enemigo.pato();
                    break;
                    case 2 : enemigo.slime();
                    break;
                    case 0 : enemigo.pajaro();
                    break;
                }
                
            } else if(bosque){
                switch (ene){
                    case 1 : enemigo.mono();
                    break;
                    case 2 : enemigo.serpiente();
                    break;
                    case 0 : enemigo.lobo();
                    break;
                }
                
            }else if(montaña){
                switch (ene){
                    case 1 : enemigo.oso();
                    break;
                    case 2 : enemigo.golem();
                    break;
                    case 0 : enemigo.dragon();
                    break;
                }
            }else if(rio){
                System.out.println("C0NTINUARA...");
                Game.inf = 0;

            }

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");


            objetos.turn = true;

            while(objetos.turn){
            personaje.accion();

            while (objetos.tien) {

                }
            while(objetos.aldeano){
                eventos.aldeano();
                objetos.aldeano = false;
                objetos.turn = false;
                enemigo.com = false;
                objetos.algo = true;
                ciclo.reloj();

            }
            }

        }

        
    }
}
