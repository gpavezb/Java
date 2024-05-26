import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    public String nombreP;
    public Integer vidaP;
    public Integer danioP;
    public List<Objetos> inventario;

    public Jugador(String nombreP, Integer vidaP, Integer danioP) {
        this.nombreP = nombreP;
        this.vidaP = vidaP;
        this.danioP = danioP;
        this.inventario = new ArrayList<>();
    }

    public Jugador() {
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Integer getVidaP() {
        return vidaP;
    }

    public void setVidaP(Integer vidaP) {
        this.vidaP = vidaP;
    }

    public Integer getDanioP() {
        return danioP;
    }

    public void setDanioP(Integer danioP) {
        this.danioP = danioP;
    }

    public List<Objetos> getInventario() {
        return inventario;
    }

    public void setInventario(List<Objetos> inventario) {
        this.inventario = inventario;

    }

    public void pelea() {

        System.out.println("Entraste a una pelea contra " + Enemigo.nombreE);
        Scanner sc = new Scanner(System.in);
        //int fight;
        System.out.println("Vas a pelear? 1.- Si , 2.-defenderse y correr");
        Integer fight = sc.nextInt();
        if (fight == 1) {
            vidaP = vidaP - Enemigo.danioE;
            System.out.println("Has recibido " + Enemigo.danioE + " de " + Enemigo.nombreE);
            System.out.println("Tienes solamente: "+vidaP+" de vida");
            if (vidaP <= 0) {
                System.out.println("Tu vida ha llegado a 0. ¡Has perdido!");
            } else {
                System.out.println("Wow, Has ganado a " + Enemigo.nombreE);
            }
        } else {
            Integer bloqueo = vidaP-5;
            System.out.println("Has quedado con " + bloqueo + " de vida");
            //System.out.println("Te has quedado con "+ bloqueo+" de vida");
        }
    }

    public void recogerItem(Objetos Item) {
        inventario.add(Item);
        System.out.println(" has recogido: " + Item.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario :");
        for (Objetos item : inventario) {
            System.out.println("- " + item.getNombre());
        }
    }

    }

