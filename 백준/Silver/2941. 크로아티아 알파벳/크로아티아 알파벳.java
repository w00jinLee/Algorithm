import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for(int i=0; i<s.length; i++){
            if(str.contains(s[i])){
                str=str.replace(s[i], "!");
            }
        }

        
        System.out.println(str.length());
    }

}