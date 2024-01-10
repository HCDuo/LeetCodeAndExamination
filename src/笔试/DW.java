package 笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/10 10:19
 */
public class DW {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int x = in.nextInt();
//        in.nextLine();
//        String str = in.nextLine();
//        boolean marked = false;
//        if (n < x){
//            System.out.println(0);
//        }else {
//            for (int i = 0; i <= n - x; i++) {
//                String s = str.substring(i, i + x);
//                if (isPalindrome(s)) {
//                    marked = true;
//                    break;
//                }
//            }
//            if (marked) System.out.println(1);
//            else System.out.println(0);
//        }
//    }
//
//    private static boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//        while(left<right){
//            if (s.charAt(left) != s.charAt(right)){
//                return  false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }


    public static final int INF = 0x3f3f3f3f;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int[] dp = new int[m + 1];
        Arrays.fill(dp,INF);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= a[i] ; j--) {
                dp[j] = Math.min(dp[j],dp[j-a[i]] + 1 );
            }
        }
        System.out.println(dp[m] == INF ? "No solution" : dp[m]);
    }

}
