package 笔试;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/6 18:54
 */
public class tencent_music {
//    public int perfectPair (int[] arr) {
//        int result = 0;
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for(int num : arr) {
//            int nonZero = getNonZero(num);
//            map.put(nonZero,map.getOrDefault(nonZero,0)+1);
//        }
//        for (int num : arr) {
//            for (int dight = 1; dight <= 9 ;dight++) {
//                long prod = (long)num * dight;
//                int nonZero1 = getNonZero((int)prod);
//                if (nonZero1 != 0 && map.containsKey(nonZero1))
//                {
//                    result += map.get(nonZero1);
//                }
//            }
//        }
//        return result;
//    }
//
//    private int getNonZero(int num) {
//        while ( num != 0){
//            int dight = num%10;
//            if (dight != 0){
//                return dight;
//            }
//            num /= 10;
//        }
//        return 0;
//    }


//    public int perfectPair (int[] arr) {
//        int result = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length;j++){
//                if (isOK(arr[i]*arr[j])) result++;
//            }
//        }
//        return result;
//    }
//
//    private boolean isOK(int num) {
//        int count = 0;
//        while ( num != 0){
//            int dight = num % 10;
//            if (dight != 0){
//                count++;
//                if (count > 1) {
//                    return false;
//                }
//            }
//            num /= 10;
//        }
//        return true;
//    }


    public int kawaiiStrings (int n) {
        int mod = 1000000007;
        // write code here
        int [][] dp = new int[n+1][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
//        dp[1][0] = dp[1][1] = dp[1][2] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = (dp[i-1][0]+dp[i-1][1])%mod;

            dp[i][1] = (dp[i-1][0]+dp[i-1][1])%mod;
            if (i >= 2) {
                dp[i][1] = (dp[i][1]+dp[i-2][0])%mod;
            }
        }

        return  (dp[n][0] + dp[n][1])%mod;
    }

//    public int cntOfTrees (int n) {
//        long mod = 1000000007;
//        long[] dp = new long[n +1 ];
//        dp[0] = 1;
//        dp[2] = 1;
//        for (int i = 4; i <= n ; i+=2) {
//            for (int j = 0; j < i - 2; j+=2) {
//                dp[i] += dp[j] * dp[i-j-2];
//                dp[i] %= mod;
//            }
//        }
//        return (int)dp[n];
//    }


}
