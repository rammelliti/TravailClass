
package tp02;

import java.util.Scanner;

public class tableauAmplitude {

   
    public static void main(String[] args) {
        final int N=5,M=2;
        int max,i,j,min,amplitude;
        int [][] tab= new int[N][M];
        Scanner read= new Scanner(System.in);
        
        for (i=0;i<tab.length;i++)
        { for(j=0;j<M;j++){
            
            System.out.print("Entrer la valeur "+i+j+" : ");
            tab[i][j]=read.nextInt();
            }
        }
        max=tab[0][0];
        min=tab[0][0];
        for (i=0;i<tab.length;i++)
        {   for(j=0;j<M;j++){
                if(tab[i][j]>max){
                max=tab[i][j];
                }
                if(tab[i][j]<min){
                    min=tab[i][j];
                }
            }
        }
        amplitude=max-min;
        System.out.println("L'amplitude vaut : "+amplitude);
    }
}
        

