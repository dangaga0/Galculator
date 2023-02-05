
import java.util.*;




public class Ciclo extends Eventos{

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
    static boolean end = false;





public static void reloj(){
while(Objetos.algo){

    pradera = false;
    desierto = false;
    montaña = false;
    rio = false;
    System.out.println("Donde quieres ir a explorar?");
    esperar(1);
    read("montes");
    esperar(1);
    read("desierto");
    esperar(1);
    read("pradera");
    esperar(1);
    read("tienda");
    esperar(1);
    read("rio");
    esperar(1);
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
        case "t":
            Objetos.tienda();
            break;
        case ("r"):
        if (barca) {
            System.out.println("has atravesado el rio");
            esperar(3);
            rio = true;
        } else {
            System.out.println("No puedes cruzar el rio sin una barca");
            esperar(3);
        }
        break;
        default:
        System.out.println("orden incorrecta");

    }
    while (rio) {

        System.out.println("Donde quieres ir a explorar?");
        esperar(1);
        read("castillo");
        esperar(1);
        read("villa");
        esperar(1);
        read("portal");
        esperar(1);
        read("tienda");
        esperar(1);
        read("rio");
        esperar(1);
        System.out.println("");
    



        String alg2 = sc2.nextLine();

        switch (alg2) {
            case "v":
            if (end) {
                read("villan");
                esperar(4);
                System.out.println("parece que la villa ya ha vuelto a retomar la normalidad, aunque con todas las victimas todo el mundo esta muy triste");
                esperar(6);
                System.out.println("espero que no tengan más problemas de aqui en adelante");
                esperar(3);
            } else  if (villa) {
                System.out.println("parece que no queda mas por hacer");
                esperar(3);
                read("tumbas");
                esperar(3);
                

            } else {
                villa();
            }
                break;

            case "p":
                if (portal2) {
                    System.out.println("aquí ya no queda nadie");
                    
                } else if (portal) {
                    System.out.println("entraste al portal");
                    esperar(5);
                    if (portal2) {
                        
                    } else {
                        
                        portal();
                    }

                } else {
                    System.out.println("Parece peligroso deberia ir a explorar la villa primero");
                    esperar(3);
                }
                break;
                
            case "c":
            if (end) {
                System.out.println("Parece que el rey de los aldeanos y su familia se han mudado a este castillo");

            } else if (castillo) {
                System.out.println("Los monarcas y el rey parecen rivales muy poderosos,¿Estoy realmente preparado? (s/n)");
                String res = sc.nextLine();

                switch (res) {
                    case "s":
                    System.out.println("Parece la llave ha encajado y la puerta se ha abierto");
                    esperar(5);
                    castillo();
                        break;
                    case "n":
                       
                        break;
                    
                    default: System.out.println("orden incorrecta");
                        break;
                }
          
            } else {
            System.out.println("La puerta esta bloqueada, necesito algo para abrila");
            esperar(3);
            }
            break;

            case "t":
            Objetos.tienda();
            break;
                
            case "r":
            System.out.println("has regresado");
            esperar(2);
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
                read("patisp");
                System.out.println("");
                break;
                case 2 : Enemigo.rabbit();
                read("rabbit");
                System.out.println("");
                break;
                case 0 : Enemigo.pajaro();
                read("bird");
                System.out.println("");
                break;
            }
            
        } else if(desierto){
            switch (ene){
                case 1 : Enemigo.skeleton();
                read("skeleton");
                System.out.println("");
                break;
                case 2 : Enemigo.buitre();
                read("buitre");
                System.out.println("");
                break;
                case 0 : Enemigo.camello();
                read("camel");
                System.out.println("");
                break;
            }
            
        }else if(montaña){
            switch (ene){
                case 1 : Enemigo.unicorn();
                read("unicorn");
                System.out.println("");
                break;
                case 2 : Enemigo.ryno();
                read("ryno");
                System.out.println("");
                break;
                case 0 : Enemigo.dragon();
                read("dragon");
                System.out.println("");
                break;
            }
        }

        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");

        Objetos.turn = true;

        while(Objetos.turn){
        Personaje.accion();

        

        while(Objetos.aldeano){
            aldeano();
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

