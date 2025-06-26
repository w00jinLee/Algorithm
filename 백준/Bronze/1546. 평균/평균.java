import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    float[] newgrade = new float[N];
    float sum = 0;
    int M = 0;
    float average = 0; 
      
    for(int i=0; i<N; i++){
      int score = sc.nextInt();
      arr[i] = score;
      if(arr[i]>M){
        M = arr[i];            //배열에 점수넣고 최댓값정하기
      }
    }
    
    for(int i=0; i<arr.length; i++){
     newgrade[i] = (float)arr[i]*100/M;      //M*100해주고 
    sum += newgrade[i];
    }
    average = sum/N;
    System.out.println(average);
    }
  }