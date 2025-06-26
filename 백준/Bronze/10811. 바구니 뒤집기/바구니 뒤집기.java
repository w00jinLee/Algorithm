import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer arr[] = new Integer[N];
        
        for(int idx=0; idx<N; idx++){
            arr[idx]=idx+1;
        }

        for(int idx=0; idx<M; idx++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            for(int left=i-1, right=j-1; left<right; left++, right--){
                int tmp=0;

                tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;             
            }
        }

        for(int idx=0; idx<N; idx++){
            System.out.print(arr[idx]+" ");
        }

        sc.close();
    }
}