
package tp02;

import java.util.Scanner;

public class tableauInverse {

    public static void main(String[] args) {
        final int n=10;
        int stock,i;
        int [] tab= new int[n];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {  
            System.out.print("Entrer la valeur "+(i+1)+" : ");
            tab[i]=read.nextInt();
        }  
        for (i=0;i<(tab.length/2);i++)
        {
            stock=tab[i];
            tab[i]=tab[n-1-i];
            tab[n-1-i]=stock;
        }
        System.out.print("Tableau inversé : ");
        for (i=0;i<tab.length;i++)
        {  System.out.print(tab[i]);
           System.out.print(" ");}
    }
    
}
