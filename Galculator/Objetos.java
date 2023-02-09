import java.util.*;

public class Objetos extends Eventos{

    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc3 = new Scanner(System.in);

    

    

    int precio;
    String name;
    boolean sold;
    boolean pow;
    static boolean tien = false;
    static int pro;
    static String res;
    static boolean algo = true;
    static boolean turn = true;
    static boolean aldeano = false;
    static int panc = 0;
    static int filetesc = 0;
    static int shurikenc = 0;
    static int poc_ataquec = 0;
    static int poc_defensac = 0;
    static int poc_velocidadc = 0;

    static Objetos hacha = new Objetos(20,"hacha",false,false);
    static Objetos filete = new Objetos(20,"filete",false,false);
    static Objetos bumeran = new Objetos(16,"bumeran",false,false);
    static Objetos espada = new Objetos(8,"espada",false,false);
    static Objetos shuriken = new Objetos(5,"shuriken",false,false);
    static Objetos escudo = new Objetos(15,"escudo",false,false);
    static Objetos pan = new Objetos(6,"pan",false,false);
    static Objetos esclavo = new Objetos(50,"esclavo",false,false);
    static Objetos armadura = new Objetos(35,"armadura",false,false);
    static Objetos anillo_fuego = new Objetos(40,"anillo_fuego",false,false);
    static Objetos anillo_hielo = new Objetos(40,"anillo_hielo",false,false);
    static Objetos collar_mistico = new Objetos(40,"anillo_hielo",false,false);
    static Objetos poc_velocidad = new Objetos(15,"poc_velocidad",false,false);
    static Objetos poc_defensa = new Objetos(10,"poc_defensa",false,false);
    static Objetos poc_ataque = new Objetos(20,"poc_ataque",false,false);
    

    Objetos(int precio,String name,boolean sold,boolean pow){

        this.precio = precio;
        this.name = name;
        this.sold = sold;
        this.pow = pow;

       
       
    }

    public static void tienda(){

        if (Ciclo.barca) {
            read("shop");
                System.out.println("");
        } else {
            read("shop2");
            System.out.println("");
        }
        
        
        
        System.out.println("\nDinero disponible: "+ Personaje.din+" gemas");
        System.out.println("para mirar la descripcion escriba el numero del producto.");
        System.out.println("para salir de la tienda (0)");
       
            pro = sc1.nextInt();

        
        switch (pro) {
            case 1:

            if (hacha.sold) {
                System.out.println("No puedes volver a comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("El hacha aumenta el ataque +9, su precio es de "+hacha.precio+" gemas");
                hacha.buy();
            } 
            break;
            case 2:
                System.out.println("El bumeran aumenta el ataque +4 y tienes una probabilidad de poder asestar dos golpes, su precio es de  "+bumeran.precio+" gemas");
                bumeran.buy();
             
            break;
            case 3:
            if (espada.sold) {
                System.out.println("No puedes volver a comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("La espada aumenta el ataque en +2, su precio es de "+espada.precio+" gemas");
                espada.buy();
            } 
            break;
            case 6:
            if (shuriken.sold) {
                System.out.println("No puedes tener dos unidades de este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("Gracias a estos shurikens tu proximo ataque tendra un daño adicional de +4, su precio es de  "+shuriken.precio+" gemas");
                shuriken.buy();
            }           
            break;
            case 10:
            if (escudo.sold) {
                System.out.println("No puedes volver a comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("El escudo reduce el daño recibido en -1, su precio es de "+escudo.precio+" gemas");
                escudo.buy();
            }           
            break;
            case 12:
            System.out.println("Restaura 5 de salud al ser consumido, su precio es de "+pan.precio+" gemas");
            pan.buy();
            break;
            case 13:
            System.out.println("Restaura 15 de salud al ser consumido, su precio es de  "+filete.precio+" gemas");
            filete.buy();
            break;
            case 15:
            if (esclavo.sold) {
                System.out.println("No puedes volver a comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("Es un esclavo, quizas te sirva para algo, su precio es de "+esclavo.precio+" gemas");
                esclavo.buy();
            }     
            break;
            case 11:
            if (armadura.sold || Ciclo.barca == false) {
                System.out.println("No puedes comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("la armadura reduce el daño recibido en -2, su precio es de "+armadura.precio+" gemas");
                armadura.buy();
            }
            break;
            case 4:
            if (anillo_fuego.sold || Ciclo.barca == false) {
                System.out.println("No puedes comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("El anillo de fuego quema al enemigo causando un daño residual de 4, su precio es de "+anillo_fuego.precio+" gemas");
                anillo_fuego.buy();
            }
            break;           
            case 5:
            if (anillo_hielo.sold || Ciclo.barca == false) {
                System.out.println("No puedes comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("El anillo de hielo puede congelar al enemigo impidiendole atacar, su precio es de "+anillo_hielo.precio+" gemas");
                anillo_hielo.buy();
            }
            break;
            case 7:
                System.out.println("Te permite atacar primero al turno siguiente de ser consumido, su precio es de "+poc_velocidad.precio+" gemas");
                poc_velocidad.buy();
            break;
            case 8:
                System.out.println("Reduce el daño recibido en -3 al turno siguiente de ser consumido, su precio es de "+poc_defensa.precio+" gemas");
                poc_defensa.buy();
            break;
            case 9:
                System.out.println("Aumenta en un 50% el daño al turno siguiente de ser consumido, su precio es de "+poc_ataque.precio+" gemas");
                poc_ataque.buy();
            break;
            case 14:
            if (collar_mistico.sold || Ciclo.barca == false) {
                System.out.println("No puedes comprar este objeto");
                esperar(2);
                tienda();
            } else {
                System.out.println("Te permite recuperrar 2 de salud al terminar el turno, su precio es de "+collar_mistico.precio+" gemas");
                collar_mistico.buy();
            }
            break;                      
            case 0:

            if(hacha.pow){
                Personaje.dm = Personaje.dm + 9;
                hacha.pow = false;
            }
    
            if(espada.pow){
                Personaje.dm = Personaje.dm + 2;
                espada.pow = false;
            }
    
            if(pan.pow){
                Personaje.hp = Personaje.hp + 5;
                pan.sold = false;
                pan.pow = false;
            }
    
            if (filete.pow){
                Personaje.hp = Personaje.hp + 15;
                filete.sold = false;
                filete.pow = false;
            }
    
            if (bumeran.pow){
                Personaje.dm = Personaje.dm + 4;
                bumeran.pow = false;
            }

            if (escudo.pow){
                Enemigo.dm = Enemigo.dm -1;
                escudo.pow = false;
            }
            if (armadura.pow){
                Enemigo.dm = Enemigo.dm -2;
                escudo.pow = false;
            }

            if (esclavo.pow){
                aldeano = true;
                esclavo.pow = false;
            }
            break;
            default:
            System.out.println("orden incorrecta");
            esperar(2);
            tienda();
            break;
        }

            
        }
    
        public void buy(){

        System.out.println("deseas comprarlo? (s/n)");
        res = sc2.nextLine();

        if (res.equals("s") && Personaje.din <= this.precio) {
            System.out.println("no tienes dinero, vete a otro lado con tu pobreza");
            esperar(2);
            tienda();
        } else if(res.equals("s") && Personaje.din >= this.precio){
            this.sold = true;
            this.pow = true;
            if (pan.pow) {
                vender(Objetos.pan.pow, Objetos.panc, this.precio);
                Objetos.panc = canti;
                pan.pow = false;
            } else if (filete.pow){
                vender(Objetos.filete.pow, Objetos.filetesc, this.precio);
                Objetos.filetesc = canti;
                filete.pow = false;
            } else if (shuriken.pow){
                vender(Objetos.shuriken.pow, Objetos.shurikenc, this.precio);
                Objetos.shurikenc = canti;
                shuriken.pow = false;
            }
            else if (poc_defensa.pow){
                vender(Objetos.poc_defensa.pow, Objetos.poc_defensac, this.precio);
                Objetos.poc_defensac = canti;
                poc_defensa.pow = false;
            }
            else if (poc_ataque.pow){
                vender(Objetos.poc_ataque.pow, Objetos.poc_ataquec, this.precio);
                Objetos.poc_ataquec = canti;
                poc_ataque.pow = false;
            }
            else if (poc_velocidad.pow){
                vender(Objetos.poc_velocidad.pow, Objetos.poc_velocidadc, this.precio);
                Objetos.poc_velocidadc = canti;
                poc_velocidad.pow = false;
            } else{
                Personaje.din = Personaje.din - this.precio;
                System.out.println("Has adquirido el producto");
                esperar(2);
            }
            tienda();
        }
        else if (res.equals("n")) {
            tienda();
            } else {
                System.out.println("orden incorrecta");
            }
        
    }

}   

    