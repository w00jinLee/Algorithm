import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        arr = new int[N][M];
        visited = new boolean[N][M]; 

        for(int i=0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        sc.close();

        System.out.println(func());
    }   
    
    static int func(){
        Queue<int[]> q = new LinkedList<>();
        q.add((new int[]{0,0}));
        visited[0][0] = true;

        int[][] dist = new int[N][M];
        dist[0][0]=1;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];

            if(y==N-1 && x==M-1){
                return dist[y][x];
            }

            // 아래
            if (y + 1 < N && arr[y + 1][x] == 1 && !visited[y + 1][x]) {
                visited[y + 1][x] = true;
                dist[y + 1][x] = dist[y][x] + 1;
                q.add(new int[]{y + 1, x});
            }

            // 위
            if (y - 1 >= 0 && arr[y - 1][x] == 1 && !visited[y - 1][x]) {
                visited[y - 1][x] = true;
                dist[y - 1][x] = dist[y][x] + 1;
                q.add(new int[]{y - 1, x});
            }

            // 오른쪽
            if (x + 1 < M && arr[y][x + 1] == 1 && !visited[y][x + 1]) {
                visited[y][x + 1] = true;
                dist[y][x + 1] = dist[y][x] + 1;
                q.add(new int[]{y, x + 1});
            }

            // 왼쪽
            if (x - 1 >= 0 && arr[y][x - 1] == 1 && !visited[y][x - 1]) {
                visited[y][x - 1] = true;
                dist[y][x - 1] = dist[y][x] + 1;
                q.add(new int[]{y, x - 1});
            }
        }
        return 0;
    }
}
