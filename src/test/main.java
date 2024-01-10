package test;

import com.剑指_Offer.TreeNode;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/7 0:15
 */
public class main {
    public int LastRemaining_Solution (int n, int m) {
        if( n < 1 || m < 1){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1){
            for (int i = 1; i < m; i++) {
                if(index == list.size() - 1){
                    index = 0;
                }else {
                    index++;
                }
            }
            list.remove(index);
            if(index == list.size()){
                index = 0;
            }
        }
        return list.get(0);
    }
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        if (root == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> r = new ArrayList<Integer>();
            while(size!=0){
                TreeNode cur = queue.remove();
                r.add(cur.val);
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
                size--;
            }
            result.add(r);
        }
        return result;
    }
    public ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length <= 2){
            return result;
        }
        Arrays.sort(num);
        int left = 0,right = num.length-1;
        boolean[] marks = new boolean[num.length];
        for (int i = 0; i < num.length;i++){
            marks[i] = false;
        }
        while(left<right){
            for (int i = left + 1; i < right; i++) {
                if (num[left] + num[right] + num[i] == 0 && !marks[left] && !marks[right] && !marks[i]){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[left]);
                    list.add(num[right]);
                    list.add(num[i]);
                    left++;
                    right--;
                    marks[left] = true;
                    marks[right] = true;
                    marks[i] = true;
                }
            }
        }
        return result;
    }
    public int maxlenEqualK (int[] arr, int k) {
        if (arr == null) {
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (map.containsKey(sum - k)){
                ans = Math.max(ans, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return ans;
    }
}
