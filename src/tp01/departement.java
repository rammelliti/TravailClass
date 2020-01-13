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
public class departement {
    public static void main(String []args)
    {
        int dept;
        Scanner read= new Scanner(System.in);
        
        System.out.print("Entrer votre département (13,83,84) : ");
        dept=read.nextInt();
        
        switch (dept) {
            case 13 : 
            System.out.println("Bouche du Rhône");
            break;
            case 83 :
                System.out.println("Var");
                break;
            case 84 :
                System.out.println("Vaucluse");
                break;
            default :
                System.out.println("Réponse non valide");
        }
                
    }
    
}
