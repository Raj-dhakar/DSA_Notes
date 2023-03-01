package com.o11Stack;
import java.util.Arrays;
import java.util.Stack;
public class o01PreviousSmaller {

    public static void main(String[] args) {
        int[] a={4,10,5,8,20,15,3,12};
//        int[] a={5,15,20,25,12,20};
        System.out.println(Arrays.toString(PreviousSmaller(a)));
        System.out.println(Arrays.toString(PreviousGreater(a)));
    }
    private static int[] PreviousSmaller(int[] arr){
        int[] ans=new int[arr.length];

        Stack<Integer> stack=new Stack<>();
        int curr=0;
        for(int i=0;i< arr.length;i++){
            if(stack.isEmpty()){
                ans[i]=-1;
                stack.push(arr[i]);
                curr=arr[i];
                continue;
            }
            else{
                if(curr<arr[i]){
                    ans[i]=curr;
                    stack.push(arr[i]);
                    curr=arr[i];
                }
                else{
                    while(curr>arr[i] ) {

                        if(stack.isEmpty())
                            break;
                        // this will helip to reach smallest elemnt
                        stack.pop();
                         if(!stack.isEmpty())
                        curr = stack.peek();
                    }
                    if(stack.isEmpty()){
                        ans[i]=-1;
                        stack.push(arr[i]);
                        curr=arr[i];
                        continue;
                    }
                    ans[i]=curr;
                    stack.push(arr[i]);
                    curr=stack.peek();
                }
            }
        }
        return ans;
    }

    private static int[] PreviousGreater(int[] a){
        int[] ans=new int[a.length];
        Stack<Integer> stack=new Stack<>();
        int curr=0;
        for(int i=0;i<a.length;i++){
        if(stack.isEmpty()) {
            ans[i]=-1;
            stack.push(a[i]);
            curr=stack.peek();
          }
        else{
            if(curr>a[i]){
                ans[i]=curr;
                stack.push(a[i]);
                curr=stack.peek();
            }
            else{
                while(curr<a[i]){
                    if(stack.isEmpty())
                        break;
                    stack.pop();
                    if(!stack.isEmpty())
                    curr=stack.peek();
                }
                if(stack.isEmpty()){
                    ans[i]=-1;
                    stack.push(a[i]);
                    curr=a[i];
                    continue;
                }
                ans[i]=curr;
                stack.push(a[i]);
                curr=stack.peek();
            }
          }
        }
        return ans;
    }
}
