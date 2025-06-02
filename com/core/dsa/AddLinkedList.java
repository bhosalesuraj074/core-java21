package com.core.dsa;

import java.util.LinkedList;

public class AddLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < l1.size(); i++) {
            s1.append(l1.get(i));
            s2.append(l2.get(i));
        }
        
    }
}
