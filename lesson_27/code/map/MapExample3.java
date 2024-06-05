package lesson_27.code.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<code.map.Person, code.map.Dog> map = new HashMap<>();

        map.put(new code.map.Person("Ruslan",30), new code.map.Dog("Tuzik",2));
        map.put(new code.map.Person("Oleg",35), new code.map.Dog("Bobik",3));
        map.put(new code.map.Person("Roman",21), new code.map.Dog("Palkan",5));

        System.out.println(map);

        map.put(new code.map.Person("Ruslan",30), new code.map.Dog("Tuzik2", 2));

        System.out.println(map);


    }
}
