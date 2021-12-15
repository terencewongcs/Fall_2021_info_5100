package edu.northeastern.yanxuan;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        String[] strList = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strList));

        String[] strList1 = {""};
        System.out.println(groupAnagrams(strList1));

        String[] strList2 = {"a"};
        System.out.println(groupAnagrams(strList2));
    }

    private static ArrayList<ArrayList<String>> groupAnagrams(String[] strList) {

        ArrayList<ArrayList<String>> anagramsList = new ArrayList<>();
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (String str : strList) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String anagram = String.valueOf(ch);
            if (!hashMap.containsKey(anagram)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                hashMap.put(anagram, list);
            } else {
                ArrayList<String> list = hashMap.get(anagram);
                list.add(str);
                hashMap.put(anagram, list);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
            anagramsList.add(entry.getValue());
        }

        return anagramsList;

    }
}

