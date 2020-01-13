
package tp02;

import java.util.Scanner;


public class plusGrandT {

   
    public static void main(String[] args) {
        final int n=3;
        int max,i;
        int [] tab= new int[n];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {
            System.out.print("Entrer la valeur "+i+" : ");
            tab[i]=read.nextInt();
        }    
            max=tab[0];
        for (i=1;i<tab.length;i++)
        {
            if (tab[i]>max){
                max=tab[i];
            }  
        }
        
        System.out.println("La valeur la plus grande est : "+max);
    }
    
}
