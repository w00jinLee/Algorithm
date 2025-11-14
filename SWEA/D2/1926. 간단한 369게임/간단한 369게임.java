import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
            
        for(int i=1; i<=N; i++){

            if(String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")){
                for(int j=0; j<String.valueOf(i).length(); j++){
                    if(String.valueOf(i).charAt(j) == '3' || String.valueOf(i).charAt(j) == '6' || String.valueOf(i).charAt(j) == '9'){
                        System.out.print("-");
                    }            
                }
                System.out.print(" ");
            }
            else{
                System.out.print(i+" ");
            }
        }
		

        sc.close();
	}
}