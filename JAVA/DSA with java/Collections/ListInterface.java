package Collections;
//import com.o14Heap.Pair;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        // 1 d ArrayList
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);

        // 2 d arraylist
        List<List<Integer>> lis2=new ArrayList<>();
        for(int i=0;i<3;i++) lis2.add(new ArrayList<>());

        lis2.get(1).add(2);

        // 3d arraylist
       List<List<List<Integer>>> lis3=new ArrayList<>();
       // or
//        List<List<Pair>> adj=new ArrayList<>();
        

    }
}
