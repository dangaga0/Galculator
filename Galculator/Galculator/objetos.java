import java.util.*;

public class objetos {

    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc3 = new Scanner(System.in);

    

    static objetos hacha = new objetos(20,"hacha",false,false);
    static objetos filete = new objetos(17,"filete",false,false);
    static objetos bumeran = new objetos(12,"bumeran",false,false);
    static objetos espada = new objetos(8,"espada",false,false);
    static objetos shuriken = new objetos(8,"shuriken",false,false);
    static objetos escudo = new objetos(10,"escudo",false,false);
    static objetos pan = new objetos(5,"pan",false,false);
    static objetos esclavo = new objetos(50,"esclavo",false,false);
    

    int precio;
    String name;
    boolean sold;
    boolean pow;
    static boolean tien = false;
    static int pro;
    static String res;
    static boolean algo = true;
    static boolean turn = true;


    objetos(int precio,String name,boolean sold,boolean pow){

        this.precio = precio;
        this.name = name;
        this.sold = sold;
        this.pow = pow;

       
       
    }

    public static void tienda(){
        tien = true;
        System.out.println("***************************BIENVENIDO A LA TIENDA***************************");
        if (hacha.sold == false) {
            System.out.println("(1) hacha________20 gemas");
        } else {
            System.out.println("(1) hacha________20 gemas(sold)");
            
        }
        if (bumeran.sold == false) {
            System.out.println("(2) bumeran_____16 gemas");
        } else {
            System.out.println("(2) bumeran_____16 gemas(sold)");
            
        }
        if (espada.sold == false) {
            System.out.println("(3) espada_______8 gemas");
        } else {
            System.out.println("(3) espada_______8 gemas(sold)");
            
        }
        if (shuriken.sold == false) {
            System.out.println("(4) shuriken______8 gemas");
        } else {
            System.out.println("(4) shuriken______8 gemas(sold)");
            
        }
        if (escudo.sold == false) {
            System.out.println("(5) escudo_______10 gemas");
        } else {
            System.out.println("(5) escudo_______10 gemas(sold)");
            
        }
        if (pan.sold == false) {
            System.out.println("(6) pan__________5 gemas");
        } else {
            System.out.println("(6) pan__________5 gemas");
            
        }
        if (filete.sold == false) {
            System.out.println("(7) filete_______17 gemas");
        } else {
            System.out.println("(7) filete_______17 gemas");
            
        }
        if (esclavo.sold == false) {
            System.out.println("(8) esclavo_______50 gemas");
        } else {
            System.out.println("(8) esclavo_______50(sold) gemas");
            
        }
        
        
        System.out.println("Dinero disponible: "+ personaje.din+" gemas");
        System.out.println("para mirar la descripcion escriba el numero del producto.");
        System.out.println("para salir de la tienda (0)");
        try {
            pro = sc1.nextInt();
        } catch (Exception e) {
            System.out.println("orden incorrecta");
            pro = sc3.nextInt();
            //eventos.esperar(2);
            //tienda();
        }
        
    

        
        switch (pro) {
            case 1:

            if (hacha.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El hacha aumenta el ataque +9, su precio es de "+hacha.precio+" gemas");
                hacha.buy();
            } 
            break;
            case 2:
            if (bumeran.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El bumeran aumenta el ataque +4 y tienes una probabilidad de poder asestar dos golpes, su precio es de  "+bumeran.precio+" gemas");
                bumeran.buy();
            } 
            break;
            case 3:
            if (espada.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                eventos.esperar(2);
                tienda();
            } else {
                System.out.println("La espada aumenta el ataque en +2, su precio es de "+espada.precio+" gemas");
                espada.buy();
            } 
            break;
            case 4:
            if (shuriken.sold == true) {
                System.out.println("No puedes tener dos unidades de este objeto");
                eventos.esperar(2);
                tienda();
            } else {
                System.out.println("Gracias a estos shurikens tu proximo ataque tendra un daño adicional de +4, su precio es de  "+shuriken.precio+" gemas");
                shuriken.buy();
            }           
            break;
            case 5:
            if (escudo.sold == true) {
                System.out.println("No puedes volver a comprar este objeto");
                eventos.esperar(2);
                tienda();
            } else {
                System.out.println("El escudo reduce el daño recibido en -1, su precio es de "+escudo.precio+" gemas");
                escudo.buy();
            }           
            break;
            case 6:
            System.out.println("Restaura 5 de salud, su precio es de 5 gemas");
            pan.buy();
            break;
            case 7:
            System.out.println("Restaura 15 de salud, su precio es de  "+filete.precio+" gemas");
            filete.buy();
            break;
            case 0:
            tien = false;

            if(objetos.hacha.pow){
                personaje.dm = personaje.dm + 9;
                objetos.hacha.pow = false;
            }
    
            if(objetos.espada.pow){
                personaje.dm = personaje.dm + 2;
                objetos.espada.pow = false;
            }
    
            if(objetos.pan.pow){
                personaje.hp = personaje.hp + 5;
                objetos.pan.sold = false;
                objetos.pan.pow = false;
            }
    
            if (objetos.filete.pow){
                personaje.hp = personaje.hp + 15;
                objetos.filete.sold = false;
                objetos.filete.pow = false;
            }
    
    
            if (objetos.bumeran.pow){
                personaje.dm = personaje.dm + 4;
                objetos.bumeran.pow = false;
            }
    
            if (objetos.shuriken.pow){
                personaje.dm = personaje.dm +4;
                objetos.shuriken.pow = false;
            }

            if (objetos.escudo.pow){
                enemigo.dm = enemigo.dm -1;
                objetos.escudo.pow = false;
            }

            System.out.println("--------------------------------\nenemigo\t\thp\tdaño\n"+ enemigo.name+ "\t\t"+ enemigo.hp+"\t"+enemigo.dm+"\n--------------------------------");
            break;
            default:
            System.out.println("orden incorrecta");
            eventos.esperar(2);
            tienda();
            break;
        }

            
        }
    
        public void buy(){

        System.out.println("deseas comprarlo? (s/n)");
        res = sc2.nextLine();

        if (res.equals("s") && personaje.din <= this.precio) {
            System.out.println("no tienes dinero, vete a otro lado con tu pobreza");
            eventos.esperar(2);
            tienda();
        } else if(res.equals("s") && personaje.din >= this.precio){
            System.out.println("Has adquirido el producto");
            eventos.esperar(2);
            personaje.din = personaje.din - this.precio;
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
    