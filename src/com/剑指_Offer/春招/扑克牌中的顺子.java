package com.剑指_Offer.春招;

import java.util.Arrays;

/**
 * <pre>
 *从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/21 18:17
 */
public class 扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++;
            else if(nums[i] == nums[i + 1]) return false;
        }
        return nums[4] - nums[joker] < 5;
    }
}
