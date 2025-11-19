import java.util.Scanner;

class Solution {
    static int H;
    static int W;
    static char[][] arr;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            H = sc.nextInt();
            W = sc.nextInt();
            sc.nextLine();

            arr = new char[H][W];

            for (int i = 0; i < H; i++) {
                String str = sc.nextLine();
                for (int j = 0; j < W; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            int rowCnt = checkRow();
            int colCnt = checkCol();

            if (rowCnt == H && colCnt == W) {
                System.out.println(Math.min(rowCnt, colCnt));
            } else {
                System.out.println(rowCnt + colCnt);
            }
        }
        sc.close();
    }

    public static int checkRow() {
        int rowCnt = 0;
        for (int i = 0; i < H; i++) {
            int j = 0;
            while (j < W && arr[i][j] == '#') {
                j++;
            }
            if (j == W) { 
                rowCnt++;
            }
        }
        return rowCnt;
    }

    public static int checkCol() {
        int colCnt = 0;
        for (int j = 0; j < W; j++) {
            int i = 0;
            while (i < H && arr[i][j] == '#') {
                i++;
            }
            if (i == H) {
                colCnt++;
            }
        }
        return colCnt;
    }
}
