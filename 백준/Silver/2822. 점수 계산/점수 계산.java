import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1  = new int[8];
		int[] arr2  = new int[8];
		int sum = 0;
		for(int i=0; i<8; i++) {
			arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
		}
		Arrays.sort(arr1);
		for(int i=3; i<8 ;i++) {
			sum += arr1[i];
		}
		System.out.println(sum);  
		for(int i = 0; i < 8; i++)
        {
            if(arr1[3]<= arr2[i])
            	System.out.print((i+1)+" ");
        }
	}
}