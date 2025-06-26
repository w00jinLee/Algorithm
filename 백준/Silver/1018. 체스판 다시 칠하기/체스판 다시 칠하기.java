import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        
        String[][] arr = new String[N][M];
        int num = 64; 

        // 배열 입력받기
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        // 체스판 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int cntB = 0;
                int cntW = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (!arr[i + k][j + l].equals("B")) cntB++;
                            if (!arr[i + k][j + l].equals("W")) cntW++;
                        } else {
                            if (!arr[i + k][j + l].equals("W")) cntB++;
                            if (!arr[i + k][j + l].equals("B")) cntW++;
                        }
                    }
                }

                // 최소값 갱신
                int currentMin = Math.min(cntB, cntW);
                if (currentMin < num) {
                    num = currentMin;
                }
            }
        }

        System.out.println(num);
    }
}
