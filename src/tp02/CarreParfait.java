
package tp02;

public class CarreParfait {

    public static void main(String[] args) {
        final int n=5;
        int j,i,x;
        int [][]tab= new int[n][n];
        
        x=1;
        i=n/2; j=i+1;
        tab[i][j]=x;
        x++;
        for(x=2;x<=(n*n);x++){
            if ((x-1)%n!=0) {
               i++;
               j++;
               tab[i%n][j%n]=x;
                }
            else{
                j=j+2;  
                tab[i%n][j%n]=x;
                };
            
        }
            
        for (j=0;j<tab.length;j++){
            for(i=0;i<tab.length;i++){
              System.out.print(tab[i][j]);
              System.out.print(" ");
              }
            System.out.print("\n");
              }
            
    }  
    }
    
}
