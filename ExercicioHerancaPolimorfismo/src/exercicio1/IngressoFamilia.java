
package exercicio1;

public class IngressoFamilia extends Ingresso{
    private int qtdPessoas;

    public IngressoFamilia() {
        this.qtdPessoas = 1;
    }
    
    
    
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if(qtdPessoas > 0){
            this.qtdPessoas = qtdPessoas;
        }else{
            this.qtdPessoas = 1;
        }
        
    }
    
    
    
    @Override
    public double getValor(){
        if(this.qtdPessoas > 3){
            double aux = this.valor * qtdPessoas;
            return aux - (aux * 5/100);
        }else{
            return this.valor * qtdPessoas;
        }
        
    }
    
}
