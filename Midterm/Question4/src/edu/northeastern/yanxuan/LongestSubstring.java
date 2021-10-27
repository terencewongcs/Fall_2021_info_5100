package edu.northeastern.yanxuan;

import java.util.HashMap;

public class LongestSubstring {
    public static int LongestSubstring(String str){
        int dis=0;
        for(int i=0;i<str.length();i++){
            HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
            int j=i;
            for(;j<str.length();j++){
                if(hm.containsKey(str.charAt(j))){
                    dis=Math.max(dis,j-i);
                    break;
                }
                else{
                    hm.put(str.charAt(j),1);
                }
            }
            dis=Math.max(dis,j-i);
        }
        return dis;
    }
}
