package atividade2;

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        int primeiroOperando = 0;
        int segundoOperando = 0;
        int result = 0;
        char operacao;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Digite o primeiro número da operação: ");
        primeiroOperando = inputUser.nextInt();
        System.out.println("Digite o segundo número da operação: ");
        segundoOperando = inputUser.nextInt();
        System.out.println("Digite o operando: ");
        operacao = inputUser.next().charAt(0);

        switch (operacao){
            case '+':
                result = primeiroOperando + segundoOperando;
                System.out.println("Resultado =" + result);
                break;

            case '-':
                result = primeiroOperando - segundoOperando;
                System.out.println("Resultado = " + result);
                break;

            case '*':
                result = primeiroOperando * segundoOperando;
                System.out.println("Resultado = " + result);
                break;

            case '/':
                result = primeiroOperando / segundoOperando;
                System.out.println("Resultado = " + result);
                break;
              
            default:
                System.out.println("Operando nao encontrado");
                break; 
        }

        inputUser.close();
    }   
}


