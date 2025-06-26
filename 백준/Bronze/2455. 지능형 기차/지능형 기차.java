import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[][] train = new int[4][2];
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[4];
		int num = 0;
		
		for(int i =0; i<4; i++) {
			for(int j = 0; j<2; j++) {
			train[i][j] = sc.nextInt(); 
			}	
		
			sum[i] -= train[i][0];	
			sum[i] += train[i][1];
			
		}
		for(int i=0; i<3; i++) {
		sum[i+1] +=sum[i];	
		}
		
		for(int i=0; i<4; i++) {
			if(num<sum[i]) {
				num = sum[i];
			}
		}
		System.out.print(num);
	}
}