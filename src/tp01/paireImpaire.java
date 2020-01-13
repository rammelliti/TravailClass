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
public class paireImpaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner read=new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        n=read.nextInt();
        if (n%2==0){
            System.out.println("Nombre Pair");}
            else{
            System.out.println("Nombre Impair");
                    }
        }
            
        
    }
    

