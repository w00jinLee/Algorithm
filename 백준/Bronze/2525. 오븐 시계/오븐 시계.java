import java.util.*;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int a = A*60 + B + C;
    A = a/60;
    B = a%60;
    
    if(A>=24) {
    	A = A - 24;
    }
    System.out.println(A+ " " +B);
 }
}