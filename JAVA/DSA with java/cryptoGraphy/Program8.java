package cryptoGraphy;

public class Program8 {

    public static void main(String[] args) {

        int p=7,q=11,e=17,M=8;

        // calculate n=p*q
        int n=p*q;

        // calculate phi(n)
        int _n=(p-1)*(q-1);

        // calculate e
        // here it is alredy given

        // calculate d
        int d=modInverse(e,_n);
        System.out.println("D="+d);

        // public key is {e,n}
        // private key is {d,n}

        // encryption
        // C=M^e mod n
        int C= (int) exponentMod(M,e,n);
        System.out.println("Encryption "+C);

        // decryption
        System.out.println("Decryption "+exponentMod(C,d,n));
    }
    static int modInverse(int A, int M)
    {

        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return 1;
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
}
