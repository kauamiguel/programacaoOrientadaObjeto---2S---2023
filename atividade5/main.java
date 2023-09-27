package atividade5;

public class main {
    public static void main(String[] args){
        Mercedes mercedes = new Mercedes();
        BMW bmw = new BMW();
        Gol gol = new Gol();
        mercedes.setMercedesData();
        mercedes.imprimirDados();
        bmw.setBmwData();
        bmw.imprimirDados();
        gol.setGolData();
        gol.imprimirDados();
    }
}
