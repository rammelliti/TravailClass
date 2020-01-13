/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;


public class suiteDeFibonacci {

   
    public static void main(String[] args) {
        
        int n,av,d;
        
        Scanner read=new Scanner(System.in);
        
       do {
       System.out.print("Entrer un nombre n :  ");
       n=read.nextInt();
            }while(n<2);
       av =1;d=1;
       int som=0;
    for (int i=2;i<n;i++){
        som=d+av;
        av=d;
        d=som;        
    }
    System.out.println("la somme est "+som);
}
}
