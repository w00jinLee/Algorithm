import java.util.Scanner;

class Main{
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a == -1 && b == -1 && c == -1){
                break;
            }
            System.out.println("w("+a+", "+b+", "+c+") = "+ func(a, b, c));
        }

        sc.close();        
    }

    public static int func(int a, int b, int c){
        if (a >= 0 && b >= 0 && c >= 0 && a <= 20 && b <= 20 && c <= 20 && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }
        
        int result;
        if(a <= 0 || b <= 0 || c <= 0){
            result = 1;
        }
        else if(a > 20 || b > 20 || c > 20){
            result = func(20, 20, 20);
        }
        else if(a < b && b < c){
            result = func(a, b, c-1) + func(a, b-1, c-1) - func(a, b-1, c);
        }
        else{
            result = func(a-1, b, c) + func(a-1, b-1, c) + func(a-1, b, c-1) - func(a-1, b-1, c-1);
        }
                
        if (a >= 0 && b >= 0 && c >= 0 && a <= 20 && b <= 20 && c <= 20) {
            dp[a][b][c] = result;
        }

        return result;
    }

}