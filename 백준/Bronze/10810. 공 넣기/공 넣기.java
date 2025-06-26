import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        
        for(int idx1=0; idx1<M; idx1++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int idx2=i-1; idx2<=j-1; idx2++){
                arr[idx2]=k;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}