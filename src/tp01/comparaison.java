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
public class comparaison {
     public static void main(String[]args)
    {
        int nb1,nb2;
        Scanner read= new Scanner(System.in);
        
        System.out.print("Entrer le prémier nombre : ");
        nb1=read.nextInt();
         System.out.print("Entrer le deuxieme nombre : ");
        nb2=read.nextInt();
        
        if (nb1<nb2)
            System.out.println("Le prémier nombre est plus petit de deuxième nombre");
        else if (nb1==nb2)
            System.out.println("Les deux nombres sont identique ");
        else
            System.out.println("Le prémier nombre est plus grand de deuxième nombre");   
        
    }
    
}
