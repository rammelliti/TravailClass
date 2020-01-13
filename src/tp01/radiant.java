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
public class radiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double angle,resultat;
        Scanner read= new Scanner(System.in);
        
        System.out.print("Entrer la valeur de l'angle en degrés : ");
        angle=read.nextDouble();
        resultat=(angle*Math.PI)/180;
        System.out.println("La valeur de l'angle en radiant est : "+resultat);
    }
    
}
