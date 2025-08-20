import java.util.Scanner;

class Main{
    static int[] f;
    static int n, cnt1, cnt2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        f = new int[n];
        fib(n);
        fibonacci(n);

        sc.close();

        System.out.println(cnt1+" "+cnt2);

    }
    
    public static int fib(int n){
        if (n==1 || n==2){
            cnt1++;
            return 1;
        }
        else {
            return (fib(n-1) + fib(n-2));
        }
    }

    public static int fibonacci(int n){
        f[0] = f[1] = 1;

        for(int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
            cnt2++;
        }

        return f[n-1];
    }
}