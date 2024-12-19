package algorithm.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));

        System.out.println(list.get(2));
        list.set(0, 3);
        System.out.println(list.get(0));

        list.add(4);
        System.out.println(list.get(3));

        list.add(2, 10);
        System.out.println(list.get(2));



    }
}
