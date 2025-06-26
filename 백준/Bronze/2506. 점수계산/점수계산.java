
import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int N = sc.nextInt();
	int[] arr = new int[N];
	int sum = 0;
	int count =0;
	
	for(int i =0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
	
	for(int i=0; i<N;i++) {
		if(arr[i]==1) {
			count ++;
			sum+= count;
		}
		else{
				count =0;
			}
		}
	System.out.print(sum);
	}
	}
