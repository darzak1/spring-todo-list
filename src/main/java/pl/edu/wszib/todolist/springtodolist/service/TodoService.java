package pl.edu.wszib.todolist.springtodolist.service;

import pl.edu.wszib.todolist.springtodolist.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    List<TodoDTO> findAll();
    TodoDTO find (Integer id);
    TodoDTO add (TodoDTO dto);
    TodoDTO update (TodoDTO dto);
    TodoDTO remove (Integer id);
    List<TodoDTO> upcoming ();






}
