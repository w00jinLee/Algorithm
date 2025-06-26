import java.util.*;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
      
    
    if(A == B ){
    	if(B == C) {
    			System.out.println(10000+A*1000);
    	} 
    if(B != C) {
    	System.out.println(1000+A*100);
    }
    }
    
    else if(B == C) {
    	if(C != A) {
    		System.out.println(1000+B*100);
    	}
    }
    
    else if(C == A) {
    	if(C != B)
    		System.out.println(1000+C*100);
    }
    
    else if(A != B && B != C && C != A) {
    	if(A>B && A>C)
    	System.out.println(A*100);
    	
    	if(B>C && B>A)
    		System.out.println(B*100);
    	if(C>B && C>A)
    		System.out.println(C*100);
    }
    sc.close();
    }
	
 }
