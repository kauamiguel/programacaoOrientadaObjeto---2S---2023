package atividade5;

public class Gol extends WolksWagen{
    private String placa = "efg123";
    Boolean isConversivel = true;

    public void printPlaca(){
        System.out.println("Placa : " + this.placa);
    }


    public void setGolData(){
        this.name = "Polo";
        this.price = (float)80.00;
        this.model = "sportLine";
        this.velocidade = 100;
        this.velocidadeMax = 250;
    }
}
