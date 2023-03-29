package Java_kity;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static int makeSum(Vector<Integer> v) {
        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            sum += v.elementAt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(8);
        v.add(5); // 자동 박싱. 5 -> Integer.valueof(5)
        v.add(Integer.valueOf(4));
        v.add(-1);

        v.add(2,100);

        System.out.println("들어가 있는 개수는 " + v.size());
        System.out.println("용량은 " + v.capacity());

//        for (int i = 0; i<v.size(); i++) {
////            Integer n =v.get(i);
////            int m = n.intValue();
////            int m = v.get(i); // 자동 언박싱. v.get(i) -> v.get(i).intValue()
//            System.out.print(v.get(i) + " ");
//        }
        // Iterator를 이용하여 출력
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next(); // 자동 언박싱
            System.out.println(n);
        }
        System.out.println();

        System.out.println("합은 " + makeSum(v));
    }
}
