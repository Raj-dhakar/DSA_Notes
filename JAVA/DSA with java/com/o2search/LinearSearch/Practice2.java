package com.o2search.LinearSearch;

public class Practice2 {
// Search in a particular range
public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6,7,8,9,0};
    int target=5;
    int start=2,end=6;
    int ans=linearSearch(nums,start,end,target);
    System.out.println("The element is present at "+ans+ " index");

}

    static int linearSearch(int[] a,int start,int end,int target)
    {
        if(a.length==0)
        {
            return -1;
        }

        for(int index=start;index<=end;index++)
        {
            int element=a[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statemenr is hit hence the atget is not found
        return -1;
    }
}
