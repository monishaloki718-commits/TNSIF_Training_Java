package org.tnsif.acc.c2tc.generics;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List list = new java.util.ArrayList();

        list.add("abc");
        list.add(new Integer(5));

        for (Object obj : list) {

            // Type casting leads to ClassCastException at runtime
            String str = (String) obj;

            System.out.println(str);
        }
    }
}