package com.Algorithm;

class Solution {

    public static void main(String[] args) {
        System.out.println(primeSubOperation(new int[]{4,9,6,10}));
    }
    
   static public boolean primeSubOperation(int[] nums) {
        
         return backtrack(nums,0,0);
    }

public static boolean backtrack(int[] nums, int index, int prev) {
    
    if(index<0) return false;
    if (index == nums.length) {
        return true;
    }
    if (nums[index] > prev) {
        return backtrack(nums, index + 1, nums[index]);
    }
    else{
        int maxPrime=0;
        for(int i=2;i<nums[i];i++){
            if(isPrime(i)) maxPrime=Math.max(i,maxPrime);
        }
        nums[index]-=maxPrime;
        if(index!=0 && nums[index]>nums[index-1]) return backtrack(nums,index+1,nums[index]);
        else return backtrack(nums,index-1,(int)1e9);
    }
}

public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

}