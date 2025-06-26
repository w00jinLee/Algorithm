import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] chArr = new char[5][15];
        String result="";
        for(int i=0; i<5; i++){
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                chArr[i][j] = str.charAt(j);
            }
        }
        
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(chArr[j][i]!='\0'){
                    result+=chArr[j][i];
                }

            }
        }
        System.out.println(result);
    }
}