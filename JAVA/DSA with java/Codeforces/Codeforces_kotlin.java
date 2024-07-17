import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Codeforces_kotlin {

    public static void main(String[] args) {
        try {
//            int testCases = 1;
            int  testCases = in.nextInt();
            int t=0;
            while(t++ <testCases){
                // write code here
                rajdhakar2003(testCases,t);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }


    private static void rajdhakar2003(int testcase,int t) throws IOException {

        int n=in.nextInt();
        Integer[] dp=new Integer[n+1];
        if(n<3) {
            out.println(n);
            return;
        }
        int[] arr={3,5};
        for(int i=0;i<3;i++) dp[i]=i;
        for(int i=3;i<=n;i++){
            int ans=Integer.MAX_VALUE;
            for(int num:arr) {
                if(i-num>=0) ans=Math.min(ans,dp[i-num]);
            }
            dp[i]=ans;
        }

        out.println(dp[n]);
    }

    static FastWriter out = new FastWriter();

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

}
