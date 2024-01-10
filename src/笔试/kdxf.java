package 笔试;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/15 19:27
 */
public class kdxf {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.close();
//        int idx = 0;
//        int num = 2;
//        char[] s = new char[200006];
//        char[] stk = new char[200006];
//        int top = 0;
//        s[0] = '0';
//        while (idx <= 100000){
//            int p = num;
//            while (p != 0){
//                stk[++top] = (char)('0' + p % 10);
//                p/=10;
//            }
//            while (top!=0){
//                s[++idx] = stk[top--];
//            }
//            num+=2;
//        }
//        System.out.println(s[n-1]);
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        List<Integer>  permutation = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            permutation.add(i+1);
//        }
////        for (int i = n - 1,j = 0; i >= k; i--,j++) {
////            Collections.swap(permutation,j,i);
////        }
//        Collections.reverse(permutation.subList(0,n-k+1));
//        for (int num : permutation) {
//            System.out.print(num + " ");
//        }
//    }

    static int n;
    static int[] a;
    static int[] b;
    static List<Integer> group1 = new ArrayList<>();
    static List<Integer> group2 = new ArrayList<>();
    static boolean[] used;
    static int sumA = 0;
    static int sumB = 0;
    static boolean[][][] memory;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        b = new int[n];
        used = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            sumA += a[i];
            sumB += b[i];
        }
        if (sumA % 2 == 0 && sumB % 2 == 0) {
            memory = new boolean[n][sumA + 1][sumB + 1];
            if (findGroud(0,0,0)){
                System.out.println(group1.size() + " " + group2.size());
                for (int i: group1) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i: group2) {
                    System.out.print(i + " ");
                }
            }else {
                System.out.println(-1);
            }
        }else {
            System.out.println(-1);
        }
    }

    private static boolean findGroud(int index, int sumAa, int sumBb) {

        if (index == n){
            if (sumAa == sumA/2 && sumBb == sumB/2){
                return true;
            }
            return false;
        }

        if (memory[index][sumAa][sumBb]){
            return false;
        }

        group1.add(index + 1);
        if (findGroud(index + 1,sumAa + a[index],sumBb + b[index])){
            return true;
        }
        group1.remove(group1.size()-1);

        group2.add(index + 1);
        if (findGroud(index + 1,sumAa,sumBb)){
            return true;
        }
        group2.remove(group2.size()-1);

        memory[index][sumAa][sumBb] = true;

        used[index] = true;
        if (findGroud(index + 1,sumAa,sumBb)){
            return true;
        }
        used[index] = false;

        return false;
    }
}
