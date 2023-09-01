package atividade3;

import java.util.ArrayList;
import java.util.Random;

public class Estoque {
    ArrayList<Objeto> objects;

    Estoque(){
        this.objects = new ArrayList<Objeto>();
    }

    void checkThestock(){
        for(Objeto obj : this.objects){
            System.out.println("Name : " + obj.name + "  Quantidade : " + obj.quantidade + "  id : " + obj.id);
        }
    }

    void addNewItem(String name, int quantidade){
        Random idRandom = new Random();
        int id = idRandom.nextInt(200);
        Objeto object = new Objeto(name, quantidade, id);
        this.objects.add(object);

    }

    void removeItem(int id){
        for(Objeto phone : this.objects){
            if(phone.id == id){
                objects.remove(phone);
                return;
            }
        }
    }


}
