import java.util.Arrays;
import java.util.Scanner;

public class SegmentTree {

    int[] segArr;

    SegmentTree(int n){
        segArr = new int[4 * n];
    }

    void build(int root, int left, int right,int[] arr){
        if(left == right) {
            segArr[root] = arr[left];
            return;
        }

        int mid = left + (right - left) / 2;
        build(2 * root + 1, left, mid,arr);
        build(2 * root + 2, mid + 1, right,arr);
        segArr[root] = segArr[2 * root + 1] ^ segArr[2 * root + 2];
    }

    void update(int root, int left, int right, int position, int value){
        if(position<left || position>right) return;
        if(left == right){
            segArr[root] = value;
            return;
        }

        int mid = left + (right - left) / 2;
        update(2 * root + 1, left, mid, position, value);
        update(2 * root + 2, mid + 1, right, position, value);
        segArr[root] = segArr[2 * root + 1] ^ segArr[2 * root + 2];
    }

    int query(int root, int left, int right, int leftQuery, int rightQuery){
        if(left > rightQuery || right < leftQuery) return 0;

        if(leftQuery <= left && right <= rightQuery){
            return segArr[root];
        }

        int mid = left + (right - left) / 2;
        return query(2 * root + 1, left, mid, leftQuery, rightQuery) ^ query(2 * root + 2, mid + 1, right, leftQuery, rightQuery);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = in.nextInt();

        SegmentTree tree = new SegmentTree(n);
        tree.build(0, 0, n - 1,arr);

        while (q-- > 0){

            int l=in.nextInt(), r=in.nextInt();
            System.out.println(tree.query(0,0,n-1,l-1,r-1));
        }
    }
}
