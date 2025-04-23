package exercicio2;

public class Gerente extends Usuario {
    
    public Gerente(){
        this.adm = true;
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Gerando relatório financeiro");
    }
    
    public void consultarVendas(){
        System.out.println("Colsultando vendas!");
    }
}
