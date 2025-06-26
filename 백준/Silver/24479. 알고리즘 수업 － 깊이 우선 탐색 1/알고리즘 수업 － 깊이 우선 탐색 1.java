import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static boolean visited[];
    static ArrayList<ArrayList<Integer>> list;
    static int num[];
    static int cnt = 1;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 수 N (5 ≤ N ≤ 100,000)
        int M = sc.nextInt(); // 간선의 수 M(1 ≤ M ≤ 200,000)
        int R = sc.nextInt(); // 시작 정점 R(1 ≤ R ≤ N)

        
        visited = new boolean[N+1];
        list = new ArrayList<ArrayList<Integer>>();
        num = new int[N+1];
        
        for(int i=0; i<=N; i++){    
            list.add(new ArrayList<Integer>());    
        }

        for(int i=0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            list.get(u).add(v); // 1 4 입력이면 1행에 4추가, 
            list.get(v).add(u); // 4행에 1 추가
        }
        for(int i=0; i<N; i++){
            Collections.sort(list.get(i));
        }
        
        dfs(R);
        //i번째 줄에 정점 i의 방문 순서를 출력 
        for(int i=1; i<=N; i++){
            System.out.println(num[i]);
        }
    }

    public static void dfs(int R){
        visited[R]=true;
        num[R]= cnt++;
        // 1 - 2, 4
        // 2 - 1, 3, 4
        // 3 - 2, 4
        // 4 - 1, 2, 3
        
        for(int i : list.get(R)){     
            if(visited[i]==false)   {
                dfs(i);
            }
        }
    }
}