import java.util.ArrayList;

public class problem4 {
    static int ans = 0;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int[] arr : edges) {
            int u = arr[0];
            int v = arr[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] visited = new boolean[n];

        dfs(0, visited, adjList, values, k);

        return ans;
    }

    public static int dfs(int source, boolean[] visited, ArrayList<ArrayList<Integer>> adjList,
            int[] values, int k) {

        visited[source] = true;

        int temp = values[source];

        for (int neighbour : adjList.get(source)) {
            if (!visited[neighbour]) {
                temp += dfs(neighbour, visited, adjList, values, k);
            }
        }
        if (temp % k == 0) {
            ans++;
            return 0;
        }
        return temp % k;
    }
}
