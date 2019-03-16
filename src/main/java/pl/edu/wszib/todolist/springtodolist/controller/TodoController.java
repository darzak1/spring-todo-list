package pl.edu.wszib.todolist.springtodolist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.todolist.springtodolist.dto.TodoDTO;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<TodoDTO> getAll(){
        return todoService.findAll();
    }

    @GetMapping("/todo/{id}")
    public TodoDTO get(@PathVariable int id){
        return todoService.find(id);
    }
    @DeleteMapping("/todo/{id}")
    public TodoDTO delete(@PathVariable int id){
        return todoService.remove(id);
    }
    @PostMapping("/todo")
    public TodoDTO add(@RequestBody TodoDTO todoDTO){
        return todoService.add(todoDTO);
    }
    @PutMapping("/todo")
    public TodoDTO update(@RequestBody TodoDTO todoDTO){
        return todoService.update(todoDTO);
    }
    @GetMapping("/todos/upcomming")
    public  List<TodoDTO> upcomming() {
        return (List<TodoDTO>) todoService.upcoming();
    }
    @GetMapping("/todos/count/{status}")
    public int count (@PathVariable Status status){
        return todoService.count(status);
    }
    @GetMapping("/todos/search/{status}")
    public List<TodoDTO> search (@PathVariable Status status){
        return todoService.search(status);
    }


}
