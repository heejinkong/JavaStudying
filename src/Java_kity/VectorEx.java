package Java_kity;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(8);
        v.add(5); // 자동 박싱. 5 -> Integer.valueof(5)
        v.add(Integer.valueOf(4));
        v.add(-1);

        v.add(2,100);

        System.out.println("들어가 있는 개수는 " + v.size());
        System.out.println("용량은 " + v.capacity());

        for (int i = 0; i<v.size(); i++) {
//            Integer n =v.get(i);
//            int m = n.intValue();
//            int m = v.get(i); // 자동 언박싱. v.get(i) -> v.get(i).intValue()
            System.out.print(v.get(i) + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            sum += v.elementAt(i);
        }
        System.out.println("합은 " + sum);
    }
}
