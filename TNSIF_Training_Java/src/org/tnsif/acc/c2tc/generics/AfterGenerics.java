package org.tnsif.acc.c2tc.generics;

import java.util.ArrayList;
import java.util.List;

public class AfterGenerics {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("apple");
        list1.add("banana");

        System.out.println(list1);
    }
}