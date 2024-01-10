package 笔试;

import com.剑指_Offer.ListNode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/11/4 19:25
 */
public class JXJK {
    public ListNode mergeNode (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.val % 2 == 1 && curr.next.val % 2 == 0){
                ListNode evenNode = curr.next;
                ListNode oddNode = curr;
                oddNode.val += evenNode.val;
                curr.next = evenNode.next;
            }else {
                curr = curr.next;
            }
        }
        return head;
    }

//    public double get_expect (int n) {
//        if (n == 1 || n == 2){
//            return 1.0;
//        }else {
//            double[] dp = new double[n + 1];
//            dp[1] = dp[2] = 1.0;
//            for (int i = 3; i <= n; i++) {
//                dp[i] = 1.0 + (1.0 / i) * (dp[i - 1] + dp[i - 2]);
//            }
//            return dp[n];
//        }
//    }

//    public double get_expect (int n) {
//        if (n == 1 || n == 2){
//            return 1.0;
//        }else {
//            double ans = 0;
//            for (int i = 0; i < n; i++) {
//                double left = i > 0 ? get_expect(i) : 0.0;
//                double right = i < n - 1 ? get_expect(n - i - 1) : 0.0;
//                ans += (left + right)/(n-1);
//            }
//            return ans;
//        }
//    }

    public static double get_expect(int n) {
        if (n == 1 || n == 2){
            return 1.000000000;
        }else {
            BigDecimal[] dp = new BigDecimal[n + 1];
            dp[1] = dp[2] = BigDecimal.valueOf(1.0);
            for (int i = 3; i <= n; i++) {
                BigDecimal iBig = BigDecimal.valueOf(i);
                dp[i] = dp[i-1].add(dp[i-2]).multiply(BigDecimal.valueOf(1.0/i)).add(BigDecimal.ONE);
            }
            return dp[n].setScale(0,RoundingMode.HALF_UP).doubleValue();
        }
    }

    public static void main(String[] args) {
        System.out.println(get_expect(3));
    }
}
