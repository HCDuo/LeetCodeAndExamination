package 笔试;

import java.awt.image.Kernel;
import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/15 10:03
 */
public class wangYI {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t!=0) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int day = a/b;
//            if (a%b>0) day++;
//            System.out.println(day);
//            t--;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String x = in.nextLine();
//        int sum = 0;
//        int len = x.length();
//        int[] dp = new int[len];
//        dp[0] = Integer.parseInt(String.valueOf(x.substring(0,1)));
//        dp[1] = Integer.parseInt(String.valueOf(x.substring(0,2)));
//        for (int i = 2; i < len; i++) {
//            dp[i] = Math.max(dp[i-1] + Integer.parseInt(String.valueOf(x.substring(i,i+1))),
//                    dp[i-2] + Integer.parseInt(String.valueOf(x.substring(i-1,i+1))));
//        }
//        System.out.println(dp[len-1]);
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        List<Set<Integer>> langList = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int k = in.nextInt();
//            Set<Integer> langs = new HashSet<>();
//            for (int j = 0; j < k; j++) {
//                int lang = in.nextInt();
//                langs.add(lang);
//            }
//            langList.add(langs);
//        }
//        int[][] graph = buildGraph(n, langList);
//        int count = countConnections(graph);
//        System.out.println(count-1);
//    }
//
//    private static int[][] buildGraph(int n, List<Set<Integer>> langList) {
//        int[][] graph = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (canCommunicate(langList.get(i),langList.get(j))){
//                    graph[i][j] = 1;
//                    graph[j][i] = 1;
//                }
//            }
//        }
//        return graph;
//    }
//
//    private static boolean canCommunicate(Set<Integer> lang1, Set<Integer> lang2) {
//        for (int lang : lang1) {
//            if (lang2.contains(lang)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static int countConnections(int[][] graph) {
//        int n = graph.length;
//        boolean[] visited = new boolean[n];
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (!visited[i]) {
//                dfs(graph,visited,i);
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static void dfs(int[][] graph, boolean[] visited, int u) {
//        visited[u] = true;
//        for (int i = 0; i < graph.length; i++) {
//            if (graph[u][i]==1 && !visited[i]){
//                dfs(graph,visited,i);
//            }
//        }
//    }

}
