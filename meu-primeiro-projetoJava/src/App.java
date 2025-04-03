import edu.rafael.operadores.Operadores;
import edu.rafael.tiposvariaveis.TiposVariaveis;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Boa vindas turma DIO!");

        TiposVariaveis testeVariaveis = new TiposVariaveis();
        Operadores testeOperadores = new  Operadores();

        String primeiroNome = testeVariaveis.string = "Rafael";
        String segundoNome = testeVariaveis.string = " Santos";

        System.out.println(testeOperadores.concatenacao(primeiroNome, segundoNome));

        //testeVariaveis.imprimirTiposVariaveis();
    }
}
