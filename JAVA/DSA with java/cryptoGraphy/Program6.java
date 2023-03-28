package cryptoGraphy;

import java.util.Arrays;
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Printing Vigenere square");
        char[][] map=MAP();

        System.out.println("Enter plain text");
        String plain_text=sc.next();
        plain_text=plain_text.toUpperCase();

        System.out.println("Enter the key");
        String key=sc.next();
        key=key.toUpperCase();

        if(key.length()<plain_text.length()){
            int end=plain_text.length()-key.length();
            int mod=key.length();
            for(int i=0;i<end;i++){
                key+=key.charAt(i%mod);
            }
        }
//        System.out.println(key);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<plain_text.length();i++){
            sb.append(map[plain_text.charAt(i)-'A'][key.charAt(i)-'A']);
        }
        System.out.println("Encrypted key: "+sb);
    }

    private static char[][] MAP() {

        char[][] ch=new char[26][26];

        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                ch[i][j]=(char)('A'+((j+i)%26));
            }
            System.out.println(Arrays.toString(ch[i]));
        }
        return ch;
    }
}
