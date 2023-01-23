import java.util.*;

public class ciclo {

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in); 
    static personaje p1 = new personaje();

    static String vol;
    static boolean pradera = false;
    static boolean bosque = false;
    static boolean montaña = false;


    public static void reloj(){
    while(objetos.algo){

        System.out.println("Donde deseas buscar batalla?\n-Pradera (p)\n-Bosque (b)\n-Montaña (m)");
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
            }else{
                System.out.println("orden incorrecta");
            }

        System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");

            objetos.turn = true;

            while(objetos.turn){
            personaje.accion();

            while (objetos.tien) {

                }     
            }

        }

        
    }
}
