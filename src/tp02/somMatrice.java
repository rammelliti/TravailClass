
package tp02;

import java.util.Scanner;

public class somMatrice {

   
    public static void main(String[] args) {
        int j,i;
        Scanner read= new Scanner(System.in);
        System.out.print("Entrer la valeur d'ordre du matrice : ");
        final int n=read.nextInt();
        int [][]A= new int[n][n];
        int [][]B=new int [n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("Entrer la valeur du tableau A:"+i+j+" : ");
                A[i][j]=read.nextInt();
            }
        }
        
        for(i=0;i<B.length;i++){
            for(j=0;j<B.length;j++){
                System.out.print("Entrer la valeur du tableau B : "+i+j+" : ");
                B[i][j]=read.nextInt();
            }
        }
       int [][]som=new int[n][n];     
       for(i=0;i<n;i++){
           System.out.println();
            for(j=0;j<som.length;j++){
                som[i][j]=A[i][j]+B[i][j];
                System.out.print(som[i][j]+"\t");
                
            }
        }
    }
    
}
