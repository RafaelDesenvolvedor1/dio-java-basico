package edu.rafael.operadores;

public class Operadores {
   
    public String concatenacao(String a, String b){
        return a + b;
    }

    public int incrementar(int valorInical, int incremento){
        if(incremento <= 0){
            incremento = 1;
        }
        return valorInical = valorInical + incremento;
    }

    public int reduzir(int valorInical, int incremento){
        if(incremento <= 0){
            incremento = 1;
        }
        return valorInical = valorInical - incremento;
    }

    public boolean inverterBoolean(boolean a){
        return !a;
    }


}
