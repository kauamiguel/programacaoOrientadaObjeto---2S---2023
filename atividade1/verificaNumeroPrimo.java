
package atividade1;

import java.util.Scanner;

public class verificaNumeroPrimo{
   
   public static void main(String[] args) {
      Scanner inputUser = new Scanner(System.in);
      System.out.println("Digite um valor para verificar se \u00e9 primo: ");
      int numberUser = inputUser.nextInt();
      int isPrime = verificaNumeroPrimo(numberUser);
      if (isPrime == 1) {
         System.out.println("Numero primo");
      } else {
         System.out.println("Numero nao eh primo");
      }
      
      inputUser.close();
   }

   static int verificaNumeroPrimo(int number) {
   
         for(int i = 2; i < number / 2; ++i) {
            if (number % i == 0) {
               return 0;
            }
         }
         return 1;
   }
}