package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/13 20:02
 */
public class mi {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        in.nextLine();
//        char[][] matrix = new char[n][m];
//        for (int i = 0; i < n; i++) {
//            String str = in.nextLine();
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = str.charAt(j);
//            }
//        }
//        int count = findSbu(matrix);
//        System.out.println(count);
//    }
//
//    private static int findSbu(char[][] matrix) {
//        int count = 0;
//        int n = matrix.length;
//        int m = matrix[0].length;
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = 0; j < m - 2; j++) {
//                if (containChar(matrix,i,j)){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    private static boolean containChar(char[][] matrix, int row, int col) {
//        char[] chars = {'x','i','a','o','m','i'};
//        boolean[] find = new boolean[chars.length];
//        for (int i = row; i < row + 3; i++) {
//            for (int j = col; j < col + 3; j++) {
//                char cur = matrix[i][j];
//                for (int k = 0; k < chars.length; k++) {
//                    if (!find[k] && cur == chars[k]){
//                        find[k] = true;
//                        break;
//                    }
//                }
//            }
//        }
//        for (boolean b : find) {
//            if (!b) {
//                return false;
//            }
//        }
//        return true;
//    }

    static int N = (int) (1e5+7);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = countStr(str);
        System.out.println(count);
    }

    private static int countStr(String str) {
        long[][] dp1 = new long[N][5];
        long[][] dp2 = new long[N][5];
        long len = str.length();
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < 4; j++) {
                dp1[i][j] = dp1[i-1][j];
            }
            for (int j = 0; j < 2; j++) {
                dp2[i][j] = dp2[i-1][j];
            }
            if (str.charAt(i-1) == 'x'){
                ++dp1[i][0];
            } else if (str.charAt(i-1) == 'i') {
                dp1[i][1] += dp1[i-1][0];
                dp2[i][1] += dp2[i-1][0];
            } else if (str.charAt(i - 1) == 'a') {
                dp1[i][2] += dp1[i-1][1];
            } else if (str.charAt(i - 1) == 'o') {
                dp1[i][3] += dp1[i-1][2];
            } else if (str.charAt(i - 1) == 'm') {
                ++dp2[i][0];
            }
        }
        long ans = 0;
        for (int i = 1; i <= len; i++) {
            ans += dp1[i][3] + dp2[i][1];
        }
        return (int) ans;
    }

}
