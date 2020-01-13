/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

public class anneeBissextile1 {

   public static void main(String[] args) {
        
       int annee;
       Scanner read=new Scanner(System.in);
       System.out.print("Entrer une année :  ");
       annee=read.nextInt();
        if (annee%400==0){
            System.out.println("L'année est bissextile");  }
        else {
            if (annee%100==0){
                System.out.println("L'année n'est pas bissextile");  }
            else {
                  if (annee%4==0) {
                      System.out.println("L'année est bissextile");  }
                  else
                      System.out.println("L'année n'est pas bissextile");  }
                      
                  }
                      
                  }
            }
       
       
    }
    
}
