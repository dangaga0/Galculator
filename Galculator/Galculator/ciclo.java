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
        try{
        switch (alg) {
            case ("s"):
            objetos.algo = false;
            break;
            case ("n"):
            System.out.println("entonces porque juegas?");
            eventos.esperar(3);
            break;
            default:
            System.out.println("orden incorrecta");
            break;

        }
        }catch (Exception e) {
            System.out.println("orden incorrecta");
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
