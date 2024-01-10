package 笔试;

import java.util.*;

public class sxf {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//
//        Map<String, Integer> ipMap = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String ip = in.next();
//            int key = in.nextInt();
//            ipMap.put(ip,key);
//        }
//
//
//        List<List<Integer>> graph =new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<>());
//        }
//        for (int i = 0; i < m; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            graph.get(a).add(b);
//            graph.get(b).add(a);
//        }
//
//        int q = in.nextInt();
//        List<String> results = new ArrayList<>();
//
//        for (int i = 0; i < q; i++) {
//            String a = in.next();
//            String b = in.next();
//            int aip = ipMap.get(a);
//            int bip = ipMap.get(b);
//
//            boolean isConnected = depthFirstSearch(graph,aip,bip);
//
//            if (isConnected){
//                results.add("Yes");
//            }else {
//                results.add("No");
//            }
//        }
//
//
//        for (String result : results) {
//            System.out.println(result);
//        }
//    }
//
//    private static boolean depthFirstSearch(List<List<Integer>> graph, int aip, int bip) {
//        Stack<Integer> stack = new Stack<>();
//        boolean[] visited = new boolean[graph.size()];
//
//        stack.push(aip);
//        visited[aip] = true;
//
//        while (!stack.isEmpty()){
//            int node  = stack.pop();
//
//            if (node == bip){
//                return true;
//            }
//
//            for (int neighbor : graph.get(node)) {
//                if (!visited[neighbor]) {
//                    stack.push(neighbor);
//                    visited[neighbor] = true;
//                }
//            }
//        }
//
//        return false;
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] inputs = in.nextLine().split(",");
//        int[] nums = new int[inputs.length];
//        for (int i = 0; i < nums.length; i++){
//            nums[i] = Integer.parseInt(inputs[i]);
//        }
//        int len = findLength(nums);
//        System.out.println(len);
//    }
//
//    private static int findLength(int[] nums) {
//        int max  = 0;
//        int cur = 0;
//        for (int i = 0; i < nums.length - 1; i++){
//            if (nums[i] > nums[i+1]){
//                cur++;
//            }else {
//                cur = 0;
//            }
//            max = Math.max(max,cur);
//        }
//        return max + 1;
//    }

//    public String substr (String a, String b) {
//        String results = findMinimumSubstring(a,b);
//        return results;
//    }
//
//    private String findMinimumSubstring(String a, String b) {
//        Map<Character,Integer> map = new HashMap<>();
//        for (Character c : b.toCharArray()){
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//        int left = 0;
//        int right = 0;
//        int count = map.size();
//        int minlength = Integer.MAX_VALUE;
//        int minLeft = 0;
//        while (right < a.length()) {
//            char c = a.charAt(right);
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)-1);
//                if(map.get(c) == 0){
//                    count--;
//                }
//            }
//            while (count == 0){
//                if(right - left + 1 < minlength){
//                    minlength = right - left  + 1;
//                    minLeft = left;
//                }
//                char leftChar = a.charAt(left);
//                if (map.containsKey(leftChar)){
//                    map.put(leftChar,map.get(leftChar) + 1);
//                    if(map.get(leftChar) > 0){
//                        count ++;
//                    }
//                }
//                left ++ ;
//            }
//            right ++;
//        }
//
//        if(minlength  == Integer.MAX_VALUE){
//            return "";
//        }else {
//            return a.substring(minLeft,minLeft+minlength);
//        }
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String p = in.nextLine();
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int i = 2; i <= n; i++){
            if (p.charAt(i -1) == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                char sc = s.charAt(i - 1);
                char pc = s.charAt(j - 1);
                if (sc == pc || pc == '.'){
                    dp[i][j] = dp[i -1][j - 1];
                } else if (pc == '*') {
                    char c = p.charAt(j - 2);
                    if (c == sc || c == '.'){
                        dp[i][j] = dp[i -1][j] || dp[i][j - 2];
                    }else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        if (dp[m][n]){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
