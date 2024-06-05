package homework_32.task2;

//Задача: Написать программу, которая реализует очередь для хранения истории браузера.
//Описание: Необходимо добавить ссылки в очередь, а также возможность удалять последние
// посещенные страницы.

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory {
    private Deque<String> history;

    public BrowserHistory() {
        history = new LinkedList<>();//Инициализируется пустой очередью history, используя LinkedList.
    }

    public void visit(String url) {//Метод visit добавляет новую ссылку в конец очереди.
        history.addLast(url);
        System.out.println("Visited: " + url);
    }

    public String back() {//Метод back удаляет последнюю добавленную ссылку из очереди и возвращает ее. Если очередь пуста, выводится сообщение об этом.
        if (!history.isEmpty()) {
            String lastUrl = history.removeLast();
            System.out.println("Removed from history: " + lastUrl);
            return lastUrl;
        } else {
            System.out.println("History is empty");
            return null;
        }
    }

    public void showHistory() {//Метод showHistory выводит все ссылки в истории. Если история пуста, выводится соответствующее сообщение.
        if (!history.isEmpty()) {
            System.out.println("History:");
            for (String url : history) {
                System.out.println(url);
            }
        } else {
            System.out.println("History is empty");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();//Создается объект BrowserHistory.
        browserHistory.visit("https://www.google.com");//Добавляются несколько ссылок.
        browserHistory.visit("https://www.youtube.com");
        browserHistory.visit("https://www.github.com");
        browserHistory.showHistory();//Печатается текущая история.

        browserHistory.back();//Удаляются последние посещенные страницы по очереди.
        browserHistory.showHistory();

        browserHistory.back();
        browserHistory.showHistory();
        browserHistory.back();

        browserHistory.back(); // Попытка удалить страницу, когда история уже пуста
    }
}
