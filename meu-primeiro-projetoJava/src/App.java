import edu.rafael.operadores.Operadores;
import edu.rafael.tiposvariaveis.TiposVariaveis;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Boa vindas turma DIO!");

       // TiposVariaveis testeVariaveis = new TiposVariaveis();
        Operadores testeOperadores = new  Operadores();

        int teste = 100;

        teste = testeOperadores.reduzir(teste, 1);

        System.out.println(teste);

        teste = testeOperadores.reduzir(teste, 1);

        System.out.println(teste);
       
    }
}
