package com.o3BinarySearch;

public class Leetcode2 {
    // Q-> 34

    public static void main(String[] args) {
    }

        public int[] searchRange ( int[] nums, int target)
        {

            int[] ans = {-1, -1}; //[5,7,7,7,7,8,8,10]

            //check for first occurance if target first
            int start = search(nums, target,true);
            int end = search(nums, target, false);
            ans[0] = start;
            ans[1] = end;

            return ans;
        }

        // This function just return the index value of what we are trying to search
        int search ( int[] nums, int target, boolean findStartIndex)
        {

            int ans = -1;
            int start = 0;
            int end = nums.length;

            // Find first occurense of seven
            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    //potential ans found
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;

                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }
