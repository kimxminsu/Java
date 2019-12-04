import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int V = 10;
        String input = "0 1 2 3 3 4 5 6 6 7 7 8 8 9";
        LinkedList<Integer> adjList[] = new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i] = new LinkedList<>();
        String s[] = input.split("\\s+");
        for (int i = 0; i < s.length; i += 2) {
            int v1 = Integer.parseInt(s[i]);
            int v2 = Integer.parseInt(s[i + 1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        int groups[] = connected(adjList, V);
        System.out.println(Arrays.toString(groups));
        System.out.println(isFriend(groups, 1, 4));
        System.out.println(isFriend(groups, 5, 9));   // input="0 1 2 3 3 4 5 6 6 7 7 8 8 9 4 5";
    }
    private static char[] isFriend ( int[] groups, int i, int j){

        return null;
    }


    private static int[] connected (LinkedList < Integer >[]adjList,int v){
        int groups[] = new int[V];
        int label = 0;
        //그래프 내 모든 노드에 대해 미방문 시 아래 dfs 호출
        for (int v = 0; v < V; v++) {
            if (groups[v] == 0) dfs(adjList, V, i, groups, ++label);//0-1-2-3
        }

        return groups;
    }

    private static void dfs (LinkedList < Integer >[]adjList,int V, int v, int[] groups, int label){
        groups[v] = label;//visited[v]=true;
        //현재 노드
        for (int w : adjList[v]) {
            if (groups[w] == 0) dfs(adjList, V, W, groups, label);
        }
    }
}