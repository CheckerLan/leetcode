package com.checker.code.foroffer;

public class Offer05 {
    public String replaceSpace(String s) {
        // 偷懒做法
//        return s.replace(" ","%20");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                builder.append("%20");
            }else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
