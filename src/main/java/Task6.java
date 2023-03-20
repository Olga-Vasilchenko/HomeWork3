// 6. Повторить пятый пункт но с LinkedList.

import java.util.*;
import java.util.LinkedList;
import java.util.Collections;
public class Task6 {
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(new Integer[10000]));
        Collections.fill(list1, 0);
        System.out.println(list1);
    }
}