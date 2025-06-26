import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int[] arr = new int[5];
	
	for(int i=0; i<arr.length; i++) {
		int x = sc.nextInt();
		arr[i] =x;
		if(arr[i] >= 40) {
		arr[i] = x;
		}
		else {
			arr[i] = 40;
		}
	}
	int sum =0;

	for(int i=0; i<arr.length; i++) {
		sum += arr[i];
	}
	int average = sum/5;
	System.out.print(average);
	}
}