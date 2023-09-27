package atividade5;

public class Mercedes extends WolksWagen{
    private String placa = "abc1234";
    Boolean isConversivel = true;

    public void printPlaca(){
        System.out.println("Placa : " + this.placa);
    }

    public void setMercedesData(){
        this.name = "Mercedes";
        this.price = (float)100.00;
        this.model = "V8";
        this.velocidade = 100;
        this.velocidadeMax = 400;
    }
}
