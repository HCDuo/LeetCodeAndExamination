package 笔试;

import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/17 16:29
 */
public class MeiDi {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        int score = calulateScore(str);
//        System.out.println(score);
//    }
//
//    private static int calulateScore(String str) {
//        int score = 0;
//        int combo = 0;
//        int missCount = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            switch (c) {
//                case 'P':
//                    if (combo >= 3){
//                        score += 15;
//                    }else {
//                        score += 10;
//                    }
//                    combo ++;
//                    missCount = 0;
//                    break;
//                case 'G':
//                    score += 5;
//                    combo = 0;
//                    missCount = 0;
//                    break;
//                case 'M':
//                    combo  = 0;
//                    missCount ++;
//                    if (missCount == 3) {
//                        return -1;
//                    }
//                    break;
//                default:
//                    throw new IllegalArgumentException("INPUT ORROR" + c);
//            }
//        }
//        return score;
//    }

    private static int count;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.nextLine();
        char[][] area = new char[x][y];
        for (int i = 0; i < x; i++) {
            String line = in.nextLine();
            area[i] = line.toCharArray();
        }

        count = closeArea(area);

        System.out.println(count);
    }

    private static int  closeArea(char[][] area) {
        int m = area.length;
        int n = area[0].length;
        if (m < 3 || n < 3){
            return 0;
        }
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (area[i][j] == '*'){
                    DFS(area,visited,i,j);
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (area[i][j] == '0' && !visited[i][j]) {
                    ans ++;
                }
            }
        }
        return ans - 2;
    }

    private static void DFS(char[][] area, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= area.length || col < 0 || col >= area[0].length){
            return;
        }
        if (visited[row][col] || area[row][col] == '*')
        {
            return;
        }
        visited[row][col] = true;
        DFS(area, visited, row - 1, col);
        DFS(area, visited, row + 1, col);
        DFS(area, visited, row, col - 1);
        DFS(area, visited, row, col + 1);
    }

}
