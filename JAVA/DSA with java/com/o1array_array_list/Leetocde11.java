package com.o1array_array_list;

public class Leetocde11 {

    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
        System.out.println(-2/1);
    }
     static public int maxArea(int[] height) {
        int leftHeight=0;
        int rightHeight=height.length-1;
        // using 2 pointer ffor container
        int max=Integer.MIN_VALUE;

        while(leftHeight<height.length && rightHeight>=0)
        {
            int index=(rightHeight-leftHeight);
            if(height[leftHeight]>height[rightHeight])
            {
                max=Math.max(max,index*height[rightHeight]);
                rightHeight--;
            }
            else if(height[leftHeight]==height[rightHeight])
            {
                max=Math.max(max,index*height[rightHeight]);
                rightHeight--;
                leftHeight++;
            }
            else
            {
                max=Math.max(max,index*height[leftHeight]);
                leftHeight++;
            }
        }
        return max;
    }
}
