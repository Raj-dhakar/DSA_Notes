package cryptoGraphy;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Program1 {

    public static void main(String[] args) {
        f1("Hello World");
    }

    // play fair cipher

    static class Pair{
        int row, col;

        @Override
        public String toString() {
            return "Pair{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }

        Pair(int _row, int _col){
            row=_row;
            col=_col;
        }
    }

    // XOR with 0
    static public void f1(String s){

        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){

            sb.append((char)(ch^0));
        }
        System.out.println(sb);
    }
}
