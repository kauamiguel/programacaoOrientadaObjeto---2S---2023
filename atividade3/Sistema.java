package atividade3;

import java.util.Scanner;



public class Sistema {
    public static void main(String[] args){
        int choice = 0;
        Scanner choose = new Scanner(System.in);
        Estoque controlStock = new Estoque();

        while (choice != 4) {
            System.out.println("1 - Adicionar objeto");
            System.out.println("2 - Listar objeto");    
            System.out.println("3 - remover objeto");
            System.out.println("4 - Sair");
            choice = choose.nextInt();
            executeOption(choice, choose, controlStock);
        }
       
        choose.close();
    }

    public static void executeOption(int option, Scanner input, Estoque controlStock){
    
            

            switch(option){
                case 1:
                    System.out.println("Digite o nome do objeto: ");
                    String name = input.next();
                    System.out.println("Digite a quantidade de itens: ");
                    int quantity = input.nextInt();

                    controlStock.addNewItem(name, quantity);
                    break;

                case 2:
                    controlStock.checkThestock();
                    break;

                case 3:
                    System.out.println("Digite o id do objeto que deseja remover: ");
                    int idObject = input.nextInt();
                    controlStock.removeItem(idObject);
                    break;

                default:
                    break;
            }
        
    }
}


