
import java.util.*;




public class Ciclo{

    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in); 
    static Scanner sc2 = new Scanner(System.in);


    static String vol;
    static boolean pradera = false;
    static boolean desierto = false;
    static boolean montaña = false;
    static boolean rio = false;
    static boolean barca = false;
    static boolean portal = false;
    static boolean castillo = false;
    static boolean villa = false;
    static boolean portal2 = false;




public static void reloj(){
while(Objetos.algo){

    pradera = false;
    desierto = false;
    montaña = false;
    rio = false;
    System.out.println("Donde quieres ir a explorar?");
    Eventos.esperar(2);
    Eventos.read("montes");
    Eventos.esperar(2);
    Eventos.read("desierto");
    Eventos.esperar(2);
    Eventos.read("pradera");
    Eventos.esperar(2);
    Eventos.read("rio");
    Eventos.esperar(1);
    System.out.println("");

    String alg = sc.nextLine();

    switch (alg) {
        case ("p"):
        Objetos.algo = false;
        pradera = true;
        break;
        case ("d"):
        Objetos.algo = false;
        desierto = true;
        break;
        case ("m"):
        Objetos.algo = false;
        montaña = true;
        break;
        case ("r"):
        if (barca) {
            System.out.println("has atravesado el rio");
            Eventos.esperar(3);
            rio = true;
        } else {
            System.out.println("No puedes cruzar el rio sin una barca");
            Eventos.esperar(3);
        }
        break;
        default:
        System.out.println("orden incorrecta");

    }
    while (rio) {

        System.out.println("Donde quieres ir a explorar?");
        Eventos.esperar(2);
        Eventos.read("castillo");
        Eventos.esperar(2);
        Eventos.read("villa");
        Eventos.esperar(2);
        Eventos.read("portal");
        Eventos.esperar(2);
        Eventos.read("rio");
        Eventos.esperar(1);
        System.out.println("");
    



        String alg2 = sc2.nextLine();

        switch (alg2) {
            case "v":
            if (villa) {
                System.out.println("parece que no queda mas por hacer");
                Eventos.esperar(3);
                
            } else {
                Eventos.villa();
            }
                break;
            case "p":
                if (portal) {
                    System.out.println("entraste al portal");
                    Eventos.esperar(5);
                    if (portal2) {
                        
                    } else {
                        Eventos.portal();
                    }

                } else {
                    System.out.println("Parece peligroso deberia ir a explorar la villa primero");
                    Eventos.esperar(3);
                }
                break;
            case "c":
                if (castillo) {
                System.out.println("Parece el artefacto encajo, has abierto la puerta");
                Eventos.esperar(5);

                } else {
                System.out.println("La puerta esta bloqueada, necesito algo para abrila");
                Eventos.esperar(3);
                }
                break;
            case "r":
            System.out.println("has regresado");
            Eventos.esperar(2);
            rio = false;
            default:
                break;
        }




    }
    


        
    }


    Enemigo.com = true;



    while(Enemigo.com){
        int ene = rm.nextInt(3);

        if (pradera) {
            switch (ene){
                case 1 : Enemigo.pato();
                Eventos.read("patisp");
                System.out.println("");
                break;
                case 2 : Enemigo.rabbit();
                Eventos.read("rabbit");
                System.out.println("");
                break;
                case 0 : Enemigo.pajaro();
                Eventos.read("bird");
                System.out.println("");
                break;
            }
            
        } else if(desierto){
            switch (ene){
                case 1 : Enemigo.skeleton();
                Eventos.read("skeleton");
                System.out.println("");
                break;
                case 2 : Enemigo.buitre();
                Eventos.read("buitre");
                System.out.println("");
                break;
                case 0 : Enemigo.camello();
                Eventos.read("camel");
                System.out.println("");
                break;
            }
            
        }else if(montaña){
            switch (ene){
                case 1 : Enemigo.unicorn();
                Eventos.read("unicorn");
                System.out.println("");
                break;
                case 2 : Enemigo.ryno();
                Eventos.read("ryno");
                System.out.println("");
                break;
                case 0 : Enemigo.dragon();
                Eventos.read("dragon");
                System.out.println("");
                break;
            }
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

