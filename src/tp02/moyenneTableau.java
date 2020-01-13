
package tp02;

import java.util.Scanner;


public class moyenneTableau {

   
    public static void main(String[] args) {
        final int n=10;
        double moy;
        int som,i;
        int [] tab= new int[n];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {
            System.out.print("Entrer la valeur "+(i+1)+" : ");
            tab[i]=read.nextInt();
        }
        som=0;
        for (i=0;i<tab.length;i++)
        {
            som=som+tab[i];
        }
        moy=(double)som/n;
        System.out.println("La moyenne vaut : "+moy);
            
        
    }
    
}
