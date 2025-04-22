
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        MeiaIngresso ingresso1 = new MeiaIngresso();
        
        ingresso1.setNomeDoFilme("Moana 2");
        ingresso1.setValor(59.90);
        ingresso1.setDublado(true);
        
        System.out.println(ingresso1.toString());     
      //  System.out.println(ingresso1.getValor());
        
        IngressoFamilia ingresso2 = new IngressoFamilia();
        
        ingresso2.setNomeDoFilme("Moana 2");
        ingresso2.setValor(59.90);
        ingresso2.setLegendado(true);
        ingresso2.setQtdPessoas(4);
        
        System.out.println(ingresso2.toString());
        
        
      
    }
    
}
