package 笔试;

import com.剑指_Offer.Node;
import com.剑指_Offer.TreeNode;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/10 20:02
 */
public class tencent {
//    1
//    public int pathNumber (TreeNode root) {
//        // write code here
//        return DFS(root,0,0);
//    }
//
//    private int DFS(TreeNode node, int count1, int count0) {
//        if (node == null) {
//            return 0;
//        }
//        count1 += node.val;
//        count0 += (1 - node.val );
//
//        if (node.left == null && node.right == null){
//            if (count1 > count0) return 1;
//        }
//        int pathCount = 0;
//        pathCount += DFS(node.left,count1,count0);
//        pathCount += DFS(node.right,count1,count0);
//        return pathCount;
//    }

//    2
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = in.nextInt();
//            int[] a = new int[n];
//            int[] b = new int[n-1];
//            for (int j = 0; j < n; j++) {
//                a[j] = in.nextInt();
//            }
//            for (int j = 0; j < n-1; j++) {
//                b[j] = in.nextInt();
//            }
//            double[] medians = validateMedians(a,b);
//            printMedians(medians);
//        }
//    }
//
//    private static double[] validateMedians(int[] a, int[] b) {
//        int n = a.length;
//        List<Integer> array = new ArrayList<>();
//        for (int num:a) {
//            array.add(num);
//        }
//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            int index = b[i] - 1;
//            int num = array.get(index);
//            array.remove(num);
//            result[i] = (int) calculateMedians(array);
//        }
//        return convert(result);
//    }
//
//    private static double calculateMedians(List<Integer> array) {
//        Collections.sort(array);
//        int size = array.size();
//        if (size % 2 == 1){
//            return array.get(size / 2);
//        }else {
//            int mid = size / 2;
//            int num1 = array.get(mid - 1);
//            int num2 = array.get(mid);
//            return (num1 + num2) / 2.0;
//        }
//    }
//
//    private static double[] convert(int[] array) {
//        int n = array.length;
//        double[] result = new double[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = array[i];
//        }
//        return result;
//    }
//
//    private static void printMedians(double[] medians) {
//        for (double median : medians) {
//            if (median % 1 == 0) {
//                System.out.print((int)median + " ");
//            }else {
//                System.out.printf("%.1f",median);
//            }
//        }
//    }

    static class myArray {
        int key;
        long value;

        public myArray(int key, long value) {
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            Map<Integer,myArray> map = new HashMap<>();
            List<myArray> list = new ArrayList<>();
            for (int j = 0; i < n; i++) {
                myArray array = new myArray(j,in.nextInt());
                map.put(j,array);
                list.add(array);
            }
            list.sort(Comparator.comparing(o -> o.value));
            while (true){
                if (n % 2 == 1) {
                    System.out.print(list.get(n / 2).value + " ");
                }else {
                    long sum = list.get(n / 2).value + list.get(n / 2 + 1).value;
                    if (sum % 2 == 0){
                        System.out.print(sum / 2 + " ");
                    }else {
                        System.out.printf("%.01f",sum / 2.0);
                        System.out.print(" ");
                    }
                }
                if (--n == 0){
                    break;
                }
                list.remove(map.get(in.nextInt() - 1));
            }
            System.out.println();
        }
    }
}
