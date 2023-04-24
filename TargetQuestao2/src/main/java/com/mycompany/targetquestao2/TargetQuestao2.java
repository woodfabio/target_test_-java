
package com.mycompany.targetquestao2;

import java.util.Scanner;

public class TargetQuestao2 {

    public static void main(String[] args) {        
        
        // TARGET RIBEIRAO PRETO - TESTE
        
        /*
        2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo 
        valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 
        3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar 
        onde, informado um número, ele calcule a sequência de Fibonacci e 
        retorne uma mensagem avisando se o número informado pertence ou não 
        a sequência.
        */
        
       Scanner t = new Scanner(System.in);
        
       System.out.println("Digite um número: ");
       int n = t.nextInt();
       String answer = "não está";
       boolean check = false;
       int n1 = 0;
       int n2 = 1;
       
       while (!check) {
           int n3 = n1 + n2;
           if (n3 <= n) {
               if (n3 == n) {
                   answer = "está";
                   check = true;
               }
           } else {
               check = true;
           }
           n1 = n2;
           n2 = n3;
       }
       
       System.out.println("O número " + n + " " + answer + " " + "na sequencia de Fibonacci");
    }
}
