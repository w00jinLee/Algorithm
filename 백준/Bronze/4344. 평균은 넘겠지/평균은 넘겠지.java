
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int C = sc.nextInt();  //테스트 케이스 개수
    
    for(int i=0; i<C; i++){
      int sum = 0;        // sum은 점수 합 
      float average = 0;  // average는 평균
      float num = 0;      /* num은 평균보다 
                            점수가 높은 학생 수*/
      float rate = 0;     /*rate는 평균보다 점수가 
                           높은 학생 수의 비율*/
      
      int N = sc.nextInt();    //N은 학생 수 
      int[] arr = new int[N];  //N학생 수 길이의 배열
      
      for(int j=0; j<N; j++){
        int score = sc.nextInt(); 
        arr[j] = score;     //점수 입력 받고 배열에 저장
        sum += arr[j];      //입력 받은 값 계속 sum에 더해줌
      } 
        average = sum/N;    //평균 값 구하기
      
      for(int k=0; k<N; k++){
        if(arr[k]>average){
          num += 1;      /* 평균보다 점수가 클 경우
                            rate에 1 더해주기*/
        }
      }
      rate = num/N;
      String rates = String.format("%.3f", rate*100);
      System.out.println(rates+"%");

    }
    }
  }