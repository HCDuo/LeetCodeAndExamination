package 笔试;

import java.util.*;

/**
 * <pre>
 * 现在小丽在城镇A，小明在城镇B。小丽要出发找小明。
 * 城镇之间有双向通行的道路，通过道路要消耗一定的时间。
 * 其中已知城镇C和城镇D之间有双向的传送门，可以不消耗时间瞬间传送过去。现在请你求出小丽从城镇A抵达城镇B的最短时间。保证从起点到终点有路径可达
 * 输入描述
 * 第一行两个正整数n,m，以空格分开，表示总共有n个城镇，有m条道路相连
 * 第二行两个正整数A,B，以空格分开，分别表示小丽所在城镇A，小明所在城城镇B。
 * 第三行两个正整数CD，以空格分开，表示城镇C和城镇D之间有瞬间的双向传送门。
 * 接下来m行，每行三个正整数u,c，以空格分开，表示城镇u和城镇V之间有道路，通过道路消耗时
 * 间C。
 * 对于100%的数据保证1sn s1001s ms2n每条道路的时间花费在[1,10]之间
 * 输出描述
 * 一行，一个整数表示最短到达时间
 *
 *A市可以看作是一个n行m列的方格图，第i行第列的坐标为(j)。
 * 其中一些坐标上有楼房，一些位置则为空这个区域内需要在(ty)这个坐标修一栋大楼，因此需要启用塔吊来完成这项建筑工作。
 * 但是塔吊不能安置在吊臂长度的范围内有其他楼房的位置。更准确地说，塔吊的吊臂长度为R，设塔吊安装的坐标为(dyd)，楼房的坐标为[xy)，
 * 那么所有楼房的坐标都必须满足Xd-x +yd-y>R。同时，塔用吊警必须能够到需要修大楼的位置，也就是|Xg-Xl+lydYtlsR。
 * 你的任务是找出有多少个坐标可以安置这个塔吊。注意，你只能把塔吊安置在空地位置.
 * 输入描述
 * 第一行输入三个正整数n,m,R
 * 接下来输入一个n行m列的字符矩阵，其中字符0表示这个地方为空地，1表示这个地方有一栋楼房，2表示需要修大楼的坐标。
 * 数据保证字符矩阵恰好有一个2。对于100%的数据1<n,m,R<400
 * 输出描述
 * 输出一个整数，表示能安置塔吊的坐标数量
 *
 *
 * 小明在玩一款全新的挂机游戏。小明有n个英雄，每天都在自动帮小明讨伐怪物获取赏金，渐新地这些尝金无法满足小明的发展需求了，
 * 需要挑战更困难的关卡获得更多的赏金。小明要给这些英雄升级来满足更困难关卡的入门要求，而这个游戏的升级方式非常特别，
 * 唯一升级方式就是让玩家自己选择自己的两个英雄进行每日历练，如果这两个英雄等级相同，则不会有任何事情发生;如果等级不同，
 * 等级高的那个英雄可以增加一级等级，而等级低的那个英雄等级不会发生任何变化。小明想要挑战的下一个关卡需求至少一位英雄等级达到2147483647级，
 * 小明想知道自己有多少个英雄有望达成这样的要求
 * 输入描述
 * 第一行1个整数n，表示小明的英雄数量第二行n个整数u1u2...n。表示小明英雄们的初始等级对于100%的数据，1sn<50000，1<u;s100000
 * 输出述
 * 输出一行，一个整数表示答案
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/8 19:30
 */
public class WeBank {
//    static class Edge{
//        int v;
//        int weight;
//        public Edge(int v, int weight) {
//            this.v = v;
//            this.weight = weight;
//        }
//    }
//    static class Dijkstra{
//        int[] dist;
//        boolean[] visited;
//        List<Edge>[] adjList;
//        PriorityQueue<Edge> pq;
//        public Dijkstra(List<Edge>[] adjList,int start){
//            int n = adjList.length;
//            this.adjList = adjList;
//            this.dist = new int[n];
//            Arrays.fill(dist,Integer.MAX_VALUE);
//            dist[start] = 0;
//            this.visited = new boolean[n];
//            this.pq = new PriorityQueue<>((e1,e2)->e1.weight-e2.weight);
//            pq.offer(new Edge(start,0));
//            while (!pq.isEmpty()){
//                Edge curr = pq.poll();
//                int u = curr.v;
//                if (visited[u]){
//                    continue;
//                }
//                visited[u] = true;
//                for (Edge e : adjList[u]) {
//                    int v = e.v;
//                    if (visited[v]){
//                        continue;
//                    }
//                    int newDist = dist[u] + e.weight;
//                    if (newDist < dist[v]){
//                        dist[v] = newDist;
//                        pq.offer(new Edge(v,newDist));
//                    }
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int d = in.nextInt();
//        List<Edge>[] adjList = new ArrayList[n];
//        for (int i = 0; i < n; i++) {
//            adjList[i] = new ArrayList<>();
//        }
//        for (int i = 0; i < m; i++) {
//            int u = in.nextInt();
//            int v = in.nextInt();
//            int w = in.nextInt();
//            u--;
//            v--;
//            adjList[u].add(new Edge(v,w));
//            adjList[v].add(new Edge(u,w));
//        }
//        adjList[c-1].add(new Edge(d-1,0));
//        adjList[d-1].add(new Edge(c-1,0));
//        Dijkstra dijkstra1 = new Dijkstra(adjList,a-1);
//        Dijkstra dijkstra2 = new Dijkstra(adjList,b-1);
//        int ans = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if(dijkstra1.visited[i]&&dijkstra2.visited[i]){
//                ans = Math.min(ans,dijkstra1.dist[i] + dijkstra2.dist[i]);
//            }
//        }
//        System.out.println(ans);
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int R = in.nextInt();
//        char[][] matrix = new char[n][m];
//        int xt = 0,yt = 0;
//        for (int i = 0; i < n; i++) {
//            String row = in.next();
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = row.charAt(j);
//                if (matrix[i][j] == '2'){
//                    xt = i;
//                    yt = j;
//                }
//            }
//        }
//        int count = 0;
//        int[] dx = new int[2*R+1];
//        for (int i = 0; i <= 2*R ;i++){
//            dx[i] = i-R;
//        }
//        int[] dy = new int[2*R+1];
//        for (int i = 0; i <= 2*R ;i++){
//            dy[i] = i-R;
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == '0'){
//                    boolean mark = true;
//                    for (int k = 0; k <= 2*R && mark; k++) {
//                        for (int l = 0; l <= 2*R && mark; l++) {
//                            int x1 = i + dx[k];
//                            int y1 = j + dy[l];
//                            if (x1 >=0 && x1<n && y1>=0 && y1<m && matrix[x1][y1] == '1'
//                            && (Math.abs(x1-i) + Math.abs(y1-j) <= R) ){
//                                mark = false;
//                            }
//                        }
//                    }
//                    if (mark && (Math.abs(xt-i) + Math.abs(yt-j) <= R)){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }

//    private static int log2(int x){
//        return (int)(Math.log(x) / Math.log(2));
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
//        int[] count  = new int[32];
//        for (int i = 0; i < n; i++) {
//            count[log2(a[i])]++;
//        }
//        int ans = 0;
//        for (int i = 0; i < n; i++) {
//            int u = a[i];
//            for (int j = 0; j < 32; j++) {
//                int lv = (1<<j) - u;
//                if(lv >= u && lv < count.length){
//                    ans += count[lv];
//                }
//            }
//        }
//        System.out.println(ans);
//    }

}
