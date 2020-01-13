
package tp01;

import java.util.Scanner;


public class suiteFibonacciSwitch {

    public static void main(String[] args) {
        int n;
        
        Scanner read=new Scanner(System.in);
        System.out.print("Entrer un nombre n (minimum 1):  ");
        n=read.nextInt();
        
        switch(n) {
            case 1: 
            case 2 : System.out.print("Le resultat vaut 1 ");break;
            default :            
                int av =1,d=1,som;
       
                 for (int i=3;i<=n;i++){
                    som=d+av;
                    av=d;
                    d=som;        
                    }
                System.out.println("la somme est "+d);
                }
    }
    
}
