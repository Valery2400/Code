package lesson_27.code.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, code.map.Dog> map = new HashMap<>();

        map.put(1,new code.map.Dog("Tuzik",2));
        map.put(2,new code.map.Dog("Bobik",3));
        map.put(3,new code.map.Dog("Palkan",5));

        System.out.println(map);

        code.map.Dog dogFromCollection = map.get(2);

        System.out.println(dogFromCollection);

        map.put(10,dogFromCollection);

        System.out.println(map);

    }
}
