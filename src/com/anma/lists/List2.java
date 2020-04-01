package com.anma.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List2 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));


        String[] strArray = new String[nameList.size()];
        strArray = nameList.toArray(strArray);


        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

    }
}
