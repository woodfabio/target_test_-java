package com.mycompany.targetquestao5;

import java.util.Scanner;

public class TargetQuestao5 {

    public static void main(String[] args) {
        
        // TARGET RIBEIRAO PRETO - TESTE        
        
        // 5) Escreva um programa que inverta os caracteres de um string.
        
       Scanner t = new Scanner(System.in);
        
       System.out.println("Insira uma string: ");
       
       String s = t.nextLine();
       String answer = "";
       
       int n = s.length();
       
       for (int i=n; i > 0; i--) {
           answer = answer + s.charAt(i-1);
       }
       
       System.out.println(answer);
       
    }
}
