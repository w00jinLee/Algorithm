import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[3];
	
	int max = 0;
	int mid = 0;
	int min = 101;
	int tmp = 0;
	
	for(int i=0; i<3; i++) {
		arr[i] = sc.nextInt();
		if(arr[i]> max) {
			max = arr[i];
		}
		if(arr[i]< min) {
			min = arr[i];
		}
	}
	for(int j=2; j>0; j--) {
		for(int i=0; i<j; i++) {
			if(arr[i]>arr[i+1]) {
				tmp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = tmp;
			}
	}
	}
	System.out.print(arr[1]);
	
	}
	
	}
