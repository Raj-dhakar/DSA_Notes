package cryptoGraphy;

public class Program2 {

    public static void main(String[] args) {
        f2("Hello World");
    }
    // XOR and AND with 127
    private static void f2(String s) {

        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){

            sb.append((char)(ch&127));
        }
        System.out.println(sb);

        sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            sb.append((char)(ch^127));
        }
        System.out.println(sb);
    }
}
