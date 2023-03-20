// 1. Реализовать алгоритм сортировки списков компаратором.

import java.util.*;
public class Task1 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(9);
        list.forEach(n -> System.out.print(n+","));
        System.out.println();

        Collections.sort(list);
        list.forEach(n -> System.out.print(n+","));
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                if ((t1-t0)%2 != 0) return 1;
                else if ((t1-t0)%2 == 0) return -1;
                return 0;
            }
        });
        System.out.println();
    }
}
