import java.util.*;

public class Objetos {

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

    static Objetos hacha = new Objetos(20,"hacha",false,false);
    static Objetos filete = new Objetos(17,"filete",false,false);
    static Objetos bumeran = new Objetos(16,"bumeran",false,false);
    static Objetos espada = new Objetos(8,"espada",false,false);
    static Objetos shuriken = new Objetos(8,"shuriken",false,false);
    static Objetos escudo = new Objetos(10,"escudo",false,false);
    static Objetos pan = new Objetos(5,"pan",false,false);
    static Objetos esclavo = new Objetos(50,"esclavo",false,false);
    static Objetos armadura = new Objetos(35,"armadura",false,false);
    static Objetos anillo_fuego = new Objetos(50,"anillo_fuego",false,false);
    static Objetos anillo_hielo = new Objetos(50,"anillo_hielo",false,false);
    

    Objetos(int precio,String name,boolean sold,boolean pow){

        this.precio = precio;
        this.name = name;
        this.sold = sold;
        this.pow = pow;

       
       
    }

    public static void tienda(){
        tien = true;
        System.out.println("***************************BIENVENIDO A LA TIENDA***************************");
        if (hacha.sold == false) {
            System.out.println("(1) hacha________"+hacha.precio+" gemas");
        } else {
            System.out.println("(1) hacha________"+hacha.precio+" gemas(sold)");
            
        }
        if (bumeran.sold == false) {
            System.out.println("(2) bumeran_____"+bumeran.precio+" gemas");
        } else {
            System.out.println("(2) bumeran_____"+bumeran.precio+" gemas(sold)");
            
        }
        if (espada.sold == false) {
            System.out.println("(3) espada_______"+espada.precio+" gemas");
        } else {
            System.out.println("(3) espada_______"+espada.precio+" gemas(sold)");
            
        }
        if (Ciclo.barca) {
            if (anillo_fuego.sold == false) {
                System.out.println("(4) anillo_fuego_______"+anillo_fuego.precio+" gemas");
            } else {
                System.out.println("(4) anillo_fuego_______"+anillo_fuego.precio+"(sold) gemas");
                
            }
            if (anillo_hielo.sold == false) {
                System.out.println("(5) anillo_hielo_______"+anillo_hielo.precio+" gemas");
            } else {
                System.out.println("(5) anillo_hielo_______"+anillo_hielo.precio+"(sold) gemas");
                
            }
        }else{
            System.out.println("???");
            System.out.println("???");
        }
        
        if (shuriken.sold == false) {
            System.out.println("(6) shuriken______"+shuriken.precio+" gemas");
        } else {
            System.out.println("(6) shuriken______"+shuriken.precio+" gemas(sold)");
            
        }
        if (escudo.sold == false) {
            System.out.println("(7) escudo_______"+escudo.precio+" gemas");
        } else {
            System.out.println("(7) escudo_______"+escudo.precio+" gemas(sold)");
        }
        if (Ciclo.barca) {
            if (armadura.sold == false) {
                System.out.println("(8) armadura_______"+armadura.precio+" gemas");
            } else {
                System.out.println("(8) armadura_______"+armadura.precio+"(sold) gemas");
                
            }
        }else{
            System.out.println("???");
        }
        if (pan.sold == false) {
            System.out.println("(9) pan__________"+pan.precio+" gemas");
        } else {
            System.out.println("(9) pan__________"+pan.precio+" gemas");
            
        }
        if (filete.sold == false) {
            System.out.println("(10) filete_______"+filete.precio+" gemas");
        } else {
            System.out.println("(10) filete_______"+filete.precio+" gemas");
            
        }
        if (esclavo.sold == false) {
            System.out.println("(11) esclavo_______"+esclavo.precio+" gemas");
        } else {
            System.out.println("(11) esclavo_______"+esclavo.precio+"(sold) gemas");
            System.out.println("");
        }
        
        
        System.out.println("\nDinero disponible: "+ Personaje.din+" gemas");
        System.out.println("para mirar la descripcion escriba el numero del producto.");
        System.out.println("para salir de la tienda (0)");
        try {
            pro = sc1.nextInt();
        } catch (Exception e) {
            System.out.println("orden incorrecta");
            pro = sc3.nextInt();
            //Eventos.esperar(2);
            //tienda();
        }
        
    

        
        switch (pro) {
            case 1:

            if (hacha.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El hacha aumenta el ataque +9, su precio es de "+hacha.precio+" gemas");
                hacha.buy();
            } 
            break;
            case 2:
            if (bumeran.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El bumeran aumenta el ataque +4 y tienes una probabilidad de poder asestar dos golpes, su precio es de  "+bumeran.precio+" gemas");
                bumeran.buy();
            } 
            break;
            case 3:
            if (espada.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("La espada aumenta el ataque en +2, su precio es de "+espada.precio+" gemas");
                espada.buy();
            } 
            break;
            case 6:
            if (shuriken.sold == true) {
                System.out.println("No puedes tener dos unidades de este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("Gracias a estos shurikens tu proximo ataque tendra un daño adicional de +4, su precio es de  "+shuriken.precio+" gemas");
                shuriken.buy();
            }           
            break;
            case 7:
            if (escudo.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El escudo reduce el daño recibido en -1, su precio es de "+escudo.precio+" gemas");
                escudo.buy();
            }           
            break;
            case 9:
            System.out.println("Restaura 5 de salud, su precio es de 5 gemas");
            pan.buy();
            break;
            case 10:
            System.out.println("Restaura 15 de salud, su precio es de  "+filete.precio+" gemas");
            filete.buy();
            break;
            case 11:
            if (esclavo.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("Es un esclavo, quizas te sirva para algo, su precio es de "+esclavo.precio+" gemas");
                esclavo.buy();
            }     
            break;
            case 8:
            if (armadura.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("la armadura reduce el daño recibido en -2, su precio es de "+armadura.precio+" gemas");
                armadura.buy();
            }
            break;
            case 4:
            if (anillo_fuego.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El anillo de fuego quema al enemigo causando un daño residual de 3, su precio es de "+anillo_fuego.precio+" gemas");
                anillo_fuego.buy();
            }
            break;           
            case 5:
            if (anillo_hielo.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                Eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El anillo de hielo puede congelar al enemigo impidiendole atacar, su precio es de "+anillo_hielo.precio+" gemas");
                anillo_hielo.buy();
            }
            break;                      
            case 0:
            tien = false;
            turn = true;

            if(Objetos.hacha.pow){
                Personaje.dm = Personaje.dm + 9;
                Objetos.hacha.pow = false;
            }
    
            if(Objetos.espada.pow){
                Personaje.dm = Personaje.dm + 2;
                Objetos.espada.pow = false;
            }
    
            if(Objetos.pan.pow){
                Personaje.hp = Personaje.hp + 5;
                Objetos.pan.sold = false;
                Objetos.pan.pow = false;
            }
    
            if (Objetos.filete.pow){
                Personaje.hp = Personaje.hp + 15;
                Objetos.filete.sold = false;
                Objetos.filete.pow = false;
            }
    
            if (Objetos.bumeran.pow){
                Personaje.dm = Personaje.dm + 4;
                Objetos.bumeran.pow = false;
            }
    
            if (Objetos.shuriken.pow){
                Personaje.dm = Personaje.dm +4;
                Objetos.shuriken.pow = false;
            }

            if (Objetos.escudo.pow){
                Enemigo.dm = Enemigo.dm -1;
                Objetos.escudo.pow = false;
            }
            if (Objetos.armadura.pow){
                Enemigo.dm = Enemigo.dm -2;
                Objetos.escudo.pow = false;
            }

            if (Objetos.esclavo.pow){
                aldeano = true;
                Objetos.esclavo.pow = false;
            }else{
                System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ Enemigo.name+ "\t\t"+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
            }
            break;
            default:
            System.out.println("orden incorrecta");
            Eventos.esperar(2);
            tienda();
            break;
        }

            
        }
    
        public void buy(){

        System.out.println("deseas comprarlo? (s/n)");
        res = sc2.nextLine();

        if (res.equals("s") && Personaje.din <= this.precio) {
            System.out.println("no tienes dinero, vete a otro lado con tu pobreza");
            Eventos.esperar(2);
            tienda();
        } else if(res.equals("s") && Personaje.din >= this.precio){
            System.out.println("Has adquirido el producto");
            Eventos.esperar(2);
            Personaje.din = Personaje.din - this.precio;
            this.sold = true;
            this.pow = true;
            tienda();
            }
        else if (res.equals("n")) {
            tienda();
            } else {
                System.out.println("orden incorrecta");
            }
        
    }

}
    