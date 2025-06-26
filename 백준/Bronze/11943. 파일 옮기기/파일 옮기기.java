import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int sum1 = A+D;
		int sum2 = B+C;
		if(sum1>sum2) {
			System.out.print(sum2);
		}
		else if(sum2>=sum1){
			System.out.print(sum1);
		}
		
	}
}
