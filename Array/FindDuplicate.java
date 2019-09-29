package com.company;

import java.util.HashSet;

public class FindDuplicate {

    public static void findDuplicates(int[] data){
        if(data.length == 0)
            return;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < data.length - 1; i++){
            // if a duplicate is found then adding it to the set, 
            // even if there are multiple the set will contain just keep 1 element of it as set doesn't keep duplicates
            if(data[i] == data [i+1]) 
                set.add(data[i]);
        }

        // printing all the values in the set which will have the duplicated numbers
        for(Integer val : set){
            System.out.println(val);
        }
    }
}
