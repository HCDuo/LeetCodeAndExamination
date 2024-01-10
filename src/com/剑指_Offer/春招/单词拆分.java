package com.剑指_Offer.春招;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 *给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/13 11:09
 */
public class 单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictset = new HashSet<String>(wordDict);
        int len = s.length();
        boolean[] dp  =  new boolean[len+1];
        dp[0] = true;
        for (int i = 1; i <= len; i++){
            for (int j = 0; j < i; j++){
                if (dp[j] && wordDictset.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
