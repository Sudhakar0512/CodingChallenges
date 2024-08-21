package com.dev.arrays;

import java.util.HashMap;

public class twoSum {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hm=new HashMap<>();

            for(int i=0;i<nums.length;i++){
                int n=nums[i];
                if(hm.containsKey(n))
                {
                    return new int[]{hm.get(n),i};
                }
                hm.put(target-n,i);
            }
            return new int[]{};
        }
}
