import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[6];
        int num[] = {1,1,2,2,2,8};
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            System.out.print(num[i]-arr[i]+" ");
        }        
    }
}