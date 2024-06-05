package Code;

import java.util.*;

public class HashSetExample5 {
    public static void main(String[] args) {
 /*
    Написать программу, которая сравнивает две коллекции Set (множество, набор)
    и выводит на экран:
    - элементы, которые присутствуют ТОЛЬКО в первой коллекции;
    - элементы, которые присутствуют ТОЛЬКО во второй коллекции;
    - элементы, которые присутствуют в обеих коллекциях;
     */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        List <Integer> uniqset1 = new ArrayList<>();
        List <Integer> uniqset2 = new ArrayList<>();
        List <Integer> similarset = new ArrayList<>();

        for (Integer num : set1) {
            if (!set2.contains(num)) {
                uniqset1.add(num);
            } else {
                similarset.add(num);
            }
        }
        for (Integer num : set2) {
            if (!set1.contains(num)) {
                uniqset2.add(num);
            } else {
                similarset.add(num);
            }
        }
        System.out.println(uniqset1);
        System.out.println(uniqset2);
        System.out.println(similarset);

    }
}
