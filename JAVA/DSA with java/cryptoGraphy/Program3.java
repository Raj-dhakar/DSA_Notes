package cryptoGraphy;

public class Program3 {

    public static void main(String[] args) {
        f3("hello");
    }
    // Ceaser Cipher encryption adn decryptiona
    private static void f3(String s) {

        // Plain Text to Ceaser Text
        StringBuilder sb=new StringBuilder();
        System.out.println("Plain Text :"+s);
        for(char ch:s.toCharArray()){
            if(ch==' ')
            {
                sb.append(" ");
                continue;}
            if(Character.isUpperCase(ch)){

                char c=(char)((int)(ch-'A'+3)%26+65);
                sb.append(c);
            }
            else{
                char c=(char)((int)(ch-'a'+3)%26+97);
                sb.append(c);
            }
        }
        System.out.println("Encrypted :"+sb.toString());
        s=new String(sb);

        // Ceaser Teext to plain text;

        sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==' ')
            {
                sb.append(" ");
                continue;}
            if(Character.isUpperCase(ch)){

                char c=(char)((int)(ch-'A'-3)%26+65);
                sb.append(c);
            }
            else{
                char c=(char)((int)(ch-'a'-3)%26+97);
                sb.append(c);
            }
        }
        System.out.println("Decrypted :"+sb);
    }
}
