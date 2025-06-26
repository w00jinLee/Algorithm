
import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int []arr = new int[N];
	int count = 0;
	
	for(int i=0; i<N; i++) {
		int a = sc.nextInt();
		arr[i] = a;
	}
	int x = sc.nextInt();
	
	for(int j=0; j<N; j++) {
		if(x == arr[j]) {
			count++;
		}
	}
	System.out.print(count);
	}
}