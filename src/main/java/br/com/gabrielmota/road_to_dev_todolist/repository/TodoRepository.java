package br.com.gabrielmota.road_to_dev_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielmota.road_to_dev_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
