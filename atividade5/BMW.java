package atividade5;

public class BMW extends WolksWagen{
    private String placa = "bcd123";
    Boolean isConversivel = true;

    public void printPlaca(){
        System.out.println("Placa : " + this.placa);
    }

    
    public void setBmwData(){
        this.name = "BMW";
        this.price = (float)200.00;
        this.model = "300i";
        this.velocidade = 200;
        this.velocidadeMax = 350;
    }
}
