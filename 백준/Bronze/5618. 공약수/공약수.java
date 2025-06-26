import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt(); //n은 2또는3
	
	int[] arr = new int[n];
	
	for(int i=0; i<n; i++) {
		int x = sc.nextInt();
		arr[i] = x; 
	}
	Arrays.sort(arr);
	if(n==3) {
	for(int i=1; i<=arr[2]; i++) {
		if(arr[0]%i==0 && arr[1]%i==0 && arr[2]%i==0) {
			System.out.println(i+" ");
		}	
	}
	}
	
	else if(n==2){
		for(int i=1; i<=arr[1]; i++) {
		if(arr[0]%i==0 && arr[1]%i==0) {
			System.out.println(i+" ");
		}	
	}
	}
		
	}
}
