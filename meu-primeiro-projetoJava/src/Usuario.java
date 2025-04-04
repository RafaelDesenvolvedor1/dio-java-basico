import edu.rafael.metodos.SmartTv;
import edu.rafael.operadores.Operadores;
import edu.rafael.tiposvariaveis.TiposVariaveis;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv(true, 20, 5);

        // tv.aumentarVolume();
        // tv.aumentarVolume();
        // tv.aumentarVolume();
        // tv.aumentarVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();

        tv.mudarCanal(0);

        tv.aumentarCanal();
        tv.aumentarCanal();

        // tv.diminuirCanal();
        // tv.diminuirCanal();

        tv.desligar();
        tv.ligar();

        System.out.println("Esta ligada? " + tv.getLigada());
        System.out.println("Volume: "+ tv.getVolume());
        System.out.println("Canal: " + tv.getCanal());
       
    }
}
