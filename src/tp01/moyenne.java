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
public class moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,n4;
        double moyen;
        
        Scanner read=new Scanner(System.in);
        
        System.out.print("Entrer la valeur du premier nombre : ");
        n1=read.nextInt();
        System.out.print("Entrer la valeur du deuxieme nombre : ");
        n2=read.nextInt();
        System.out.print("Entrer la valeur du troisieme nombre : ");
        n3=read.nextInt();
        System.out.print("Entrer la valeur du quaterieme nombre : ");
        n4=read.nextInt();
        
        moyen= (n1+n2+n3+n4)/4.0;
        System.out.println("la valeur de la moyenne : "+moyen);
        
    }
    
}
