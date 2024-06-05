package consultation_14.code.NotePad.service;

import consultation_14.code.NotePad.dto.ClientRequest;
import consultation_14.code.NotePad.dto.ClientResponse;
import consultation_14.code.NotePad.entity.Task;
import consultation_14.code.NotePad.repository.InMemoryRepository;
import consultation_14.code.NotePad.service.validation.ValidationService;

import java.util.List;
import java.util.Optional;

public class TaskServiceDelete {

    private final InMemoryRepository repository;


    public TaskServiceDelete(InMemoryRepository repository) {
        this.repository = repository;

    }

    public boolean deleteByTask(Task task){

        Optional<Task> foundedOptionalTask = repository.findById(task.getId());

        if (foundedOptionalTask.isPresent()) {
            return repository.delete(task);
        } else {
            return false;
        }
    }
}
