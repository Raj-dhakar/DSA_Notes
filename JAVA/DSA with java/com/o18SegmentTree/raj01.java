package com.o18SegmentTree;

import java.io.Closeable;
import java.util.Arrays;

public class raj01 {

    public static void main(String[] args) {

        SegTreeMin sg1=new SegTreeMin(6);
        int[] arr={1,3,2,0,4,5};
        int n= arr.length;
        sg1.Build(0,0,n-1,arr);
       int Type1= sg1.query(0,0,n-1,0,3);
        System.out.println(Type1);
     sg1.update(0,0,n-1,3,4);
        System.out.println(Arrays.toString(sg1.seg));
    }

}

class SegTreeMin{
    int[] seg;

    SegTreeMin(int n){
        seg=new int[4*n];
    }

    void Build(int indx,int low,int high,int[] arr){
        if(low==high){
            seg[indx]=arr[low];
            return ;
        }

        int mid=low+(high-low)/2;

        Build(2*indx+1,low,mid,arr);
        Build(2*indx+2,mid+1,high,arr);
        seg[indx]=Math.min(seg[2*indx+1],seg[2*indx+2]);
    }

    int query(int indx,int low,int high,int L,int R){
        // no overlapping
        if(R<low || high<L) return Integer.MAX_VALUE;

        // complete overlapping
        if(low>=L && high<=R) return seg[indx];

        // partial overlapping
        int mid=low+(high-low)/2;
        int left=query(2*indx+1,low,mid,L,R);
        int right=query(2*indx+2,mid+1,high,L,R);

        return Math.min(left,right);
    }

    void update(int indx,int low,int high,int I,int val){

        if(low==high){
            seg[indx]=val;
            return ;
        }

        int mid=low+(high-low)/2;
        if(I<=mid) update(2*indx+1,low,mid,I,val);
        else update(2*indx+2,mid+1,high,I,val);
        seg[indx]=Math.min(seg[2*indx+1],seg[2*indx+2]);
    }
}
