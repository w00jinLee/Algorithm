import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int[] arr2 = new int[10];
  
    int num1 = 0;
    int j = 1;
    for(int i=0; i<arr.length; i++){
      int x = sc.nextInt();
      arr[i] = x;
    }
    for(int i=0; i<arr2.length; i++){
      num1 = arr[i]%42;
      arr2[i] = num1;
    }

    Arrays.sort(arr2);
    for(int i=0; i<arr2.length-1; i++){
      if(arr2[i]!= arr2[i+1]){
        j++;
      }
    }
    System.out.println(j);
    }
  }