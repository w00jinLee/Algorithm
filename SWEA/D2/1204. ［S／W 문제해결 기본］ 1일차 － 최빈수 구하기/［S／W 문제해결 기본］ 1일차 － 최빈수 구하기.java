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
            int t = sc.nextInt();
            int scoreCount[] = new int[101];
            int max = 0;
            int freScore = 0;

            for(int i=0; i<1000; i++){
                int score = sc.nextInt();
                scoreCount[score]++;

                if(scoreCount[score]>=max){
                    max=scoreCount[score];
                    freScore = score;
                }

            }

            System.out.println("#" + test_case+" "+freScore);
		}

        sc.close();
	}
}