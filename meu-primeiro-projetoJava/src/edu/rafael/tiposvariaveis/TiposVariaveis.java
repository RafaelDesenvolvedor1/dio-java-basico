package edu.rafael.tiposvariaveis;

public class TiposVariaveis {  
    public double salarioMinimo = 2500.33;
    public byte idade = 123;
    public short ano = 2021;
    public int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
    public long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
    public float pi = 3.14F;

    // Uso da classe String para texto:

    public String meuNome = "Rafael Santos";


    // Uso de Constantes

    /** Constantes
     * Definido pela palavra reservada 'final'
     * SEMPRE DECLARAR EM UPPERCASE!
     */

     public final double VALOR_DO_PI = 3.14;


     public void imprimirTiposVariaveis(){
        System.out.println("Var double Salario minimo: "+salarioMinimo);
        System.out.println("Var byte idade: "+idade);
        System.out.println("Var short ano: "+ano);
        System.out.println("Var int cep: "+cep);
        System.out.println("Var long cpf: "+cpf);
        System.out.println("Var float pi: "+pi);
        System.out.println("Var String meuNome: "+meuNome);
        System.out.println("constante double valor_do_pi: "+VALOR_DO_PI);
     }
}
