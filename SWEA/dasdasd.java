package SWEA;

import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int arr[] = new int[10];
        int cnt=1; 

		for(int test_case = 1; test_case <= T; test_case++)
		{
           int sum=0;
            for(int i=0; i<10; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<10; i++){
                if(arr[i]%2!=0){
                    sum+=arr[i];
                }
            }
            System.out.println("#"+cnt+" "+sum);
            cnt++;		
		}
        sc.close();
	}
}