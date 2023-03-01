package com.Algorithm;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] a={-5,-4,-2,-6,-1};
        System.out.println(BrootForce(a));

    }
    //using broot force
//    static void BrootForce(int[] arr)    // output
//            0
//            01
//            012
//            0123
//            01234
//            012345
//            1
//            12
//            123
//            1234
//            12345
//            2
//            23
//            234
//            2345
//            3
//            34
//            345
//            4
//            45
//            5
//
//    {
//        int maxsum=arr[0];
//
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i;j<arr.length;j++)
//            {
//                int currsum=0;
//                for(int k=i;k<=j;k++)
//                {
//                    System.out.print(k+"");
//                    currsum+=arr[k];
//                }
//                maxsum=Math.max(maxsum,currsum);
//                System.out.println("");
//            }
//        }
//
//    }

    // BY kadane algorithm
    static int BrootForce(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;

        for (int i = 0; i <arr.length;i++)
        {
            cursum+=arr[i];
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
                cursum=0;
        }
        return maxsum;
    }
}
