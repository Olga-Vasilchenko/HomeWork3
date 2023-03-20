// 7. Сравнить время работы пятого и шестого пунктов.

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Task7 {
    public static void main(String[] args){
        String str = "";
        StringBuilder builder = new StringBuilder();

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(new Integer[10000]));
        Collections.fill(list, 0);
        System.out.println(list);

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Время работы ArrayList = " + (end - begin));
        System.out.println();

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(new Integer[10000]));
        Collections.fill(list1, 0);
        System.out.println(list1);

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += Character.getName(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Время работы LinkedList = " + (end1 - begin1));
        }
    }
