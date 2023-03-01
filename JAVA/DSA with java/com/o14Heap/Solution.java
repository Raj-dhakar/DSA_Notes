package com.o14Heap;

import java.util.Arrays;

class Solution {
    public int minimumOperations(int[] nums) {
        
        int ans=0;
        
        while(true){
            int minus=min(nums);
            int count=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                        count++;
                        if(count==nums.length)
                            return ans+1;
                         System.out.println("Enter");
                        continue;
                    }
                    
                        nums[i]=nums[i]-minus;
                }
            System.out.println(Arrays.toString(nums));
            ans++;
        }
    }
    
    public int min(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 &&nums[i]<min )
                min=nums[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Solution ans=new Solution();
        ans.minimumOperations(new int[]{1,5,0,3,5});
    }
}