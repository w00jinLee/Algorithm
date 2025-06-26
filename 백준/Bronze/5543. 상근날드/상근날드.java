import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] burger = new int[3];
		int[] drink  = new int[2];
		
		for(int i =0; i<3; i++) {
			burger[i] = sc.nextInt();
		}
		
		for(int i=0; i<2; i++)	{
			drink[i] =sc.nextInt();
		}
		Arrays.sort(burger);
		Arrays.sort(drink);
		
		int sum = burger[0]+drink[0]-50;
		System.out.print(sum);
		
	}
}
//모든 가격은 100원이상,2000원 이하