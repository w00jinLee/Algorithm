import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int x = sc.nextInt();
            int y = sc.nextInt();
            int N = sc. nextInt();
            int cnt = 0;
            
            while(x<=N && y<=N){
                if(x>y){
                    y+=x;
                }
                else{
                    x+=y;
                }   
                cnt++;
            }

            System.out.println(cnt);
		}
        
        sc.close();
	}
}