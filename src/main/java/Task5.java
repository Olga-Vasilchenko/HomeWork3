// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.

import java.util.*;
import java.util.ArrayList;
public class Task5 {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(new Integer[10000]));
        Collections.fill(list, 0);
        System.out.println(list);
    }
}

