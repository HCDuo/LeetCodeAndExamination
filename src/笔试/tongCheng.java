package 笔试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/12 14:55
 */
public class tongCheng {

    public int[] quickSort (int[] arr) {
        if(arr == null || arr.length == 0){
            return  arr;
        }
        quickSortHelper(arr,0,arr.length-1);
        return arr;
    }

    private void quickSortHelper(int[] arr, int left, int right) {
        if (left < right){
            int pro = partition(arr,left,right);
            quickSortHelper(arr,left,pro - 1);
            quickSortHelper(arr,pro + 1,right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right + 1;
        while (true) {
            while(i < right && arr[++i] > pivot);
            while(j > left && arr[--j] < pivot);
            if (i >= j) {
                break;
            }
            swap(arr,i,j);
        }
        swap(arr,left,j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public int maxEnvelopes (int[][] envelopes) {

        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]){
                return b[1] - a[1];
            }else {
                return a[0] - b[0];
            }
        });
        int n = envelopes.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][1] > envelopes[j][1]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
