package cryptoGraphy;

import java.util.*;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key:");
        String key=sc.next();
        System.out.println("Enter plain Text :");
        String text=sc.next();
        f4(text,key);
    }
    private static void  f4(String s, String key) {

        char[][] matrix = new char[5][5];

        // storing ALL alphabet in HashMap
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        String ss = "";

        // This will handle duplicate in  key
        for (char ch : key.toCharArray()) {
            map1.put(ch, 1);
        }
        for (Character it : map1.keySet())
            ss += it;

        key = ss;

        String all = "";
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), i);
        }
        key = key.toUpperCase();
        s = s.toUpperCase();

        key = key + 'J';

        // Removing key + J from ma
        for (char ch : key.toCharArray()) {
            map.remove(ch);
        }
        key = key.substring(0, key.length() - 1);

        // storing rest all;
        for (Character it : map.keySet())
            all += it;

//        System.out.println(all);

        Map<Character, Program1.Pair> place = new HashMap<>();


        // Storing key in matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (key.length() != 0) {
                    place.put(key.charAt(0), new Program1.Pair(i, j));
                    matrix[i][j] = key.charAt(0);
                    key = key.substring(1);
                } else {
                    place.put(all.charAt(0), new Program1.Pair(i, j));
                    matrix[i][j] = all.charAt(0);
                    all = all.substring(1);
                }
            }
        }

        // Printing play fair cipher matrix
        for (int k = 0; k < 5; k++) System.out.println(Arrays.toString(matrix[k]));

        // Grouped text
        System.out.println(s);
        String str = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {

                str += 'X';
                str += s.charAt(i);
            } else str += s.charAt(i);
        }
        if (str.length() % 2 != 0) str += 'Z';
//        System.out.println(str);
        List<String> group = new ArrayList<>();
        for (int i = 1; i < str.length(); i += 2) {
            String sss = "" + str.charAt(i - 1) + str.charAt(i);
            group.add(sss);
        }
//        System.out.println(group);
        String ans = "";

        for (int i = 0; i < group.size(); i++) {
            String s1 = group.get(i);
            Program1.Pair p1 = place.get(s1.charAt(0));
            Program1.Pair p2 = place.get(s1.charAt(1));


            if (p1.row == p2.row) {
                ans += matrix[p1.row][(p1.col + 1) % 5];
                ans += matrix[p2.row][(p2.col + 1) % 5];
            } else if (p1.col == p2.col) {
                ans += matrix[(p1.row + 1) % 5][p1.col];
                ans += matrix[(p2.row + 1) % 5][p2.col];
            } else {
                if (p1.row < p2.row) {
                    if (p1.col < p2.col) {
                        ans += matrix[(p1.row)][p2.col];
                        ans += matrix[p2.row][p1.col];
                    } else {
                        ans += matrix[(p2.row)][p1.col];
                        ans += matrix[p1.row][p2.col];
                    }
                } else {
                    if (p1.col > p2.col) {
                        ans += matrix[(p2.row)][p1.col];
                        ans += matrix[p1.row][p2.col];
                    } else {
                        ans += matrix[(p1.row)][p2.col];
                        ans += matrix[p2.row][p1.col];
                    }
                }
            }
            ans+=" ";
        }
        System.out.println("ENCRYPTED "+ans);
    }
}
