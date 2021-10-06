package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    //Question 1
        int[] arr={1,2,2,3,5,5};
        System.out.println(Question_1(arr));

        //Qusetion 2
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(-7,-3,2,3,11));
        System.out.println(Question_2(arr2));

        //Question 3
        int[] arr3 ={2,3,4,2,2,3,5,7};
        System.out.println(Question_3(arr3));

        //Question 4
        String ransomNote="aa";
        String magazine="abba";
        System.out.println(Question_4(ransomNote,magazine));

        //Question 5
        String str="1A3d4s5t";
        System.out.println(Question_5(str));
    }

    public static int Question_1(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.replace(i, 1);
            }
            else{
                hm.put(i,0);
            }
        }
        int sum=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==0){
                sum+=key;
            }
        }
        return sum;
    }

    public static ArrayList<Integer> Question_2(ArrayList<Integer> arr){
        ArrayList<Integer> squareList= new ArrayList<>();
        for(int i:arr){
            squareList.add(i*i);
        }
        Collections.sort(squareList);
        return squareList;
    }

    public static int Question_3(int[] arr){
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.replace(i, 1);
            }
            else{
                hm.put(i,0);
            }
        }
        for(int i:arr){
            if(hm.get(i)==0){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static boolean Question_4(String  ransomNote, String magazine){
        char[] magazineCharList=magazine.toCharArray();
        HashMap<Character, Integer> magazineHash=new HashMap<>();
        for(char ch:magazineCharList){
            if(magazineHash.containsKey(ch)){
                magazineHash.replace(ch, magazineHash.get(ch)+1);
            }
            else{
                magazineHash.put(ch,1);
            }
        }

        char[] ransomNoteCharList=ransomNote.toCharArray();
        for(char ch:ransomNoteCharList){
            if(magazineHash.containsKey(ch)){
                int valueOfCh=magazineHash.get(ch);
                if(valueOfCh!=0){
                    magazineHash.replace(ch,valueOfCh-1);
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean Question_5(String str){
        char[] charList=str.toCharArray();
        char last=charList[0],next;
        for(int i=1;i<charList.length;i++){
            next=charList[i];
            if(Character.isDigit(last)&&Character.isDigit(next)){
                return false;
            }
            if(Character.isLetter(last)&&Character.isLetter(next)) {
                return false;
            }
            last=charList[i];
        }
        return true;
    }

}