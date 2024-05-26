import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre, viajero");
        String nombrePJ = sc.nextLine();
        Jugador jugador = new Jugador(nombrePJ, 100, 30);
        Enemigo enemigo = new Enemigo("Mapache con metralleta", 30, 25);
        // Enemigo enemigo2 =new Enemigo("Oso",30,20 );
        Item espada = new Item("Espada");
        Item escudo = new Item("Escudo");
        //Tesoros oro= new Tesoros("oro");


        Sala[] dungeon = {
                new SalaEnemigo(),
                new SalaVacia(),
                new SalaTesoro(escudo),
                new SalaEnemigo(),
                new SalaVacia(),
                new SalaTesoro(espada),
        };

        List<Sala> dungeonList = new ArrayList<>(List.of(dungeon));
        Collections.shuffle(dungeonList);

        for (int i = 0; i < dungeonList.size(); i++) {
            dungeonList.get(i).entrar(jugador);
            System.out.println("Bien, has pasado la sala: " + (i + 1));
        }
        System.out.println("Bien, Has terminado la dungeon!!!");

    }
}



