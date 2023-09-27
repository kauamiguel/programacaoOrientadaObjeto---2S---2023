package atividade5;

public class WolksWagen {
    String name;
    Float price;
    String model;
    float velocidade = 0;
    float velocidadeMax;

    public void acelerar(float velocidade){
        this.velocidade += velocidade;
    }

    public void freiar(float freiar){
        this.velocidade -= freiar;
    }

    public void imprimirDados(){
        System.out.println("Name : " + this.name);
        System.out.println("price : " + this.price);
        System.out.println("model : " + this.model);
        System.out.println("velocidadeMax : " + this.velocidadeMax);
    }



}
