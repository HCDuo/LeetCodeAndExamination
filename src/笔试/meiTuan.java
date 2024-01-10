package 笔试;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/9 10:09
 */
public class meiTuan {

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        String Original = in.nextLine();
//        int k  = in.nextInt();
//        for (int i = 0; i < k;i++){
//            StringBuilder newString = new StringBuilder();
//            for (char c : Original.toCharArray()) {
//                if (c == 'a'){
//                    newString.append("bc");
//                }else if (c == 'b'){
//                    newString.append("ca");
//                }else if (c == 'c'){
//                    newString.append("ab");
//                }
//            }
//            Original = newString.toString();
//        }
//        System.out.println(Original);
//        in.close();
//
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int n = in.nextInt();
//        long[] a = new long[n];
//        long[] b = new long[n];
//        for (int i = 0; i < n; i++){
//            a[i] = in.nextLong();
//            b[i] = a[i];
//        }
//        for (int i = 1; i < n; i++){
//            b[i] += b[i - 1];
//        }
//        long sum = 0;
//        for (long num : a){
//            sum += num;
//        }
//        Map<Long,Integer> local = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            local.put(a[i],i);
//        }
//        Arrays.sort(a);
//        for (int i = n-1; i >= 0; i--) {
//            int key = local.get(a[i]);
//            if (key != 0) {
//                if (b[key-1] >= a[i]){
//                    System.out.println(sum-2*a[i]);
//                    break;
//                } else if (i == 0) {
//                    System.out.println(-1);
//                }
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        String s = in.next();
//        int seg = 1;
//        for (int i = 1; i < n; i++){
//            if (s.charAt(i) != s.charAt(i-1)){
//                seg++;
//            }
//        }
//        if (k >= seg - 1) {
//            System.out.println(1);
//        }else {
//            System.out.println(2);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        a[0] = 1;
//        int ans = 0;
//        int k = 0;
//        for (int i = 1; i < n; i++){
//            a[i] = a[i-1] + i;
//            if (a[i] <= m) {
//                ans++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//            if (i < n - 1){
//                System.out.println(" ");
//            }
//        }
//    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long[] array = new long[n];
//        for (int i = 0; i < n; i++)
//            array[i] = in.nextLong();
//
//        long mod = (long)1e9+7;
//        long sum = 0;
//        for (int i = 0; i < n; i++) {
//            long xorSum = 0;
//            for (int j = i + 1; j > 0; j--){
//                 = array[i]^array[j]
//                xorSum^=array[j];
//                sum = (sum + xorSum)%mod;
//            }
//        }
//        System.out.println(sum);
//    }

}
