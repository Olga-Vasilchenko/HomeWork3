// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(0, 10);
            list.add(number);
        }
        System.out.println(list);

        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        float average = (float)sum/list.size();

        System.out.printf("Максимальное из списка -> %s\n", max);
        System.out.printf("Минимальное из списка -> %s\n", min);
        System.out.printf("Среднее арифметическое -> %s\n", average);
    }
}

