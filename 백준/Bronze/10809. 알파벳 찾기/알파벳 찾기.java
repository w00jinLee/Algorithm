import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int arr[]= new int[26];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(arr[c-'a']==-1){
                arr[c-'a']=i;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}