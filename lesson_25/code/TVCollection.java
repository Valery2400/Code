package code;
//создать коллекцию
//добавить 3 элемента
//распечатать коллекцию
//удалить один элемент - первый из всех у кого совпадает производитель

import java.util.ArrayList;

public class TVCollection {
    public static void main(String[] args) {

        ArrayList<TV> tvs = new ArrayList<>();

        System.out.println(tvs);
        System.out.println(tvs.size());

        tvs.add(new TV("SONY", 42));
        tvs.add(new TV("JVC", 37));
        tvs.add(new TV("LG", 55));
        tvs.add(new TV("SONY", 72));
        tvs.add(new TV("JVC", 47));

        for (int i = 0; i < tvs.size(); i++) {
            System.out.println(tvs.get(i));
        }

//            System.out.println(tvs);
//            System.out.println(tvs.size());
        System.out.println();

        String producerForDelete = "SONY";

        for (int i = 0; i < tvs.size(); i++) {
            TV currentTV = tvs.get(i);
            if (currentTV.getProducer().equals(producerForDelete)) {
                tvs.remove(i);
                break;
            }
        }
        for (int i = 0; i < tvs.size(); i++) {
            System.out.println(tvs.get(i));
        }


    }
}
