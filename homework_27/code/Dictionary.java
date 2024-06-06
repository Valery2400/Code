package code;
//Словарь перевода слов:
//
//Создайте HashMap, где ключом является слово на английском языке, а значением - варианты его перевода на другой язык.
//Когда вы задаете английское слово, то вы можете добавить несколько вариантов перевода
//(постарайтесь процесс добавления перевода сделать отдельным методом,
//то есть ваш метод будет получать два параметра - английское слово и его перевод)
//Добавьте в словарь пять слов.
//Выведите перевод слова, введенного пользователем.

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        List<String> meaningWord1 = new ArrayList<>();
        List<String> meaningWord2 = new ArrayList<>();
        List<String> meaningWord3 = new ArrayList<>();
        List<String> meaningWord4 = new ArrayList<>();
        List<String> meaningWord5 = new ArrayList<>();

        meaningWord1.add("белый");
        meaningWord1.add("беловатый");
        meaningWord1.add("белизна");

        meaningWord2.add("желтый");
        meaningWord2.add("желатин");
        meaningWord2.add("желток");

        meaningWord3.add("синий");
        meaningWord3.add("синева");
        meaningWord3.add("голубой");

        meaningWord4.add("красный");
        meaningWord4.add("красняк");
        meaningWord4.add("зарево");

        meaningWord5.add("черный");
        meaningWord5.add("чернь");
        meaningWord5.add("чернота");

        HashMap<String, List<String>> vocabulary = new HashMap<>();

        vocabulary.put("white", meaningWord1);
        vocabulary.put("yellow", meaningWord2);
        vocabulary.put("blue", meaningWord3);
        vocabulary.put("red", meaningWord4);
        vocabulary.put("black", meaningWord5);

        System.out.println(vocabulary);



    }

//    public static void addNewMeaning(String[] englishWord,String russianMeaning) {

//
//
//
//    }



}
