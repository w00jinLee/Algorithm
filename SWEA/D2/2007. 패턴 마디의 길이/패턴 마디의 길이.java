import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.nextLine();

            for (int len = 1; len <= 10; len++) { 
                int i;
                for (i = len; i < 30; i++) {
                    if (str.charAt(i) != str.charAt(i % len)) {
                        break; 
                    }
                }
                
                if (i == 30) { 
                    System.out.println("#" + test_case + " " + len);
                    break; 
                }
            }
        }

        sc.close();
    }
}
