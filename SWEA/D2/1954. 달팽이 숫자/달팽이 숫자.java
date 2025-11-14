import java.util.Scanner;

class Solution
{
    static int N;
    static int[][] arr;

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
    
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N=sc.nextInt();
            arr = new int[N][N];

            func(1, 0);

            System.out.println("#" + test_case);
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

		}
        sc.close();
	}
                    //     1       0
    static void func(int cnt, int layer){
        if(layer>N/2){
            return;
        }
        //왼쪽에서 오른쪽
        for(int i=layer; i<N-layer; i++){
            arr[layer][i]=cnt++;
        }
        //오른쪽 위에서 아래로
        for(int i=layer+1; i<N-layer; i++){
            arr[i][N-layer-1]=cnt++;
        }
        //오른쪽 아래에서 왼쪽으로
        if (N - layer - 1 != layer){
            for(int i=N-layer-2; i>=layer; i--){
                arr[N-layer-1][i]=cnt++;
            }
        }
        //왼쪽 아래에서 위로
        if (N - layer - 1 != layer){
            for(int i=N-layer-2; i>layer; i--){
                arr[i][layer]=cnt++;
            }
        }

    
        func(cnt,layer+1);

    }

}