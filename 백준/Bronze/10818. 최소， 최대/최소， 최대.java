import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] arr = new int[N];
	
	int max =-9999999;
	int min = 9999999;
	
	for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	
	for(int i=0; i<N; i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.print(min+" "+max);
	
}
}