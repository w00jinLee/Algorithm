import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	//라운드에서 진행할 동전 개수 입력받기
	
	int[][] round1 = new int[N][2];
	int[][] round2 = new int[N][2];
	//두 개의 라운드 배열 생성
	int sum1 =0;
	
	
	for(int i=0; i<N; i++) {
		round1[i][0] = sc.nextInt(); 
		if(round1[i][0] <0) {
		round1[i][1] = round1[i][0]*(-1);
		}
		else {
			round1[i][1] = round1[i][0];
		}
	}
	for(int i=0; i<N; i++) {
		round2[i][0] = sc.nextInt();
		if(round2[i][0]<0) {
		round2[i][1] = round2[i][0]*(-1);
		}
		else {
			round2[i][1] = round2[i][0];
		}
	}
		for(int i=0; i<N; i++) {
			sum1+= round1[i][1];
			sum1+= round2[i][1];
		}
	System.out.print(sum1);
	
	}
}
//동전에 적히는 수는 절댓값 10,000 이하의 정수.