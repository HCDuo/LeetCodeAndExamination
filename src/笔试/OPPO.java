package 笔试;

import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/28 19:57
 */
public class OPPO {
    static char[] ans = new char[]{'a','e','i','o','u'};

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int n = in.nextInt();
//        int[] nums = new int[n + 1];
//        for (int i = 0; i < n; i++){
//            nums[i] = in.nextInt();
//        }
//        int ans = 0;
//        for (int left = 0; left < n; left ++) {
//            for (int right = left + 1; right < n; right ++) {
//                ans = Math.max(Math.min(right - left, left - right + n)*(nums[left]+nums[right]),ans);
//            }
//        }
//        System.out.println(ans);


//        char[] ans = new char[]{'a','e','i','o','u'};
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String s = in.next();
//        int n = s.length();
//        long last = 0;
//        char[] string = new char[s.length()];
//        for (int i = 0; i < string.length;i++){
//            string[i] = s.charAt(i);
//        }
//        for (int i = 0;i < n; i++){
//            for (int j = n - 1; j > i; j--) {
//                if (string[i] == string[j] && isOrNot(string[i],ans) ){
//                    last += isEqual(string, i , j);
//                }
//            }
//        }
//        System.out.println(last);

        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        int k = in.nextInt();
        int p = 0;
        int last;
        int x = 1;
        int[] nums = new int[n + 1];
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
            x *= nums[i];
        }
        int o1 = 0;
        int o2 = 0;
        int i = 100;
        while (i>0){

            p = isNums(x);
            int ks = Math.abs(k - p);
            i--;
        }

        System.out.println(o1 + " " + o2);
    }

    private static int isNums(int x){
        int ans = 0;
        for (int i = 0; i < x ;  i++ ){
            if (x % i == 0) {
                ans++;
            }
        }
        return ans;
    }

    private static boolean isOrNot(char a, char[] ans){
        for (int i = 0; i < ans.length; i++){
            if (a == ans[i]) return true;
        }
        return false;
    }

    private static int isEqual(char[] str1, int left, int right){
        int ans1 = 0;
        for(int i = left;i < right;i++){
            for (int j = i + 1; j < right;j++){
                if (str1[i] == str1[j] && !isOrNot(str1[i],ans)) ans1++;
            }
        }
        return ans1;
    }
}
