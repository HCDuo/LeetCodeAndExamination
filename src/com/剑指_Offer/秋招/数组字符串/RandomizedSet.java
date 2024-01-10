package com.剑指_Offer.秋招.数组字符串;

import java.util.*;

/**
 * <pre>
 *O(1) 时间插入、删除和获取随机元素
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/15 16:04
 */
public class RandomizedSet {
    List<Integer> nums;
    Map<Integer, Integer> maps;
    Random random;
    public RandomizedSet() {
        nums = new ArrayList<>();
        maps = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (maps.containsKey(val)) {
            return false;
        }
        int index = nums.size();
        maps.put(val,index);
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!maps.containsKey(val)) {
            return false;
        }
        int index = maps.get(val);
        int last = nums.get(nums.size()-1);
        nums.set(index,last);
        maps.put(last,index);
        //把最后一个转到要删除的地方，并且将最后一个删除
        nums.remove(nums.size()-1);
        maps.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}
