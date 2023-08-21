/*
 Nome: Kauã Miguel Costa Matos
 Matrícula : UC22101679

 Exercício 2: Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário 
 converter entre Celsius e Fahrenheit. Peça ao usuário para escolher a direção da conversão
e, em seguida, faça a conversão e exiba o resultado.
 */


package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        char unidadeDeTemperatura;
        float celsius;
        float fahrenheit;
        float result;

        System.out.println("Qual o modelo de conversão de temperatura?");
        System.out.println("1 - Celucius --> Fahrenheit");
        System.out.println("2 - Fahrenheit --> Celsius");
        unidadeDeTemperatura = inputUser.next().charAt(0);

        switch (unidadeDeTemperatura){
            case '1':
                System.out.println("Digite a temperatura em celsius: ");
                celsius = inputUser.nextFloat();
                result = ((celsius/5) * 9) + 32;
                System.out.println("Resultado = " + result);
                break;

            case '2':
                System.out.println("Digite a temperatura em Fahrenheit: ");
                fahrenheit = inputUser.nextFloat();
                result = ((fahrenheit - 32)  * 5) / 9;
                System.out.println("Resultado = " + result);
                break;
        }
    }
}
