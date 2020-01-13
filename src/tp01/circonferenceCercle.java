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
public class circonferenceCercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //final double PI=3.1415926;
        Scanner reader= new Scanner(System.in);
        double diametre, resultat;
        
        System.out.print(" Entrer le diamètre : ");
        diametre=reader.nextDouble();
        resultat=Math.PI *diametre;
        System.out.println("La circonférence : "+resultat);
        
        
    }
    
}
