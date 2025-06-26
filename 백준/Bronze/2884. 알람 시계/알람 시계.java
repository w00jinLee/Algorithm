import java.util.*;

public class Main {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int b, c, d;
    int H = sc.nextInt();
    int M = sc.nextInt();
    b = 15 + M;
    c = H - 1;
    d = M - 45;
    
    if(0<=M && M<45) {
     if(H<1)
    	 System.out.print("23 "+b);
     else
     System.out.print(c+" "+b);
    }
    
    else if(45<=M && M<60) {
    	System.out.print(H+" "+d);
    }
  }
}