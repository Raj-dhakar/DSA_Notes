package com.o11Stack;

import java.util.Arrays;
import java.util.Stack;

public class o02NextSmaller {
    public static void main(String[] args) {
        int[] a={3,10,5,1,15,10,7,6};
        System.out.println(Arrays.toString(NextSmaller(a)));
        System.out.println(Arrays.toString(NextSmaller(new int[]{1,2,3,4,5,6,7,8,9,10})));
    }

    private static int[] NextSmaller(int[] a){ // pass all est cases
        int[] ans=new int[a.length];
        Stack<Integer> stack=new Stack<>();
        int indx=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(stack.isEmpty()){
                ans[indx--]=-1;
                stack.push(a[i]);
            }
            else{
                if(stack.peek()<a[i]){
                    ans[indx--]=stack.peek();
                    stack.push(a[i]);
                }
                else{
                    while(stack.peek()>a[i]){
                        stack.pop();
                        if(stack.isEmpty())
                            break;
                    }
                    if(stack.isEmpty()){
                        ans[indx--]=-1;
                        stack.push(a[i]);
                        continue;
                    }
                    ans[indx--]=stack.peek();
                    stack.push(a[i]);
                }
            }
        }

        return ans;
    }
}
