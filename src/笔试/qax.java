package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/16 16:35
 */
public class qax {
    public static int[] getLuckyNum(int[][] nums) {

        Map<Integer, Integer> counts = new HashMap<>();
        for (int[] Nums : nums) {
            for (int num : Nums) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
        }
        int[] counter = new int[34];
        boolean[] visible = new boolean[34];

        for(int[] Nums : nums){
            for(int num : Nums){
                counter[num]++;
                visible[num] = true;
            }
        }

        List<Integer> extra = new ArrayList<>();
        for (int i = 1; i <= 33; i++) {
            if (!counts.containsKey(i)) {
                extra.add(i);
            }
        }
        int[] result;

        if (extra.size() >= 7) {
            result = extra.stream().sorted().limit(7).mapToInt(Integer::intValue).toArray();
        } else {
            List<Integer> com = new ArrayList<>(extra);
            while (com.size() < 7){
                for (int i = 1; i <= 33; i++) {
                    int min = Integer.MAX_VALUE;
                    int mapped = 0;
                    for (int j = 1; j <= 33; j++) {
                        if (counter[j] != 0 && visible[j]) {
                            if (min > counter[j]){
                                mapped = j;
                                min = counter[j];
                            }
                        }
                    }
                    if (visible[mapped]){
                        com.add(mapped);
                        if (com.size() >= 7){
                            break;
                        }
                        visible[mapped] = false;
                    }
                }
            }
            System.out.println(com);
            result = com.stream().sorted().limit(7).mapToInt(Integer::intValue).toArray();
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] nums = {{1,2,3,4,5,6,7}, {8,9,10,11,12,13,14}, {15,16,17,18,19,20,21}, {22,23,24,25,26,27,28}};
        String a = Arrays.toString(getLuckyNum(nums));
        System.out.println(a);
    }
}
