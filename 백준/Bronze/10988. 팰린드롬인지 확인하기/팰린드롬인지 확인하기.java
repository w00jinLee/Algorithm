import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String Reverse = sb.reverse().toString();

        if(str.equals(Reverse)){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        
    }
}