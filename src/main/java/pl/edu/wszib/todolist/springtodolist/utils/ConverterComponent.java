package pl.edu.wszib.todolist.springtodolist.utils;



import javafx.scene.input.DataFormat;
import org.springframework.stereotype.Component;
import pl.edu.wszib.todolist.springtodolist.dto.TodoDTO;
import pl.edu.wszib.todolist.springtodolist.model.Status;
import pl.edu.wszib.todolist.springtodolist.model.Todo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
public class ConverterComponent {


    private DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");

    public TodoDTO convert (Todo todo){
        TodoDTO dto = new TodoDTO();
        dto.id = todo.getId();
        dto.title = todo.getTitle();
        dto.status = todo.getStatus().toString();
        dto.dueDate = dataFormat.format(todo.getDueDate());
        return dto;
    }

    public Todo convert(TodoDTO dto){
        Todo todo = new Todo();
        todo.setId(dto.id);
        todo.setTitle(dto.title);
        todo.setStatus(Status.valueOf(dto.status));
        try {
            todo.setDueDate(dataFormat.parse(dto.dueDate));
        } catch (ParseException e) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0);
            todo.setDueDate(calendar.getTime());
        }
        return todo;
    }


}
