package tp02;

import java.util.Scanner;

public class tabloDepartPas {

    public static void main(String[] args) {
        
        final int N=10,M=2;
        int depart,pas;
        Scanner read= new Scanner(System.in);
        int [][]tab= new int[N][M];
        
        System.out.print("Entrer la valeur du départ : ");
        depart=read.nextInt();
        System.out.print("Entrer le pas : ");
        pas=read.nextInt();
        
        
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {  tab[i][j]=(2*i+j)*pas+depart;
               //depart=depart+pas;
            }
            
        }
         for(int i=0;i<N;i++)
        {   System.out.println();
            for(int j=0;j<M;j++)
            {
                System.out.print(tab[i][j]+"\t");
            }
    }
    }
    
}
    
