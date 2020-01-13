
package tp02;

import java.util.Scanner;

public class plusPetitT {

    public static void main(String[] args) {
         final int n=5,m=2;
        int min,i,j;
        int [][] tab= new int[n][m];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        {   for(j=0;j<tab[0].length;j++)
            {
                 System.out.print("Entrer la valeur "+(i+1)+","+(j+1)+" : ");
                 tab[i][j]=read.nextInt();
            }
        }    
            min=tab[0][0];
        for (i=1;i<tab.length;i++)
        {  for(j=0;j<tab[0].length;j++)
            {
               if (tab[i][j]<min){
                min=tab[i][j];}
            }  
        }
        
        System.out.println("La valeur la plus PETIT est : "+min);
    }
    
}
