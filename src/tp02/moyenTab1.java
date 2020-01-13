
package tp02;

import java.util.Scanner;

public class moyenTab1 {

    public static void main(String[] args) {
        final int n=5,m=2;
        double moy;
        int som,i,j;
        int [][] tab= new int[n][m];
        Scanner read= new Scanner(System.in);
        
        som=0;
        for (i=0;i<tab.length;i++)
        {  for(j=0;j<tab[0].length;j++)
            {
                  System.out.print("Entrer la valeur "+(i+1)+","+(j+1)+" : ");
                  tab[i][j]=read.nextInt();
                  som=som+tab[i][j];
            }
        }    
        moy=(double)som/(n*m);
        System.out.println("La moyenne vaut : "+moy);
    }
    
}
