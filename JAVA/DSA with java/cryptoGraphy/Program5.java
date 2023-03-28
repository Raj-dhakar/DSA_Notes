package cryptoGraphy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        // key=quickness
        // plain_text=paymoremoney

        Scanner sc=new Scanner(System.in);

        // To encrypt use
        // c = KP mod 26   K=Key P= plain  text

        // Enter key
        System.out.println("Enter the Key of length perfect square");
        String key=sc.next();
        key=key.toUpperCase();

        int n=(int)Math.sqrt(key.length());
        int[][] key_matrix=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                key_matrix[i][j]=key.charAt(0)-'A';
                key=key.substring(1);
            }
        }

        // if the key is of n*n matrix, plain text should be converted into vector of length n;
        // if the vector end with few letter add a filler letter
        System.out.println("Enter the plain Text :");
        String plain_text=sc.next();
        plain_text=plain_text.toUpperCase();
        StringBuilder ans=new StringBuilder();
        StringBuilder s=new StringBuilder();
        List<String> vector=new ArrayList<>();
        int len=0;

        for(char ch:plain_text.toCharArray()){

            len++;
            s.append(ch);
            if(len==n){
                vector.add(s.toString());
                s=new StringBuilder();
                len=0;
            }
        }


        // checking for last vector element if it is small add extra stuff to it
        String s1= vector.get(vector.size()-1);
        if(s1.length()<n){
            for(int i=s1.length();i<n;i++){
                s1+=('A'+i);
            }
            vector.set(vector.size()-1,s1);
        }
        System.out.println(""+vector);

        for(String it:vector){
            String s2=it;
            String store="";
            for(int i=0;i<n;i++){
                int ch=0;
                for(int j=0;j<n;j++){
                    ch+=((s2.charAt(j)-'A')*key_matrix[i][j])%26;
                }
                ch%=26;
                ans.append((char)(ch+'A'));
            }
        }

        System.out.println("Cipher Text :"+ans);

    }
}