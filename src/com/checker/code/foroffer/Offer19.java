package com.checker.code.foroffer;

public class Offer19 {
    public boolean isMatch(String s, String p) {
        // Java的默认实现
//        return s.matches(p);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j >= p.length()) {
                return false;
            }

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                if (p.charAt(j) == '.') {
                    if (j + 2 >= p.length()) {
                        return true;
                    }
                    while (s.charAt(i) != p.charAt(j + 2)) {
                        i++;
                        if (i >= s.length()) {
                            return false;
                        }
                    }
                }
                char val = p.charAt(j);
                while (s.charAt(i) == s.charAt(j) && i + 1 < s.length() && s.charAt(i + 1) == val) {
                    i++;
                }
                j += 2;
                while (j < p.length() && p.charAt(j) == val) {
                    j++;

                }
                continue;
            }

            if (p.charAt(j) == '.') {
                j++;
                continue;
            }
            if (s.charAt(i) == p.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        if (j != p.length()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Offer19 offer19 = new Offer19();
        System.out.println(offer19.isMatch("aa", "a*"));
    }
}
