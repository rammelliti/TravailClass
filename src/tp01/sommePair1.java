/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class sommePair1 {
        
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner read=new Scanner(System.in);
        int som=0,nbr;
        
        System.out.print("Entrer votre nombre : ");
        nbr= read.nextInt();
        
        for(int i=1;i<=nbr;i++){
        //while(i<=nbr){
           som=som+(2*i);
           }
       System.out.println("la somme est : "+som);
    }
    
      
    
}
