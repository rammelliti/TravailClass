
package tp02;

import java.util.Scanner;

public class CarreParfait {

    public static void main(String[] args) {
        
        int j,i,n,x;
        Scanner read= new Scanner(System.in);
        System.out.print("Ordre du carré magique (Impair) : ");
        n=read.nextInt();
        int [][]tab= new int[n][n];
        
        x=1;
        i=n/2; j=i+1;
        tab[i][j]=x;
        x++;
        for(x=2;x<=(n*n);x++){
            if ((x-1)%n!=0) {
               i=(i+1)%n;
               j=(j+1)%n; 
                }
            else{
                j=(j+2)%n;  
                }
        tab[i][j]=x;    
        }
            
        for (j=0;j<tab.length;j++){
            for(i=0;i<tab.length;i++){
              System.out.print(tab[i][j]+"\t");
              //System.out.print(" ");
              }
            System.out.print("\n");
              }
            
    }  
    }
    
