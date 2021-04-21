package com.checker.code.foroffer;

public class Offer58 {
//    public String reverseLeftWords(String s, int n) {
//        String str = s.substring(n);
//        String pre = s.substring(0,n);
//        return str+pre;
//    }
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i <s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();
        System.out.println(offer58.reverseLeftWords("123456", 3));
    }
}
