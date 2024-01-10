package 笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/9 19:32
 */
public class jinDong {

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = in.nextInt();
//        }
//        Arrays.sort(a);
//        long score = 0;
//        for (int i = n - 1; i >= 1; i--) {
//            if (a[i] - a[i-1] <= k){
//                score += (long) a[i] * a[i-1];
//                i--;
//            }
//        }
//
//        System.out.println(score);
//    }



//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n + 1];
//        for (int i = 0; i < n; i++){
//            a[i] = in.nextInt();
//        }
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = a[1];
//        for (int i = 0; i <= n; i++) {
//            dp[i] = Math.min(dp[i-1] + a[i], dp[i - 2] + a[i]);
//        }
//        System.out.println(dp[n]);
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        final long mod = (long) (1e9+7);

        long result = 0;

        long[] p = new long[ n + 1 ];
        for (long i = 0 ;i < n;i++){
            p[(int) i] = ((i + 1)*(i + 2)/2);
        }

        for (int i = 0;i < n;i++){
            result += (long) a[i] * (n - i) * p[i] % mod;
            result %= mod;
        }

        System.out.println(result);
    }

}
