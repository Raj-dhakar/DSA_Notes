// JAI SHRI RAM

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Codeforces {

    static long mod=(long)1e9+7;

    // 4 Directions
    static int[] dir={0,1,0,-1,0};

    // 8 directions
    static int x[] = { -1, -1, -1,  0, 0,  1, 1, 1 };
    static int y[] = { -1,  0,  1, -1, 1, -1, 0, 1 };

    public static void main(String[] args) {
        try {
//            int testCases = 1;
            int  testCases = in.nextInt();
            while(testCases-- > 0){
                // write code here
                solve();
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }


    static Integer[][] dp;
    private static void solve() throws IOException {

        int n=in.nextInt();
        int[] arr=inputArray(n);


    }



    // NOTES
    /*

    1) If you cant think of anything think of Binary Search.
    2) Dont forget to see the constraints.

       Map Property
       Map<Integer,Integer> map=new HashMap<>();
       Integer[] arr=map.keySet().toArray(new Integer[0]);
       Integer[] arr=map.values().toArray(new Integer[0]);
     */



    static class Pair{

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Tuple{

        int first;
        int second;
        int third;
        public Tuple(int first, int second,int third) {
            this.first = first;
            this.second = second;
            this.third=third;
        }
    }

    static  FastWriter out = new FastWriter();
    static FastReader in = new FastReader();

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append( object+" ");
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static void print(int[] arr) throws IOException {
        for(int it:arr) out.print(it);
        out.println("");
    }

    static void print(int[][] arr) throws IOException {

        for(int[] arrs:arr){
            for(int it:arrs) out.print(it);
            out.println(" ");
        }
        out.println("");
    }


    static class DisjointSet{

        DisjointSet(int n){
            for(int i=0;i<=n;i++){ // this will cover 0 base indexing and 1 base indexing
                size.add(1); // initially eveyone has size 1;
                parent.add(i); // initially everyone is connected to itself
            }
        }

        List<Integer> parent=new ArrayList<>();

        List<Integer> size=new ArrayList<>();

        int findUPar(int node){
            if(node== parent.get(node))
                return node; // this tells it is the UParent
            // Here we do Path  Compression so inn future we get it in constant time
            int UParent=findUPar(parent.get(node));
            parent.set(node,UParent);

            return parent.get(node);
        }

        void unionBySize(int u,int v){
            int up_u=findUPar(u);
            int up_v=findUPar(v);

            if(up_u==up_v) return ;// This means both are in same component

            if(size.get(up_u)<size.get(up_v)){
                parent.set(up_u,up_v);
                size.set(up_v, size.get(up_u)+ size.get(up_v));
            } else{
                parent.set(up_v,up_u);
                size.set(up_u, size.get(up_u)+ size.get(up_v));
            }

        }

    }

    static public int upper_bound(int[] arr,int target){
        int low=0,high=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target)
                low=mid+1;
            else high=mid;
        }
        return low;
    }

    static   public int lower_bound(int[] arr,int target){
        int low=0,high=arr.length;

        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
                low=mid+1;
            else high=mid;
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

    static public  long power(long A, long B, long C) {
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

        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        int ans=0;
        for(int i=2;i<=n;i++) {
            if(isPrime[i]){
                ans++;
                for(int j=i+i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        return ans;
    }

    static HashSet<Integer>  distinctPrimeFactors(int num) {

        // we goone use a hashSet as producrt will be very high
        HashSet<Integer> ans=new HashSet<>();


        while(num%2==0){
            ans.add(2);
            num/=2;}

        for(int i=3;i<=Math.sqrt(num);i++) {
            while(num%i==0) {
                ans.add(i); num/=i;
            }
        }
        if(num>2) ans.add(num);

        return ans;
    }

    public static int minDivisor(int n) {
        for (int d = 2; d <= Math.round(Math.sqrt(n)); d++) {
            if (n % d == 0) {
                return d;
            }
        }
        return n;
    }


    static List<Integer> divisors(int n){
        List<Integer> ans=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                ans.add(i);
                if(n/i!=i )
                    ans.add(n/i);
            }
        }
        return ans;
    }

    static void sort(int[] arr){
        // Arrays.sort() == Quick Sort == Worst  Case ==O(N^2)
        // Collections.sort() == Merge sort == Worst CASE == O(Nlongn)
        List<Integer> list=new ArrayList<>();

        for(int it:arr) list.add(it);

        Collections.sort(list);

        for(int i=0;i<list.size();i++) arr[i]=list.get(i);
    }

    static void reverse(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int val=arr[low];
            arr[low]=arr[high];
            arr[high]=val;
            low++;high--;
        }
    }

    static String reverse(String s){
        StringBuilder ans=new StringBuilder(s);
        return ans.reverse().toString();
    }

    static long sum(int[] arr){
        long ans=0;
        for(int it:arr) ans+=it;
        return ans;
    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public  static int[] inputArray(int n){

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++) arr[i]=in.nextInt();

        return arr;
    }

    public static int[][] inputArray(int m,int n){

        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) arr[i][j]=in.nextInt();
        }

        return arr;
    }

    public static int max_Element(int[] arr){
        int ans=Integer.MIN_VALUE;
        for(int it:arr) ans=max(ans,it);
        return ans;
    }
    public static int min_Element(int[] arr){
        int ans=Integer.MAX_VALUE;
        for(int it:arr) ans=min(ans,it);
        return ans;
    }

    public static int[][] NcR(int n){

        // First find all pair for NcR
        int[][] dp=new int[n+1][n+1];

        for (int i = 0; i < n; ++i) {
            dp[i][0] = dp[i][i] = 1;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = (int) ((dp[i - 1][j - 1] + dp[i - 1][j]) % mod);
            }
        }
        return dp;
    }

    private static boolean isPrime(long n) {

        if(n<=1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }


    static class SegmentTree{


        int[] seg;

        SegmentTree(int n){
            seg=new int[4*n];
        }

        void Build(int indx,int low,int high,int[] arr,boolean or){
            if(low==high){
                seg[indx]=arr[low];
                return ;
            }

            int mid=low+(high-low)/2;

            Build(2*indx+1,low,mid,arr,!or);
            Build(2*indx+2,mid+1,high,arr,!or);
            if(or) seg[indx]=(seg[2*indx+1]|seg[2*indx+2]);
            else seg[indx]=(seg[2*indx+1]^seg[2*indx+2]);
        }

        int query(int indx,int low,int high,int L,int R){
            // no overlapping
            if(R<low || high<L) return 0;

            // complete overlapping
            if(low>=L && high<=R) return seg[indx];

            // partial overlapping
            int mid=low+(high-low)/2;
            int left=query(2*indx+1,low,mid,L,R);
            int right=query(2*indx+2,mid+1,high,L,R);

            return left+right;
        }

        void update(int indx,int low,int high,int Indexupdate,int val,boolean or){

            if(low==high){
                seg[indx]=val;
                return ;
            }

            int mid=low+(high-low)/2;
            if(Indexupdate<=mid) update(2*indx+1,low,mid,Indexupdate,val,!or);
            else update(2*indx+2,mid+1,high,Indexupdate,val,!or);
            if(or) seg[indx]=(seg[2*indx+1]|seg[2*indx+2]);
            else  seg[indx]=(seg[2*indx+1]^seg[2*indx+2]);
        }
    }
}

