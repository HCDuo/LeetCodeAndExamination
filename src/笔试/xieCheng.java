package 笔试;

import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/7 18:48
 */
public class xieCheng {
//    1
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int ans = 0;
//        int[] a = new int[n];
//        boolean[] visited = new boolean[n+1];
//        ans = count(a,visited,0);
//        System.out.println(ans);
//    }
//
//    private static int count(int[] a, boolean[] visited, int index){
//        int n = a.length;
//        if (index == n) {
//            return 1;
//        }
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (!visited[i] && (index == 0 || !isPrime(a[index -1 ] + i))) {
//                visited[i] = true;
//                a[index] = i;
//                count += count(a,visited,index + 1);
//                visited[i] = false;
//            }
//        }
//        return count;
//    }
//
//    private static boolean isPrime(int num){
//        if (num < 2) {
//            return false;
//        }
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//    2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }
        int count = 0;
        count = countTriangles(matrix);
        System.out.println(count);
    }

    private static int countTriangles(char[][] matrix){
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += countTrianglesSide(n,m,i,j,matrix[i][j],matrix);
            }
        }
        return count;
    }

    private static int countTrianglesSide(int n, int m, int row, int col, char chars, char[][] matrix){
        int count = 0;
        if(chars == 'y'){
            for (int i = 0; i < n - row; i++){
                for (int j = 0; j < m - col; j++) {
                    if ( i + 1 < n && j + 1 < m){
                        System.out.println(matrix[row + i][col]);
                        System.out.println(matrix[i][j+1]);
                        if ((matrix[i + 1][j] == 'u' && matrix[i][j + 1] == 'o' ) ||
                                (matrix[i + 1][j] == 'o' && matrix[i][j + 1] == 'u'))
                            count++;
                    }
                }
            }
        }else if(chars == 'o'){
            for (int i = row; i < n; i++){
                for (int j = col; j < m; j++) {
                    if ( i + 1 < n && j + 1 < m) {
                        System.out.println(matrix[i + 1][j]);
                        System.out.println(matrix[i][j+1]);
                        if ((matrix[i + 1][j] == 'u' && matrix[i][j + 1] == 'y' && i + 1 < n && j + 1 < m) ||
                                (matrix[i + 1][j] == 'y' && matrix[i][j + 1] == 'u' && i + 1 < n && j + 1 < m))
                            count++;
                    }
                }
            }
        } else if (chars == 'u') {
            for (int i = row; i < n; i++){
                for (int j = col; j < m; j++) {
                    if ( i + 1 < n && j + 1 < m) {
                        System.out.println(matrix[i + 1][j]);
                        System.out.println(matrix[i][j+1]);
                        if ((matrix[i + 1][j] == 'o' && matrix[i][j + 1] == 'y' && i + 1 < n && j + 1 < m) ||
                                (matrix[i + 1][j] == 'y' && matrix[i][j + 1] == 'o' && i + 1 < n && j + 1 < m))
                            count++;
                    }
                }
            }
        }
        return count;
    }

    //3
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t != 0) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int l = in.nextInt();
//            int r = in.nextInt();
//            System.out.println(-1);
//            t--;
//        }
//    }


//    4
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        long count = countGoodString(s);
//        System.out.println(count - 1);
//    }
//
//    private static long countGoodString(String s) {
//        long count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int ZeroCount = 0;
//            int OneCount = 0;
//            for (int j = i; j < s.length(); j++) {
//
//                if (s.charAt(j) == '0'){
//                    ZeroCount++;
//                }else {
//                    OneCount++;
//                }
//
//                if (ZeroCount>OneCount){
//                    count ++;
//                }
//            }
//        }
//        return count;
//    }

}
