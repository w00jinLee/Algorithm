import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	
	for(int i=0; i<T; i++) {
		int v = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(2-v+e);
	}
	}
}