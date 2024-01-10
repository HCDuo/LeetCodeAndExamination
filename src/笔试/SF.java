package 笔试;

import javafx.util.Pair;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/27 16:32
 */
public class SF {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long m = in.nextInt();
//        long[] a = new long[n +1];
//        for (int i = 1; i <= n; i++) {
//            a[i] = in.nextInt();
//        }
//        Arrays.sort(a,1,n+1);
//        long groupNum = 0;
//        int left = 1;
//        int right = n;
//        while (left <= right  && a[right] * (right-left+1) >= m) {
//            groupNum++;
//            long p = (int)Math.ceil((m+a[right])/a[right])-1;
//            right--;
//            left+=p;
//        }
//        System.out.println(groupNum);
//    }

    static class Pair implements Comparable<Pair>{
        long first;
        long second;
        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
        @Override
        public int compareTo(Pair other) {
            if(this.first != other.first){
                return Long.compare(this.first,other.first);
            }else {
                return Long.compare(this.second,other.second);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Pair> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long second = in.nextLong();
            long first = in.nextLong();
            a.add(new Pair(first,second));
        }
        Collections.sort(a,Collections.reverseOrder());
        long ans = 0;
        long now = 0;
        int l = 1;
        int r = n;
        while (l <= r){
            if(now < a.get(r).first){
                if (now + a.get(r).second >= a.get(l).first){
                    long now1 = Math.max(now,a.get(l).first);
                    ans += 2*(now1 - now);
                    ans += a.get(l).second;
                    a.get(r).second -= now1 - now;
                    now = now1 + a.get(l).second;
                    l++;
                    if (a.get(r).second == 0) {
                        r--;
                    }
                }else {
                    ans += 2 * a.get(r).second;
                    now += a.get(r).second;
                    r--;
                }
            } else {
                ans += a.get(r).second;
                now += a.get(r).second;
                r--;
            }
        }
        System.out.println(ans);
    }
}
