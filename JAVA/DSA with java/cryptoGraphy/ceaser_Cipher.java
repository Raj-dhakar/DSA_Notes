package cryptoGraphy;

public class ceaser_Cipher {

    public static void main(String[] args) {

        System.out.println(CeaserCipher("A CAT SLEEP"));
    }

  static   public String CeaserCipher(String s){

        StringBuilder sb=new StringBuilder();
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
        return sb.toString();
    }
}
