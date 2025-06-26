
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	int A;
	int B;
	int C;
	int D;
	
	A = (x+y)%z;
	B = ((x%z)+(y%z))%z;
	C = (x*y)%z;
	D = ((x%z)*(y%z))%z;
    
	System.out.println(A);
	System.out.println(B);
    System.out.println(C);
    System.out.println(D);

	}
}
