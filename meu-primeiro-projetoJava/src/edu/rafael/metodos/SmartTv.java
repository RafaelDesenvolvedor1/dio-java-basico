package edu.rafael.metodos;

public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv(boolean lig, int c, int v){
        this.ligada = lig;
        this.setCanal(c);
        this.setVolume(v);
    }

    public SmartTv(){
        this.setVolume(50);
        this.setCanal(1);
    }


    public boolean getLigada(){ return this.ligada; }
    public void setLigada(boolean lig){ this.ligada = lig; }

    public int getCanal(){return this.canal; }
    public void setCanal(int c){ 
        if(c <= 0 || c >= 100){
            this.canal = 1;
        }else if(c > 0 && c < 100){
            this.canal = c;
        }
    }

    
    public int getVolume(){return this.volume; }
    public void setVolume(int v){ 
       if(v < 0){
        this.volume = 0;

       }else if(v >= 0 && v <= 100){
        this.volume = v;
       }else if(v > 100){
        this.volume = 100;
       }
    }



    public void ligar(){
   
        this.setLigada(true);
        
    }

    public void desligar(){
        this.setLigada(false);
    }

    public void aumentarVolume(){
        this.setVolume(this.getVolume() + 1);
    }

    public void diminuirVolume(){
        this.setVolume(this.getVolume() - 1);
    }

    public void mudarCanal(int c){
        this.setCanal(c);
    }

    public void aumentarCanal(){
        this.setCanal(this.getCanal() + 1);
    }

    public void diminuirCanal(){
        this.setCanal(this.getCanal() - 1);
    }
}
