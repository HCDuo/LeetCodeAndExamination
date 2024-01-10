package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/29 22:34
 */
public class 整数转罗马数字 {
    static int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] keys = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < values.length; i++) {
            while(num - values[i] > 0){
                ans.append(keys[i]);
                num-=values[i];
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3303));
    }
}
