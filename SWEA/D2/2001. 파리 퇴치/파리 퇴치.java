import java.util.Scanner;

class Solution
{
    static int N;
    static int M;
    static int arr[][];
    static int max;

	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt(); //5이상 15이하
            M = sc.nextInt(); //2이상 N이하

            arr = new int[N][N];
            max = 0;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt(); 
                }
            }

            func(0, 0);
            System.out.println("#" + test_case+" "+max);
		}

        sc.close();
	}

    public static void func(int row, int col){
        int sum = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<M; j++){
                sum += arr[row+i][col+j];
            }
        }
        if(sum > max){
            max = sum;
        }

        if(col < N-M){
            func(row, col+1);
        }
        else if(row < N-M){
            func(row+1, 0);
        }
        else{
            return;
        }
    }

}