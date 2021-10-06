package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean palindrome=isPalindromeString("abbaa");
        System.out.println(palindrome);
    }

    private static boolean isPalindromeChar(String str){
        if(str == null ||str.length()==0){
            return true;
        }
        char[] arr=str.toCharArray();
        int start =0;
        int end=arr.length-1;

        while(start < end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindromeString(String str){
        if(str == null ||str.length()==0) {
            return true;
        }
        int start =0;
        int end=str.length()-1;

        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
