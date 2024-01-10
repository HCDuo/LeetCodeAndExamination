package 笔试;

import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/29 10:31
 */
public class 得物 {


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), x = in.nextInt();
//        char[] cheem = in.next().toCharArray();
//        int res = 1;
//        for (int i = 0; i < n; i++) {
//            int left = i - 1, right = i + 1;
//            while (left >= 0 && right < n && cheem[left] == cheem[right]) {
//                left--;
//                right++;
//            }
//            res = Math.max(res, (right - left - 1));
//            left = i; right = i + 1;
//            while (left >= 0 && right < n && cheem[left] == cheem[right]) {
//                left--;
//                right++;
//            }
//            res = Math.max(res, (right - left - 1));
//        }
//        System.out.println(res >= x ? "1" : "0");
//    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        if(x==1&&s.length() == 1){
            System.out.println(1);
        }
        boolean isBeautiful = false;
        for (int i = 0; i <= n-x ; i++){
            if(isOK(s.substring(i, i+x))){
                isBeautiful = true;
                break;
            }
        }
        if(isBeautiful){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    private static boolean isOK(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int x = in.nextInt();
//        long leftH = x - 1;
//        long rightH = n - x;
//        long i = m / n;
//        long j = m - n + 1;
//        long ans = 0;
//        while( i <= j ){
//            long mid = (j + i) >> 1;
//            long height = sum(leftH,mid) + sum(rightH,mid) + mid;
//            if (height == m){
//                ans = Math.max(ans,mid);
//                break;
//            } else if (height < m) {
//                ans = Math.max(ans,mid);
//                i = mid + 1;
//            } else{
//                j = mid - 1;
//            }
//        }
//        System.out.println(ans);
//    }
//
//    public static long sum(long C, long B){
//        long res = 0;
//        for (int i = 0; i < C; i++) {
//            if (B>1){
//                B--;
//            }
//            res += B;
//        }
//        return res;
//    }
}

