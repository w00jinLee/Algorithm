import java.util.*;

public class Main {
	public static void main(String args[]) {
	int total = 0;
	Scanner sc = new Scanner(System.in);
	
	int X = sc.nextInt();
	int N = sc.nextInt();
	
	for(int i = 0; i<N; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		total += a*b;
	}
	if(X == total) {
		System.out.print("Yes");
	}
	else
		System.out.print("No");
	}
}
