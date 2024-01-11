package com.剑指_Offer.春招实习;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/28 17:31
 */
public class 有效的回文 {
//    public boolean isPalindrome(String s) {
//        //api使用
//        StringBuffer sgood = new StringBuffer();
//        int length = s.length();
//        for (int i = 0; i < length; i++) {
//            char ch = s.charAt(i);
//            if (Character.isLetterOrDigit(ch)) {//判断是否是字母数字
//                sgood.append(Character.toLowerCase(ch));
//            }
//        }
//        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
//        return sgood.toString().equals(sgood_rev.toString());
//    }
//
    public boolean isPalindrome(String s) {
        int length = s.length();
        int l = 0, r = length - 1;
        while (l < r) {
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
                ++l;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))){
                --r;
            }
            if (l < r){
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
                ++l;
                --r;
            }
        }
        return true;
    }
}
