package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/20 20:44
 */
public class 加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len  = gas.length;
        int i = 0;
        while (i < len) {
            int sumOfGas = 0;
            int sumOfCost = 0;
            int cnt = 0;
            while (cnt < len){
                int j = (i + cnt) % len;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas) {
                    break;
                }
                cnt ++;
            }
            if (cnt == len) {
                return i;
            }else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
