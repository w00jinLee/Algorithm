import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<T; i++){
            String str = sc.nextLine();

            if(str.length()<2){
                System.out.println(str+""+str);
            }
            else{
                System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            }

        }
        sc.close();
    }
}