
package exercicio1;

public abstract class Ingresso {
    protected double valor;
    private String nomeDoFilme;
    private boolean dublado;
    private boolean legendado;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        if(this.legendado){
            this.dublado = false;
        }else{
            this.dublado = dublado;
        }
        
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
          if(this.dublado){
            this.legendado = false;
        }else{
            this.legendado = legendado;
        }
    }

    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + this.getValor() + ", nomeDoFilme=" + nomeDoFilme + ", dublado=" + dublado + ", legendado=" + legendado + '}';
    }
    
    
    
}
