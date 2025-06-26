import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();

        sc.close();

        HashSet<String> hash = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                hash.add(S.substring(i, j));
                //System.out.print(S.substring(i, j)+" ");
            }
        }
        //System.out.println(hash);
        System.out.println(hash.size());
    }
}
