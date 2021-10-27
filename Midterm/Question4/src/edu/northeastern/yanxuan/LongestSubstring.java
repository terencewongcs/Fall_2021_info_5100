package edu.northeastern.yanxuan;

import java.util.HashSet;

public class LongestSubstring {
    public static String LongestSubstring(String str) {
        int start = 0;
        int dis = 0;
        String ls = "";
        HashSet<Character> hs = new HashSet<>();

        if (str.length() <= 1) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!hs.contains(str.charAt(i))) {
                hs.add(str.charAt(i));
                if (dis < i + 1 - start) {
                    dis = Math.max(dis, i + 1 - start);
                    ls = str.substring(start, i + 1);
                }
            } else {
                while (hs.contains(str.charAt(i))) {
                    hs.remove(str.charAt(start));
                    start++;
                }
                hs.add(str.charAt(i));
            }
        }
        return ls;
    }
}
