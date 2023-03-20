// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.*;
import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(0, 10);
            list.add(number);
        }
        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(list);
    }
}

