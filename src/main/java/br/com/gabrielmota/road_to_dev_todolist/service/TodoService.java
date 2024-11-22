package br.com.gabrielmota.road_to_dev_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gabrielmota.road_to_dev_todolist.entity.Todo;
import br.com.gabrielmota.road_to_dev_todolist.repository.TodoRepository;

@Service
public class TodoService {
    
    private TodoRepository todoRepository;
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
     
    List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    
    List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    List<Todo> uptate(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}