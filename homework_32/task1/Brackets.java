package homework_32.task1;
//Задача: Написать программу, которая проверяет правильность вложенности скобок в строке.
//Описание: Входная строка может содержать следующие скобки: (), {}, [].
// Необходимо проверить, что каждая открывающая скобка имеет соответствующую закрывающую скобку и они правильно вложены.


import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String[] strings = {
                "(){}[]",
                "({[{})",
                "({[]})({[]})",
                "(({}[]"
        };
        for (String arrayElement : strings) {
            System.out.println(arrayElement + " is correct? " + isBracketsCorrect(arrayElement));
        }

        }
    public static boolean isBracketsCorrect(String strings) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < strings.length(); i++) {
            char currentChar = strings.charAt(i);

            if (currentChar == '('){
                stack.push(currentChar);
            } else if (currentChar == ')'){

                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();

    }
}





