package edu.northeastern.yanxuan;

import java.util.HashMap;

public class SumOfNumRepeated {
    public static int SumOfNumRepeated(int[] array){
        HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(hm.containsKey(array[i])){
                hm.put(array[i],true);
            }
            else {
                hm.put(array[i],false);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==true){
                sum+=key;
            }
        }
        return sum;
    }
}

