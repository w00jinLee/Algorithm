import java.util.Scanner;
import java.util.Stack;

class Main{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int sum=0;
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(str.charAt(i-1)==')' && str.charAt(i)==')'){
                    sum++;
                    stack.pop();
                }   
                else{
                    stack.pop();
                    sum+=stack.size();
                }
            }
        }
        System.out.println(sum);
    }
}