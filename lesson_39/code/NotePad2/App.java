package lesson_39.code.NotePad2;

import lesson_39.code.NotePad2.repository.InMemoryRepository;
import lesson_39.code.NotePad2.repository.TaskMemoryRepository;
import lesson_39.code.NotePad2.service.TaskServiceAdd;
import lesson_39.code.NotePad2.service.TaskServiceDelete;
import lesson_39.code.NotePad2.service.TaskServiceFind;
import lesson_39.code.NotePad2.service.validation.ValidationService;
import lesson_39.code.NotePad2.ui.UserMenu;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskMemoryRepository();
        ValidationService validationService = new ValidationService();

        TaskServiceAdd taskServiceAdd = new TaskServiceAdd(repository,validationService);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);
        TaskServiceDelete taskServiceDelete = new TaskServiceDelete(repository);

        UserMenu userMenu = new UserMenu(taskServiceAdd,taskServiceFind,taskServiceDelete);

        userMenu.menu();


    }
}
