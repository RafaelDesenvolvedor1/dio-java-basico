import edu.rafael.operadores.Operadores;
import edu.rafael.tiposvariaveis.TiposVariaveis;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Boa vindas turma DIO!");

       // TiposVariaveis testeVariaveis = new TiposVariaveis();
        Operadores testeOperadores = new  Operadores();


        int a = 5;
        int b = 8;
  
        //Operador Ternário

        String resultado = a == b ? "Verdadeiro" : "Falso";

        //------------------
        
        System.out.println(resultado);
       
    }
}
