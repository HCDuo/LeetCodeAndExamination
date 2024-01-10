package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/29 10:43
 */
public class ManBang {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long[] a = new long[n+1];
//        a[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            if(i % 2 == 0){
//                a[i] = a[i-1] + 1;
//            } else {
//                a[i] = a[i-1] * 2;
//            }
//            a[i] %= 1000000007;
//        }
//        System.out.println(a[n]);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t > 0) {
            int n = in.nextInt();
            in.nextLine();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            in.nextLine();
            String result = can(n,a);
            System.out.println(result);
        }
    }

    private static String can(int n, int[] a) {
        Set<String> snake = new HashSet<>();
        int dir = 0;
        int x = 0,y = 0;
        int len = 0;
        int place = 0;
        for (int i = 0; i < sum(a); i++) {
            snake.add(x+","+y);
            if (dir == 0){
                x++;
            }else if (dir == 1){
                y--;
            }else if (dir == 2){
                x--;
            }else {
                y++;
            }
            len++;
            if (len == a[place]){
                len = 0;
                dir = (dir  + 1) % 4;
                place+=1;
            }
            if(snake.contains(x+","+y)) {
                return "Yes";
            }
        }
        return "No";
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int num: a) {
            sum+=num;
        }
        return sum;
    }

}
