// 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.

import java.util.ArrayList;
public class Task4 {
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

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(7);
        list1.add(11);
        list1.add(14);
        list1.add(8);
        list1.add(6);
        list1.add(18);
        list1.forEach(n -> System.out.print(n+","));
        System.out.println();

        list1.removeAll(list);
        list1.forEach(n -> System.out.print(n +","));
        System.out.println();

        list.addAll(list1);
        list.forEach(n -> System.out.print(n +","));
        System.out.println();
    }
}
