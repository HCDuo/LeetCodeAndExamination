package 笔试;

import com.剑指_Offer.ListNode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/15 20:49
 */
public class tencent1 {

    public ListNode solve (ListNode[] a) {

        if (a == null || a.length == 0){
            return null;
        }
        return mergeSort(a,0,a.length-1);

    }

    private ListNode mergeSort(ListNode[] a, int start, int end) {

        if (start == end){
            return a[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeSort(a,start,mid);
        ListNode right = mergeSort(a,mid + 1,end);
        return merge(left,right);

    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(left != null && right != null){
            if (left.val <= right.val){
                curr.next = left;
                left = left.next;
            }else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left != null) {
            curr.next = left;

        }
        if (right != null) {
            curr.next = right;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        long sum = 0;
        int oddCount = 0;
        int evenCount = 0;
    }

}
