public class SalaEnemigo implements Sala {

    public void entrar(Jugador jugador){
        System.out.println("Avanzaste en la sala y hay un enemigo!");
        jugador.pelea();
    }
}
