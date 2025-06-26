import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0; 
        int N = sc.nextInt();
        sc.close();
        
        while(N>=0){
            if(N%5==0){
                num+=N/5;
                System.out.println(num);
                return;
            }  
            N-=3; 
            num++;
        }
   
        System.out.println(-1);
    }    
}