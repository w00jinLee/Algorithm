import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    static boolean visited[];
    static ArrayList<ArrayList<Integer>> list;
    static int num[];
    static int num2[];
    static int cnt;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 수
        int M = sc.nextInt(); // 간선의 수
        int R = sc.nextInt(); // 시작 정점

        visited = new boolean[N + 1];
        list = new ArrayList<ArrayList<Integer>>();
        num = new int[N + 1];
        num2 = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i)); // 정점 번호가 작은 순서대로 정렬
        }

        cnt = 1;
        dfs(R);

        for (int i = 1; i <= N; i++) {
            if (num[i] != 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();

        visited = new boolean[N + 1];
        cnt = 1;
        bfs(R);

        for (int i = 1; i <= N; i++) {
            if (num2[i] != 0) {
                System.out.print(num2[i] + " ");
            }
        }
    }

    public static void dfs(int R) {
        visited[R] = true;
        num[cnt++] = R;

        for (int i : list.get(R)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int R) {
        queue.add(R);
        visited[R] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            num2[cnt++] = current;

            for (int i : list.get(current)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
