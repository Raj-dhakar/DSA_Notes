// JAI SHRI RAM

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
class Solution {
    // Main Function Here



// Other Template code

    /*

    Collections.sort(nums, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
    */

    //    Arrays.sort(arr, Comparator.reverseOrder()); Sort in reverse order // The Data type should be of wrapper class not int or float but Integer ...
    static int[] dir = {0, 1, 0, -1, 0};

    // Knight moves
    int[][] moves = {
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1},
            {-2, 1}, {-1, 2}, {1, 2}, {2, 1}
    };

    static void swap(Pair a,Pair b){
        Pair c=a;
        a=b;
        b=c;
    }
    static int MOD = (int) 1e9 + 7;

    static class Pair {

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    boolean inside(int row,int col,int m,int n){

        if(row<0 || row>=m || col<0 || col>=n) return false;
        return true;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void print(int[] arr) {
        for (int it : arr) System.out.print(it + " ");
    }

    static void print(int[][] arr) {

        for (int[] arrs : arr) {
            for (int it : arrs) System.out.print(it);
            System.out.println("");
        }
    }

    static class DisjointSet {

        DisjointSet(int n) {
            for (int i = 0; i <= n; i++) { // this will cover 0 base indexing and 1 base indexing
                size.add(1); // initially eveyone has size 1;
                parent.add(i); // initially everyone is connected to itself
            }
        }

        List<Integer> parent = new ArrayList<>();

        List<Integer> size = new ArrayList<>();

        int findUPar(int node) {
            if (node == parent.get(node))
                return node; // this tells it is the UParent
            // Here we do Path  Compression so inn future we get it in constant time
            int UParent = findUPar(parent.get(node));
            parent.set(node, UParent);

            return parent.get(node);
        }

        void unionBySize(int u, int v) {
            int up_u = findUPar(u);
            int up_v = findUPar(v);

            if (up_u == up_v) return;// This means both are in same component

            if (size.get(up_u) < size.get(up_v)) {
                parent.set(up_u, up_v);
                size.set(up_v, size.get(up_u) + size.get(up_v));
            } else {
                parent.set(up_v, up_u);
                size.set(up_u, size.get(up_u) + size.get(up_v));
            }

        }

    }

    static public int upper_bound(List<Integer> arr, int target) {
        int low = 0, high = arr.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= target)
                low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static public int lower_bound(List<Integer> arr, int target) {
        int low = 0, high = arr.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < target)
                low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int gcd(int a, int b) {

        // if b=0, a is the GCD
        if (b == 0)
            return a;

            // call the gcd() method recursively by
            // replacing a with b and b with
            // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }

    static int lcm(int a, int b, int gcdValue) {
        return Math.abs(a * b) / gcdValue;
    }

    static public long power(long A, long B, int C) {
        // Base cases
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;
        // If B is even
        long y;
        if (B % 2 == 0) {
            y = power(A, B / 2, C);
            y = (y * y) % C;
        }
        // If B is odd
        else {
            y = A % C;
            y = (y * power(A, B - 1, C) % C) % C;
        }
        return ((y + C) % C);
    }

    static public int countPrimes(int n) {

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                ans++;
                for (int j = i + i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return ans;
    }

    static HashSet<Integer> distinctPrimeFactors(int num) {

        // we goone use a hashSet as producrt will be very high
        HashSet<Integer> ans = new HashSet<>();


        while (num % 2 == 0) {
            ans.add(2);
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                ans.add(i);
                num /= i;
            }
        }
        if (num > 2) ans.add(num);

        return ans;
    }

    static List<Integer> divisors(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
                if (n / i != i)
                    ans.add(n / i);
            }
        }
        return ans;
    }

    static void sort(int[] arr) {
        // Arrays.sort() == Quick Sort == Worst  Case ==O(N^2)
        // Collections.sort() == Merge sort == Worst CASE == O(Nlongn)
        List<Integer> list = new ArrayList<>();

        for (int it : arr) list.add(it);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
    }

    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    static class LCA {

        int[][] dp;
        int LOG;

        public LCA(int n, int[] parent) {
            LOG = (int) (Math.log(n) / Math.log(2)) + 1;

            dp = new int[LOG + 1][n];
            for (int[] it : dp) Arrays.fill(it, -1);

            for (int i = 0; i < LOG; i++) {
                for (int v = 0; v < n; v++) {

                    if (i == 0) dp[i][v] = parent[v];
                    else {
                        if (dp[i - 1][v] == -1) dp[i][v] = -1;
                        else dp[i][v] = dp[i - 1][dp[i - 1][v]];
                    }
                }
            }
        }

        public int getKthAncestor(int node, int k) {

            for (int i = 0; i < LOG; i++) {
                if (node == -1) return -1;
                if ((k & 1) == 1) node = dp[i][node];
                k >>= 1;
            }
            return node;
        }
    }

    static int longestPrefixSuffix(String str) {
        int[] A = new int[str.length()];
        int j = 0, i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                A[i] = j + 1;
                j++;
                i++;
            } else {
                if (j == 0)
                    i++;
                else
                    j = A[j - 1];

            }
        }

        return A[str.length() - 1];
    }
}
