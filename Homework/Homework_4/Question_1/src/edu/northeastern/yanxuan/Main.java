package edu.northeastern.yanxuan;

import java.sql.Statement;
import java.util.LinkedList;

public class Main {

    public static LinkedList<Integer> list;
    public static ThreadSafeLinkedList<Integer> threadSafe;

    public static void main(String[] args) {
        list = new LinkedList<>();
        threadSafe = new ThreadSafeLinkedList<>();

        Thread[] threads = new Thread[10];

        for(int i = 0 ; i < threads.length; i ++) {
            threads[i] = new Thread(new AddRemoveItemsFromList());
            threads[i].start();
        }




    }
}