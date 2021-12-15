package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	    int arr[]={1,1,1};
        System.out.println(sum(arr,2));

        int arr1[]={1,2,3};
        System.out.println(sum(arr1,3));
    }
    static int sum(int[] arr, int k) {
        int count = 0;
        for (int first = 0; first < arr.length; first++) {
            for (int last = first + 1; last <= arr.length; last++) {
                int sum = 0;
                for (int i = first; i < last; i++){
                    sum += arr[i];
                }
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}
