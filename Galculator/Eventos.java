import java.io.FileReader;
import java.util.*;

public class Eventos {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static Scanner sc3 = new Scanner(System.in);
    static boolean hacha = false;
    static boolean espada = false;
    static boolean escudo = false;
    static int canti;

    public static void read(String nom) {
        try {
            try (FileReader file = new FileReader("Sprites/"+nom+".txt")) {
                int valor=file.read();
                while(valor!=-1){
                    System.out.print((char)valor);
                    valor=file.read();
                }
            }
            } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("");
        
    }
    
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
        System.out.println("Ten cuidado, hemos sido atacados por seres muy peligrosos, los...");
        esperar(5);
        read("patosmut");
        System.out.println("");
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
            esperar(3);
            if (Enemigo.explo) {
                System.out.println("el pato TNT a explotado al morir infligiendo 5 de daño");
                Personaje.hp -= 5;
                Enemigo.explo = false;
            }
            Personaje.din += Enemigo.price;
            Personaje.xp += Enemigo.xp;
            if (Personaje.xp >= (int) (Math.pow(Personaje.lv, 2)*(3/7)+2)) {
                lvup();
                
            }
            System.out.println("------------------------------------------------\nhas ganado " + Enemigo.price+" gemas, te espera otra batalla");
            Objetos.turn = false;
            
        }

    }
    public static void lvup() {
        Personaje.xp =0;
        Personaje.lv ++;
        System.out.println("**has subido a nivel "+ Personaje.lv+"**");
        esperar(3);
        if (Personaje.lv % 2 == 0 && Personaje.lv % 5 == 0) {
            Personaje.hp += 2; 
            Personaje.dm ++;
            System.out.println("VIDA: "+Personaje.hp+" + "+ "2\nDAÑO: "+Personaje.dm+" + "+ "1");
        } else if (Personaje.lv % 5 == 0) { 
            Personaje.hp ++; 
            Personaje.dm += 2;
            System.out.println("VIDA: "+Personaje.hp+" + "+ "1\nDAÑO: "+Personaje.dm+" + "+ "2");
        } else {
            Personaje.hp ++; 
            Personaje.dm ++;
            System.out.println("VIDA: "+Personaje.hp+" + "+ "1\nDAÑO: "+Personaje.dm+" + "+ "1");
        }
        esperar(4);
       
        

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

            
            read("muerte");
            esperar(4);
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

    public static void curar(int salud) {
        System.out.println("has restaurado "+salud+" de salud");
        Personaje.hp += salud;
        esperar(4);
        
    }

    public static void quem(){
        System.out.println("El enemigo ha sufrido 4 de daño por quemaduras");
        Enemigo.hp = Enemigo.hp -4;

    }

    public static void vender(Boolean prod, int cant, int precio) {
        System.out.print("¿Cuantas unidades quieres?: ");
        int can = sc3.nextInt();
        if (Personaje.din >= precio*can) {
            System.out.println("has comprado "+can+ " unidades");
            esperar(3);
            Personaje.din -= (precio*can);
            cant += can;
            canti = cant;
            prod = false;
            
        } else {
            System.out.println("no puedes comprar esa cantidad");
        }
        
    }

    public static void villa() {
        System.out.print("Esta todo destrozado y parece no queda nadie");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        System.out.println("");
        esperar(3);
        Enemigo.pato_mutante();
        read("patomutsp");
        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        while (Objetos.turn) {
            Personaje.accion();
        }
        esperar(3);
        System.out.println("parece que aun quedan algunos enemigos");
        esperar(3);
        Enemigo.pato_mutante();
        read("patomutsp");
        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        while (Objetos.turn) {
            Personaje.accion();
        }
        Enemigo.pato_TNT();
        read("patoTNT");
        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
        while (Objetos.turn) {
            Personaje.accion();
        }
        System.out.println("***Has obtenido algo de tnt del culo del pato***");
        Personaje.tnt = true;
        esperar(3);
        System.out.println("-¡Queda alguien bajo esos escombros!");
        esperar(3);
        System.out.println("¿puede contarme que ha ocurrido?");
        esperar(3);
        System.out.println("-Joven aventurero, hemos sido arrasados por esos patos con los que te acabas de enfrentar.");
        esperar(5);
        System.out.println("Se han llevado a un gran numero de nosotros a ese castillo, pero no puedes entrar porque");
        esperar(5);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(3);
        System.out.println("");
        System.out.println("-Justo se tenia que morir ahora");
        esperar(4);
        System.out.println("Supongo que no me queda más remedio que explorar ese portal");
        Ciclo.portal = true;
        Ciclo.villa = true;
        esperar(4);
    }
    public static void portal(){
        System.out.println("parece un lugar bastante peligroso, esta lleno de cascadas de lava a los lados y un agujero gigante en el suelo al frente.");
        esperar(5);
        System.out.println("Entrare con cuidado para intentar escuchar algo");
        esperar(3);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        System.out.println("");
        esperar(3); 
        System.out.println("parece un hormiguero gigante esta todo lleno de tuneles y habitaciones vacias.");
        esperar(6);
        System.out.println("Escucho a dos guardias hablar");
        esperar(6);
        System.out.println("-Los tres monarcas y el rey ya se han instalado en el castillo.");
        esperar(6);
        System.out.println("-Eso he oido, nosotros también tenemos que mudarnos");
        esperar(6);
        System.out.println("-Seguro que ese sitio es mejor que este agujero lleno de mierda.\nAunque no me creo que hayan encontrado una fuente de comida que también sirva como esclavos");
        esperar(9);
        System.out.println("-Bueno, son seres de otra dimensión quizas si sea posible.");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        System.out.println("");
        esperar(4);
        System.out.println("no me queda más remadio que vencerlos, y para eso necesitro derrotar a su rey en el castillo.");
        esperar(7);
        System.out.println("ire aún más profundo sin hacer ruido.");
        esperar(5);
        System.out.println("¿Qué es este lugar?");
        esperar(4);
        read("door");
        esperar(4);
        System.out.println("la puerta no se habre, menos mal que guarde algo de tnt de aquel pato del poblado");
        esperar(7);
        read("explosion");
        Personaje.tnt = false;
        esperar(4);
        System.out.println("perfecto, ya esta abierta");
        esperar(4);
        System.out.println("¿Qué cojones es esto?");
        esperar(5);
        read("key");
        esperar(5);
        System.out.println("================================================================================================");
        System.out.println("ESTO ES UNA ALERTA A TODOS LOS SOLDADOS, HAY UN INTRUSO QUE HA ENCONTRADO LA LLAVE DEL CASTILLO.");
        System.out.println("================================================================================================");
        System.out.println();
        esperar(7);
        System.out.println("Que alarma más útil porque no tenía ni idea de que era este mierda y no me la iba ha llevar");
        esperar(6);
        System.out.println("***has obtenido la llave***");
        Personaje.key = true;
        esperar(4);
        System.out.println("mierda, han llegado los guardias");
        esperar(4);
        for (int i = 0; i < 6; i++) {
            if (i==3) {
                Enemigo.pato_TNT();
                read("patoTNT");
            } else {
                Enemigo.pato_mutante();
                read("patomutsp");
            }
            System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
            while (Objetos.turn) {
            Personaje.accion();
        }
        }
        esperar(4);
        System.out.println("parece que no quedan más enemigos, ahora toca pirarse de aqui");
        esperar(3);
        Ciclo.castillo = true;
                
    }

    public static void castillo() {
        System.out.println("imagino que están en la parte más alta del castillo");
        esperar(5);
        System.out.println("parece que hay tres puertas, ¿A cual deberia entrar?");
        esperar(5);
        doors();
    }
    public static void doors() {
        read("doors");
    
        int door = sc.nextInt();

        switch (door) {
            case 1:
                if (hacha) {
                    
                    System.out.println("He acabado aquí");
                    
                } else {
                    Enemigo.monarca_hacha();
                    read("monhac");
                    esperar(3);
                    System.out.println("no se quien eres ni como has lleagdo hasta aquí pero voy ha hacerte pezados");
                    esperar(4);
                    System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                while (Objetos.turn) {
                    Personaje.accion();
                }
                hacha = true;
                esperar(3);
                if (hacha && espada && escudo) {
                    System.out.println("Este era el último");
                    peleaf();
                } else {
                    System.out.println("uno menos, vamos a por el siguiente");
                    doors();
                }
                hacha = true;                
            }
                break;
                case 2:
                if (espada) {
                    
                    System.out.println("He acabado aquí");
                    
                } else {
                    Enemigo.monarca_espadas();
                    read("monesp");
                    esperar(3);
                    System.out.println("Espero que me entretengas pequeño intruso");
                    esperar(4);
                    System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                while (Objetos.turn) {
                    Personaje.accion();
                }
                espada = true;
                esperar(3);
                if (hacha && espada && escudo) {
                    System.out.println("Este era el último");
                    peleaf();
                } else {

                    System.out.println("uno menos, vamos a por el siguiente");
                    doors();
                }
                espada = true;
                }
                break;
                case 3:
                if (escudo) {
                    
                    System.out.println("He acabado aquí");
                    
                } else {
                    Enemigo.monarca_escudo();
                    read("monesc");
                    esperar(3);
                    System.out.println("¡intenta atravesar mi escudo si es que puedes!");
                    esperar(4);
                    System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
                while (Objetos.turn) {
                    Personaje.accion();
                }
                escudo = true;
                esperar(3);
                if (hacha && espada && escudo) {
                    System.out.println("Este era el último");
                    peleaf();                
                } else {
                    System.out.println("uno menos, vamos a por el siguiente");
                    doors();

                }
                }
                break;
        
            default:
            System.out.println("puerta incorrecta");
                break;
        }

        
    }

    public static void borrar() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        
    }

    public static void peleaf() {
        System.out.println("se ha habierto una puerta, parece que esta da a la habitación del rey");
        esperar(6);
        read("doorfinal");
        esperar(5);
        System.out.println("es hora de la pelea final");
        esperar(4);
        read("reypato");
        esperar(4);
        System.out.println("si has llegado hasta aquí significa que has vencido a los monarcas.");
        esperar(6);
        System.out.println("Preparate para morir porque no te voya perdonar por lo que has hecho");
        esperar(6);
        Enemigo.rey_pato();
        System.out.println("--------------------------------\nEnemigo\t\t   hp\tdaño\n"+ Enemigo.name+ "\t\t   "+ Enemigo.hp+"\t"+Enemigo.dm+"\n--------------------------------");
            while (Objetos.turn) {
                Personaje.accion();
            }
        esperar(6);
        System.out.println();
        System.out.println("¡Lo he derrotado! Ahora solo tengo que liberar a los aldenos");
        esperar(3);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        esperar(1);
        System.out.print(".");
        System.out.println("");
        esperar(3); 
        System.out.println("Ya estan todos a salvo, ahora debería proseguir mi aventura");
        esperar(4);
        Ciclo.end = true;
    

    }

}
