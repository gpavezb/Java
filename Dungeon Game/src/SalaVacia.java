import java.util.Scanner;

public class  SalaVacia implements Sala {
    @Override
    public void entrar(Jugador jugador){
        //Jugador stats = new Jugador();
        Scanner sc = new Scanner(System.in);
        Integer curacion=100-jugador.vidaP;
        System.out.println("Esta sala se encuentra vacia, es momento de tomar un descanso");
        System.out.println("Quieres curarte? 1.-Curarte y avanzar. 2.- Avanzar sin curarte");
        Integer opcionCura = sc.nextInt();
        if(opcionCura == 1){
            jugador.setVidaP(jugador.vidaP+curacion);
            System.out.println("Tu vida ahora es: "+jugador.vidaP);
            System.out.println("Suerte en tu travesia, viajero");
            //avanzar jugador.quit
        }else{
            //avanzar jugador.quit
        }
    }
}
