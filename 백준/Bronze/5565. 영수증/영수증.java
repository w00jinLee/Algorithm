import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int Total = sc.nextInt();
	int sum =0;
	for(int i=0; i<9; i++) {
		
		int add = sc.nextInt();
		sum += add;
	}
	System.out.println(Total-sum);
	}
}
