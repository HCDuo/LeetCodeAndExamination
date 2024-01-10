package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/12/12 19:03
 */
public class UEA {
// 1
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in .nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = in.nextInt();
//            in.nextLine();
//            String[] strings = new String[n];
//            for (int j = 0; j < n; j++){
//                strings[j] = in.nextLine();
//            }
//            boolean possible = isPalindrome(strings,n);
//            System.out.println(possible ? "Yes" : "No");
//        }
//    }
//
//    private static boolean isPalindrome(String[] strings, int n) {
//        int left = 0;
//        int right = n - 1;
//        while (left <= right) {
//            if (hasCommonChar(strings[left],strings[right])) {
//                left++;
//                right--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean hasCommonChar(String s1, String s2) {
//        Set<Character> set = new HashSet<>();
//        for (Character c : s1.toCharArray()) {
//            set.add(c);
//        }
//        for (char c : s2.toCharArray()) {
//            if (set.contains(c)){
//                return true;
//            }
//        }
//        return false;
//    }
//2
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        in.nextLine();
//        int[] a = new int[n];
//        int[] b = new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = in.nextInt();
//        }
//        Arrays.sort(a);
//        Arrays.sort(b);
//        int[] mergedArray = mergeArray(a,b);
//        int k = mergedArray.length;
//        for (int i = 0; i < k; i++) {
//            System.out.print(mergedArray[i] + ' ');
//        }
//    }
//
//    private static int[] mergeArray(int[] a, int[] b) {
//        int[] mergedArray = new int[a.length + b.length];
//        int i = 0,j = 0, k = 0;
//        while(i < a.length && j < b.length){
//            if (a[i] < b[j]){
//                mergedArray[k++] = a[i++];
//            } else if (a[i] > b[j]) {
//                mergedArray[k++] = b[j++];
//            }else {
//                mergedArray[k++] = a[i++];
//                j++;
//            }
//        }
//        while(i < a.length){
//            mergedArray[k++] = a[i++];
//        }
//        while (j < b.length){
//            mergedArray[k++] = b[j++];
//        }
//        return Arrays.copyOf(mergedArray,k);
//    }
//3
//    public static void main(String[] args) {
//        int Mod = 1000000007;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int q = 1;
//        int t = 2;
//        for (int i = 2; i <= n; i++) {
//            int qNew = (2 * t + 1) % Mod;
//            int tNew = (q + qNew + 1) % Mod;
//            q = qNew;
//            t = tNew;
//        }
//        System.out.println(q + " " + t);
//    }

}
