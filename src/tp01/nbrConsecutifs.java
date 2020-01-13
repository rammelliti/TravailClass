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
public class nbrConsecutifs {
     public static void main(String[]args)
    {
        int nb1,nb2;
        Scanner read= new Scanner(System.in);
        
        System.out.print("Entrer la valeur du prémier nombre : ");
        nb1=read.nextInt();
         System.out.print("Entrer la valeur du deuxieme nombre : ");
        nb2=read.nextInt();
        
        if (nb2==nb1+1)
            System.out.println("Nombre onsécutifset ordonnés ");
        else
            System.out.println("Nombre NON consécutifs et ordonnés ");
               
        
    }
    
}
