public class SalaTesoro implements Sala {

    private Objetos itemTesoro;

    public SalaTesoro(Objetos itemTesoro) {
        this.itemTesoro = itemTesoro;
    }


    @Override
    public void entrar(Jugador jugador) {
        System.out.println("El jugador ha entrado en la sala del tesoro.");
        jugador.recogerItem(itemTesoro);
        jugador.mostrarInventario();
    }

}
