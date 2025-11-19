import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            
            for(int i=0; i<N; i++){
                for(int j=0; j<i+1; j++){
                    arr[i][j]=1;
                }
            }

            if(N>=2){
                for(int i=2; i<N; i++){
                    for(int j=1; j<i; j++){
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }
                }   
            }                

            System.out.println("#" + test_case);
            for(int i=0; i<N; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }

        sc.close();
    }
}