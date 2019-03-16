package pl.edu.wszib.todolist.springtodolist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.todolist.springtodolist.dao.TodoDao;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import javax.annotation.PostConstruct;
import java.util.Calendar;

@Component
public class InitComponent {

    @Autowired
    TodoDao todoDao;

    @PostConstruct
    public void init(){
        Todo todo = new Todo();
        todo.setTitle("Test");
        todo.setStatus(Status.NEW);
        todo.setDueDate(Calendar.getInstance().getTime());
        todoDao.save(todo);
        System.out.println();

    }
}
