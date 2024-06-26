package consultation_14.code.NotePad;

import consultation_14.code.NotePad.repository.InMemoryRepository;
import consultation_14.code.NotePad.repository.TaskMemoryRepository;
import consultation_14.code.NotePad.service.TaskServiceAdd;
import consultation_14.code.NotePad.service.TaskServiceDelete;
import consultation_14.code.NotePad.service.TaskServiceFind;
import consultation_14.code.NotePad.service.validation.ValidationService;
import consultation_14.code.NotePad.ui.UserMenu;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskMemoryRepository();
        ValidationService validationService = new ValidationService();

        TaskServiceAdd taskServiceAdd = new TaskServiceAdd(repository,validationService);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);
        TaskServiceDelete taskServiceDelete = new TaskServiceDelete(repository);



        UserMenu userMenu = new UserMenu(taskServiceAdd,taskServiceFind);

        userMenu.menu();

    }
}
