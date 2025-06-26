import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        

        int arr[][] = new int[100][100];


        for(int i=0; i<n; i++){
          int w=sc.nextInt();
          int h=sc.nextInt();
          for(int j=w; j<w+10; j++){
            for(int k=h; k<h+10; k++){
                arr[j][k]=1;
            }
          }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j]==1){
                    sum++;
                }
            }
        }

   
        System.out.println(sum);
    }
}