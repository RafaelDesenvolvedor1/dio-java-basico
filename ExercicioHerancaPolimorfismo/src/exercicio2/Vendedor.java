package exercicio2;

public class Vendedor extends Usuario {
    private int qtdVendas;
    
    public Vendedor(){
        this.adm = false;
        this.qtdVendas = 0;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }
    
    
    public void realizarVenda(){
        this.qtdVendas++;
    }
  
}
