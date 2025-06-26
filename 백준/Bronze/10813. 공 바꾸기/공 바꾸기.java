import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        int tmp=0;

        for(int idx=0; idx<N; idx++){
            arr[idx]=idx+1;
        }

        for(int idx=0; idx<M; idx++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            tmp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=tmp;
        }

        for(int idx=0; idx<N; idx++){
            System.out.print(arr[idx]+" ");
        }
        sc.close();
    }
}