import java.util.*;
import java.io.*;

public class Codeforces {

    static class Pair{

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "{"+first+","+second+"}";
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

    static FastScanner in=new FastScanner();

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }


    public static class FastWriter {
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


    static public int upper_bound(int[] array,int key,int start){

        int lowerBound = start;
        while (lowerBound < array.length) {
            if (key >= array[lowerBound])
                lowerBound++;
            else
                return lowerBound;
        }

        return lowerBound;
    }

    static   public int lower_bound(int[] array,int key,int start){

        int lowerBound = start;
        while (lowerBound < array.length) {
            if (key > array[lowerBound])
                lowerBound++;
            else
                return lowerBound;
        }

        return lowerBound;
    }

    static long gcd(long a, long b) {

        // if b=0, a is the GCD
        if (b == 0)
            return a;

            // call the gcd() method recursively by
            // replacing a with b and b with
            // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a,b);
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

    public  static long[] inputArrayLong(int m){

        long[] arr=new long[m];
        for(int i=0;i<arr.length;i++) arr[i]=in.nextLong();

        return arr;
    }

    public static int[][] inputArray(int m,int n){

        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) arr[i][j]=in.nextInt();
        }

        return arr;
    }

    public static long[][] inputArrayLong(int m,int n){

        long[][] arr=new long[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) arr[i][j]=in.nextLong();
        }

        return arr;
    }



    private static boolean isPrime(long n) {

        if(n<=1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static long mod=(long)1e9+7;

    // 4 Directions
    static int[] dir={0,1,0,-1,0};

    // 8 directions
    static int x[] = { -1, -1, -1,  0, 0,  1, 1, 1 };
    static int y[] = { -1,  0,  1, -1, 1, -1, 0, 1 };

    public static int calculateManhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    // Knight moves
    static int[][] moves = {
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1},
            {-2, 1}, {-1, 2}, {1, 2}, {2, 1}
    };

    public static void main(String[] args) {
        try {
            int testCases = 1;
//            int  testCases = in.nextInt();
            int t=0;
            while(t++ <testCases){
                // write code here
                rajdhakar062003(testCases,t);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

   static Integer[][] dp;

    static List<List<Integer>> edge;

    private static void rajdhakar062003(int testcase,int t) throws IOException {


    }
}