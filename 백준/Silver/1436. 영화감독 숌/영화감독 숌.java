import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 1<= N <= 10000
        int num = 666;
        int cnt = 1;
        
        while(N!=cnt){
            num++;
            
            if(Integer.toString(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);
    }
}
