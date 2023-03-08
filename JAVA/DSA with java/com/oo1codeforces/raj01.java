import java.util.*;
import java.util.Scanner;
public class raj01 {

    // Bitwise
//    a^0=a
//    a^a=0
//    a^b=c
//    a^c=b
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
            }
            else{
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
    static int lcm(int a, int b, int gcdValue)
    {
        return Math.abs(a * b) / gcdValue;
    }
    static public  long exponentMod(long A, long B, int C)
    {
        // Base cases
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;
        // If B is even
        long y;
        if (B % 2 == 0)
        {
            y = exponentMod(A, B / 2, C);
            y = (y * y) % C;
        }
        // If B is odd
        else
        {
            y = A % C;
            y = (y * exponentMod(A, B - 1, C) % C) % C;
        }
        return ((y + C) % C);
    }
    static public int countPrimes(int n) {

        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        int ans=0;
        for(int i=2;i<=n;i++)
        {
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

        for(int i=3;i<=Math.sqrt(num);i++)
        {
            while(num%i==0)
            {
                ans.add(i); num/=i;
            }
        }
        if(num>2) ans.add(num);

        return ans;
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


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(gcd(4,7));
        int T=sc.nextInt();
//        int T=1;
        while(T-->0){


        }
    }

}
