import edu.rafael.operadores.Operadores;
import edu.rafael.tiposvariaveis.TiposVariaveis;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Boa vindas turma DIO!");

       // TiposVariaveis testeVariaveis = new TiposVariaveis();
        Operadores testeOperadores = new  Operadores();

        boolean teste = false;

        teste = testeOperadores.inverterBoolean(teste);

        System.out.println(teste);
        
        teste = testeOperadores.inverterBoolean(teste);

        System.out.println(teste);
       
    }
}
