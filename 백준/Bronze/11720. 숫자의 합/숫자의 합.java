import java.util.*;

public class Main {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String st = new String();
	st = sc.next();
	int sum =0;
	 
	for(int i = 0; i<N; i++) {
		sum += st.charAt(i)-48;
	}
	System.out.print(sum);
	}
}