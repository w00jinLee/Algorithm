import java.util.*;

public class Main {

	public static int num(int a, int b) {
		if(b == 0)
			return a;
		return num(b, a%b);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.print(m - num(n,m));
	}
}