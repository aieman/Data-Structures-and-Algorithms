package com.company;

import java.util.HashSet;

public class FindDuplicate {

    public static void findDuplicates(int[] data){
        if(data.length == 0)
            return;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < data.length - 1; i++){
            if(data[i] == data [i+1])
                set.add(data[i]);
        }

        for(Integer val : set){
            System.out.println(val);
        }
    }
}
