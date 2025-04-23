
package exercicio2;

public class Atendente extends Usuario {
    private double valorCaixa;
    
    public Atendente(){
        this.adm = false;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
    
    
    
    public void receberPagamento(double valor){
        this.valorCaixa += valor;
    }
    public void fecharCaixa(){
        System.out.println("Caixa Fechado");
    }

}
